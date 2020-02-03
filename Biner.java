/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biner;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Biner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int []x;
        int []y;
        int []z;
        
        x = new int [10];
        y = new int [10];
        z = new int [10];
        
        int bil;
        int bil2;
        int konversi= 0;
        int pangkat = 1;
        
        System.out.print("input bilangan 1 = ");
        bil = input.nextInt();
        for (int i=9;i>0;i--){
        x[i]=bil%2;
        bil=bil/2;
        }
        for (int j=0;j<10;j++){
            System.out.print(x[j]+" ");
        }
        
        System.out.println("");
        
        System.out.print("input bilangan 2 = ");
        bil2 = input.nextInt();
        for (int i=9;i>0;i--){
        y[i]=bil2%2;
        bil2=bil2/2;
        }
        for (int j=0;j<10;j++){
            System.out.print(y[j]+" ");
        }        
        for (int i=9;i>0;i--){
            z[i]=x[i]+y[i]+z[i];
        if (z[i]==2){
            z[i]=0;
                z[i-1]=1;
        }
        if (z[i]==3){
            z[i]=1;
            z[i-1]=1;
        }
        }
        {System.out.println("");
            System.out.println("hasil biner = ");
        }
        
            for (int j=0;j<10;j++){
            System.out.print(z[j]+" ");
            }
            System.out.println(" ");
            
            System.out.print("konversi hasil desimal ke biner = ");
            for (int i=9;i>0;i--){
                if (z[i]==1){
            for (int j=9-i;j>0;j--){
                pangkat= pangkat*2;
            }
            konversi+=pangkat;
            pangkat = 1;
                }
            }
            System.out.print(konversi+"\n");
            
                }
            }
           
            
            
        
            
        
            
         
        
        
        
    
    

