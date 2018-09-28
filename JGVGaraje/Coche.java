package JGVGaraje;

import java.io.Serializable;

public class Coche implements Serializable { //para poder exportar a un puto ,obj


    String marca;
    String modelo;
    String matricula;
    double pAveria;
    boolean estado;

    Motor motor; // coche esta formado por un atributo motor, soplo por eso hago una motor y luego se inicializa aquio


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getpAveria() {
        return pAveria;
    }

    public void setpAveria(double pAveria) {
        this.pAveria = pAveria;
    }

    public boolean EstadoG() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    protected String traductor() {
        if (EstadoG()) {
            return "ENTREGADO";
        }
        else {
            return "PENDIENTE";
        }
    }

    //constructor melon
    public Coche(String marca, String modelo, String matricula, double pAveria, boolean estado, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.pAveria = pAveria;
        this.estado = estado;
        this.motor = motor;
    }

    public Coche() {
    }
}
