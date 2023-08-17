/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundopc;
//IMPRTANDO PAQUETE com.gm.mundopc
import com.gm.mundopc.*;
/**
 *
 * @author ASUS-TUF
 */
public class MundoPC {
    public static void main(String args[]){
        //CREACIÓN DE OBJETOS 
        Monitor monitor1 =new Monitor("Toshiba",13);
        Raton raton1=new Raton("USB","MEGA");
        Computadora compu1=new Computadora("Computadora 1",monitor1,raton1,teclado1);
    //ORDENES 
    Orden orden1=new Orden();
    orden1.agregarComputadora(compu1);
    orden1.mostrarOrden();
    }
}
