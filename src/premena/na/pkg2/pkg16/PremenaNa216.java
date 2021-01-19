/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package premena.na.pkg2.pkg16;


import java.util.Scanner;
/**
 *
 * @author miros
 */
public class PremenaNa216 {
  
    
    
    public static void main(String[] args){
        vypisHeaderu();
         Scanner scanner = new Scanner(System.in);
          System.out.println("Chcete zadať číslo v  2/10/16 sustave ");
          int sustava = scanner.nextInt();
          switch(sustava)
        {
            case 2 -> {
                System.out.println("Chceš číslo z 2  dať do 10/16 sustavy");
                int alsiasustava = scanner.nextInt();
                
                switch(alsiasustava)
                {
                    case 10 -> {
                        System.out.println("Zadaj číslo v 2 a prekonvertuje ti ho do 10");
                        String cislo = scanner.next();
                        System.out.println(BinToInt(cislo));
                 }
                    case 16 -> {
                        System.out.println("Zadaj číslo v 2 a prekonvertuje ti ho do 16");
                        String cislo = scanner.next();
                        System.out.println(BinToHex(cislo));
                 }
                    default -> System.out.println("Zadal si zle číslo nevybral si ani jednu zo sustav");
                        
                }
            }
            case 10 -> {
                System.out.println("Chceš číslo z 10  dať do 2/16 sustavy");
                int dalsiasustava = scanner.nextInt();
                
                switch(dalsiasustava)
                {
                    case 2 -> {
                        System.out.println("Zadaj číslo v 10 a prekonvertuje ti ho do 2");
                        int cislo = scanner.nextInt();
                        System.out.println(IntToBin(cislo));
                 }
                    case 16 -> {
                        System.out.println("Zadaj číslo v 10 a prekonvertuje ti ho do 16");
                        int cislo = scanner.nextInt();
                        System.out.println(IntToHex(cislo));
                 }
                    default -> System.out.println("Zadal si zle číslo nevybral si ani jednu zo sustav");
                        
                }
            }
            case 16 -> {
                System.out.println("Chceš číslo z 16  dať do 2/10 sustavy");
                int aalsiasustava = scanner.nextInt();
                
                switch(aalsiasustava)
                {
                    case 2 -> {
                        System.out.println("Zadaj číslo v 16 a prekonvertuje ti ho do 2");
                        String cislo = scanner.next();
                        System.out.println(HexToBin(cislo));
                 }
                    case 10 -> {
                        System.out.println("Zadaj číslo v 16 a prekonvertuje ti ho do 10");
                        String cislo = scanner.next();
                        System.out.println(HexToInt(cislo));
                 }
                    default -> System.out.println("Zadal si zle číslo nevybral si ani jednu zo sustav");
                        
                }
            }
                default -> System.out.println("Zadal si zle číslo nevybral si ani jednu zo sustav");
               
          
          
          
          }
      
    }
    
    private static void vypisHeaderu(){
        System.out.println("***********************");
        System.out.println("*                     *");
        System.out.println("*     Kalkulacka      *");
        System.out.println("*                     *");
        System.out.println("***********************");
        System.out.println();
        
    }
    
    
    private static int HexToInt(String hex)
    {
        return Integer.parseInt(hex, 16);
    }
    
    private static int BinToInt(String bin)
    {
        return Integer.parseInt(bin, 2);
    }
    
    private static String IntToHex(int number)
    {
        return Integer.toHexString(number);
    }
    
    private static String IntToBin(int number)
    {
        return Integer.toBinaryString(number);
    }
    
    private static String BinToHex(String bin)
    {
        return IntToHex(BinToInt(bin));
    }
    
    private static String HexToBin(String hex)
    {
        return IntToBin(HexToInt(hex));
    }
}

                                        
                                        