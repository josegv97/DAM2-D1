package JGVPracticaAlumnos;

public class Profesor {


    //Tenga un método ponerNotas que recibe un parámetro de tipo Alumno y que no devuelve nada.
    //Pondrá una calificación aleatoria a cada una de las asignaturas del alumno.

    public void ponerNotas (Alumno a){

        a.getAsig1().setCalificacion(Math.random()*11); //alumno coje una asignatura mas su calificacion al aleatoriamente;
        a.getAsig2().setCalificacion(Math.random()*11);
        a.getAsig3().setCalificacion(Math.random()*11);
    }


    // método calcularMedia con parámetro de tipo Alumno y devuelve un double.
    public double calcularMedia (Alumno m){

        return m.getAsig1().getCalificacion()+m.getAsig2().getCalificacion()+m.getAsig3().getCalificacion()/3;
        //cojo el Asig1 mas su calificacion y asi tendre la asignatura
    }

}
