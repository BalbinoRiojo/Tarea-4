package com.mycompany.hotel.objetos;

public class Habitacion {
    private int idHabitacion;
    private String tipo;
    private int numeroCamas;
    private double costePorDia;

    public Habitacion(int idHabitacion, String tipo, int numeroCamas, double costePorDia) {
        this.idHabitacion = idHabitacion;
        this.tipo = tipo;
        this.numeroCamas = numeroCamas;
        this.costePorDia = costePorDia;
    }

    // Getters y setters

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public double getCostePorDia() {
        return costePorDia;
    }

    public void setCostePorDia(double costePorDia) {
        this.costePorDia = costePorDia;
    }
}
