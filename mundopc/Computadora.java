/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gm.mundopc;

/**
 *
 * @author ASUS-TUF
 */
public class Computadora {
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;    

//Contructor vacío
private Computadora() {
    idComputadora=++contadorComputadoras;
}
//Constructor que incializa las variables
public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
   this();
   this.nombre=nombre;
   this.monitor=monitor;
   this.raton=raton;
   this.teclado=teclado;
   }
//CREANDO GET Y SET
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre=nombre;
}
public Monitor getMonitor(){
return monitor;
}
public void setMonitor(Monitor monitor){
    this.monitor=monitor;
}
public Teclado getTeclado(){
    return teclado;
}
public void setTeclado(Teclado teclado){
    this.teclado=teclado;
}
public Raton getRaton(){
    return raton;
}
public void setRaton(Raton raton){
    this.raton=raton;
}
@Override
public String toString(){
    return "Computadora{ idComputadora="+idComputadora+", nombre="+nombre+",monitor="+monitor+",teclado="+teclado+",raton="+raton+"}";
}
}




