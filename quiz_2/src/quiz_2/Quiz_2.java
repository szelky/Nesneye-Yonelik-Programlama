package quiz_2;

import java.util.Scanner;
public class Quiz_2 {

    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       int ilksayi,rakam,neon;
       int toplam=0;
             
       ilksayi=input.nextInt();
       int sayi=ilksayi;
       
       while(sayi>0){
           rakam=sayi%10;
           toplam=toplam+rakam;
           sayi=sayi/10;
       }       
       neon=toplam*toplam;
       
        if (neon==ilksayi) {
            System.out.println("Neon sayidir.");
        }
            
        else{
            System.out.println("Neon sayi degildir");
        }
    }
    
}
