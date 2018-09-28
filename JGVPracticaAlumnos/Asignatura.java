package JGVPracticaAlumnos;

public class Asignatura {

    //Tenga dos atributos private de tipo int (el identificador) y de tipo double (la calificación).
    private int id;
    private double calificacion;



    //Tenga un constructor con un parámetro de tipo int.
    public Asignatura(int id) {
        this.id = id;
    }


    //Tenga un getter para cada uno de los atributos.
    public int getId() {
        return id;
    }
    public double getCalificacion() {
        return calificacion;
    }


    //Tenga un setter para la calificación.
    public void setId(int id) {
        this.id = id;
    }
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }



}
