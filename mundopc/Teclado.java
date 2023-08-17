/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gm.mundopc;

/**
 *
 * @author ASUS-TUF
 */
public class Teclado extends DispositivoEntrada{
private final int idTeclado;
private static int contadorTeclado;

public Teclado(String tipoEntrada, String marca){
super(tipoEntrada,marca);
idTeclado=++contadorTeclado;
}
@Override
public String toString(){
return "Raton{"+"idRaton="+idTeclado+","+super.toString();
}

}