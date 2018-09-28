package JGVPracticaAlumnos;

public class Alumno {

    //Tenga tres atributos private de tipo Asignatura.
    private Asignatura asig1, asig2, asig3;



    //Tenga un constructor de tipo Asignatura .
    public Alumno(Asignatura asig1, Asignatura asig2, Asignatura asig3) {
        this.asig1 = asig1;
        this.asig2 = asig2;
        this.asig3 = asig3;
    }


    //Tenga un constructor de tipo int.
    public Alumno(int asig1, int asig2, int asig3) {
        this.asig1 = new Asignatura(asig1);
        this.asig2 = new Asignatura(asig2);
        this.asig3 = new Asignatura(asig3);
    }


    //Tenga un getter para cada uno de los atributos.
    public Asignatura getAsig1() {

        return asig1;
    }

    public void setAsig1(Asignatura asig1) {

        this.asig1 = asig1;
    }

    public Asignatura getAsig2() {

        return asig2;
    }

    public void setAsig2(Asignatura asig2) {

        this.asig2 = asig2;
    }

    public Asignatura getAsig3() {

        return asig3;
    }

    public void setAsig3(Asignatura asig3) {

        this.asig3 = asig3;
    }
}
