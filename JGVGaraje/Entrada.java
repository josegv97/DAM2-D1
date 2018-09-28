package JGVGaraje;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        new Entrada().inicio();

    }

    private void inicio() {

        Scanner sca;
        int opcion;
        Menu menu = new Menu();
        Gestion gestion = new Gestion(); //para poder utuilizar los metodos de gestion
        Coche coche; //para utilizar un objeto tipo coche, luego le damos valor


        do {
            opcion = 0;
            System.out.println(menu.menuGenerico());
            sca = new Scanner(System.in);
            opcion = sca.nextInt();
            String matricula;

            switch (opcion) {

                case 1:
                    coche = new Coche();
                    System.out.println("ESCRIBE UNA MARCA: ");
                    coche.setMarca(sca.next());
                    System.out.println("ESCRIBE UN MODELO: ");
                    coche.setModelo(sca.next());
                    System.out.println("ESCRIBE UNA MATRICULA: ");
                    coche.setMatricula(sca.next());
                    System.out.println("ESCRIBE LOS CABALLOS DEL COCHE: ");
                    coche.setMotor(new Motor(sca.nextInt())); //al ser objeto se trata asi, se llama a su constructor y ahi meter su valor
                    System.out.println("ESCRIBE EL PRECIO DE LA AVERIA: ");
                    coche.setpAveria(sca.nextDouble());//aqui es dpoible poque no es un string sabes?
                    coche.setEstado(false);
                    System.out.println(gestion.añadirCoche(coche)); //metodo dentro de gestion para añladir un choche
                    coche = null;
                    break;

                case 2:
                    System.out.println("INTRODUCE UNA MATRICULA: ");
                    matricula = sca.next();
                    System.out.println(gestion.entregarCoche(matricula));
                    matricula = null;
                    break;

                case 3:
                    System.out.println(gestion.listarCoche());
                    break;

                case 4:
                    System.out.println(gestion.preciosArreglos());
                    break;

                case 5:
                    System.out.println("INTRODUCE UNA MATRICULA: ");
                    matricula = sca.next();
                    System.out.println(gestion.buscarCoche(matricula));
                    matricula = null;
                    break;

                case 6:
                    System.out.println(gestion.exportarCoches());
                    break;
            }

        }while(opcion != 0);

        sca.close();
        sca = null;
        menu = null;
        gestion = null;
        opcion = Integer.parseInt(null);
    }
}
