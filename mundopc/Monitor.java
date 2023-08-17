/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gm.mundopc;

/**
 *
 * @author ASUS-TUF
 */
public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;
    
    private Monitor(){
    idMonitor=++contadorMonitores;
    }
    
    //Constructor que inicializa
   public Monitor(String marca,double tamaño){
   this();
   this.marca=marca;
   this.tamaño=tamaño;
   }
    public String getMarca(){
    return marca;
    }
    public void setMarca(String marca){
    this.marca=marca;
    }
    public double getTamaño(){
    return tamaño;
    }
    public void setTamaño(double tamaño){
    this.tamaño=tamaño;
    }
    //MÉTODO PARA CONCATENAR LAS VARIABLES Y DEVOLVER UNA CADENA
    @Override
public String toString(){
return "Monitor{"+"idMonitor="+idMonitor+",marca="+marca+",tamaño="+tamaño+"}";
}
    }
