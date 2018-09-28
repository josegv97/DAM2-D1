package JGVGaraje;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class Gestion {

    Hashtable<String, Coche> listaCoches = new Hashtable();
    double totalCobrado = 0;
    File f = new File("/src/JGVgaraje/ficheros/coches.obj");

    //1. Añadir coche
    protected String añadirCoche (Coche c) {

        if (listaCoches.get(c.getMatricula()) != null) {
            return "ESTE COCHE YA ESTA REGISTRADO";
        }
        else {
            listaCoches.put(c.getMatricula(), c);
            return "ESTE COCHE HA SIDO REGISTRADO CON EXITO";
        }
    }
    //2. Entregar coche
    protected String entregarCoche (String matricula) {

        if (listaCoches.get(matricula) == null) {
            return "Coche no registrado";
        }
        else {
            listaCoches.get(matricula).setEstado(true);
            totalCobrado += listaCoches.get(matricula).getpAveria();
            listaCoches.get(matricula).setpAveria(0);
            return "Entregado con exito";
        }
    }

    // 3. Listar coche
    protected String listarCoche () {

        if (listaCoches.size()==0) {
            return "EL LISTADO DE COCHES ESTA VACIO";
        }
        else {
            Enumeration<Coche> Listado = listaCoches.elements();
            String salida = "";

            while (Listado.hasMoreElements()) {
                salida += "MARCA: " + Listado.nextElement().getMarca() + "\n" +
                        "MODELO: " + Listado.nextElement().getModelo() + "\n" +
                        "MATRICULA: " + Listado.nextElement().getMatricula() + "\n" +
                        "CV: " + Listado.nextElement().getMotor().getCv()  + "\n" +
                        "ESTADO: " + Listado.nextElement().traductor() + "\n";
            }

            return salida;
        }
    }

    //4. Mostrar precios de las averia
    protected String preciosArreglos () {

        return "TOTAL COBRADO: " + totalCobrado;
    }


    //5.Buscar coche
    protected String buscarCoche (String matricula) {

        if (listaCoches.size()==0) {
            return "EL LISTADO DE COCHES ESTA VACIO";
        }
        else {

            String salida = "MARCA: " + listaCoches.get(matricula).getMarca() + "\n" +
                    "MODELO: " + listaCoches.get(matricula).getModelo() + "\n" +
                    "MATRICULA: " + listaCoches.get(matricula).getMatricula() + "\n" +
                    "CV: " + listaCoches.get(matricula).getMotor().getCv()  + "\n" +
                    "ESTADO: " + listaCoches.get(matricula).traductor() + "\n";
            return salida;
        }
    }
    //6. Exportar coches
    protected String exportarCoches () {

        ObjectOutputStream exportar = null;

        Enumeration<Coche> Listado = listaCoches.elements();

        ArrayList<Coche> ArrayLista = new ArrayList<>();

        while (Listado.hasMoreElements()) {

            ArrayLista.add(Listado.nextElement());
        }

        if (ArrayLista.size() == 0) {

            return "LA LISTA ESTA VACIA";
        }

        else {

            try {
                exportar = new ObjectOutputStream(new FileOutputStream(f));
                exportar.writeObject(ArrayLista);
            }
            catch (IOException e) {
                return "ERROR EN LA EXPORTACION";
            }
            finally {

                try {
                    exportar.close();
                }
                catch (IOException e) {
                    return "ERROR EN LA EXPORTACION";
                }
            }
            return "EXPORTACION COMPLETADA CON EXITO";
        }
    }
}
