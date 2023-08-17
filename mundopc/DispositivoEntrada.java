/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gm.mundopc;

/**
 *
 * @author ASUS-TUF
 */
public class DispositivoEntrada {
    private String tipoDeEntrada;
    private String marca;
    //CONSTRUCTOR PARA INICIALIZAR VARIABLES
    public DispositivoEntrada(String tipoDeEntrada, String marca){
    this.tipoDeEntrada=tipoDeEntrada;
    this.marca=marca;
    }
    public String getTtipoDeEntrada(){
    return tipoDeEntrada;
    }
    public void setTipoDeEntrada(String tipoDeEntrada){
    this.tipoDeEntrada=tipoDeEntrada;
    }
    public String getMarca(){
    return marca;
    }
    public void setMarca(String marca){
    this.marca=marca;
    }
    @Override
    public String toString(){
    return "DispositivoEntrada{marca="+marca+",tipoDeEntrada="+tipoDeEntrada+"}";
    }
    }

