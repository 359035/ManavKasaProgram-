/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manavkasaprogrami;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;
public class ManavKasaProgrami {

    /**
     * @param args the command line arguments
     */
    /*Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patl�can : 5,00 TL*/
    public static void main(String[] args) {
        // TODO code application logic here
        double armut,elma,domates,muz,patlican;
        double tutar;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Ka� kilo armut ald�n�z?");
        armut=input.nextDouble();
        
        System.out.print("Ka� kilo elma ald�n�z?");
        elma=input.nextDouble();
        
        System.out.print("Ka� kilo domates ald�n�z?");
        domates=input.nextDouble();
        
        System.out.print("Ka� kilo muz ald�n�z?");
        muz=input.nextDouble();
        
        System.out.print("Ka� kilo patl�can ald�n�z?");
        patlican=input.nextDouble();
        
        tutar=(armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5.00);
        System.out.println("Toplam Tutar="+tutar);
    }
    
}
