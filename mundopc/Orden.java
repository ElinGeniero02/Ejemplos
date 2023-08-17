/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gm.mundopc;

/**
 *
 * @author ASUS-TUF
 */
public class Orden {
    private final int idOrden;
    //ARREGLO COMPUTADORAS
    private final Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    //máximo de elementos del arreglo
      private static final int maxComputadoras=10;
      public Orden(){
      this.idOrden=++contadorOrdenes;
      //INSTANCIA DE ARREGLO DE COMP
      computadoras=new Computadora[maxComputadoras];
      }
      public void agregarComputadora(Computadora computadora){
     if(contadorComputadoras<maxComputadoras){
     computadoras[contadorComputadoras++]=computadora;
     }
     else{
     System.out.println("Se ha superado el máximo de productos:"+maxComputadoras);
     }
      }
      public void mostrarOrden(){
      System.out.println("Orden #:"+idOrden);
      System.out.println("Computadoras de la orden #"+idOrden+":");
      for (int i=0;i<contadorComputadoras;i++){
      System.out.println(computadoras[i]);
      }
      }
      }

