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
    private double tama�o;
    private static int contadorMonitores;
    
    private Monitor(){
    idMonitor=++contadorMonitores;
    }
    
    //Constructor que inicializa
   public Monitor(String marca,double tama�o){
   this();
   this.marca=marca;
   this.tama�o=tama�o;
   }
    public String getMarca(){
    return marca;
    }
    public void setMarca(String marca){
    this.marca=marca;
    }
    public double getTama�o(){
    return tama�o;
    }
    public void setTama�o(double tama�o){
    this.tama�o=tama�o;
    }
    //M�TODO PARA CONCATENAR LAS VARIABLES Y DEVOLVER UNA CADENA
    @Override
public String toString(){
return "Monitor{"+"idMonitor="+idMonitor+",marca="+marca+",tama�o="+tama�o+"}";
}
    }
