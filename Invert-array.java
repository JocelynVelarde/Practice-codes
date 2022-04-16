//Invert a specified array
import java.util.Scanner;
public class problemaDosLabUno {
    public static void main(String[] args) {  
        invertArray();  
  }  
public static void invertArray(){ 
    Scanner in = new Scanner(System.in);
        int tam;
        System.out.println("Ingresa el tamaño del arreglo"); 
        tam = in.nextInt();
        int arr []= new int[tam];
        System.out.println("Ingresa los numeros correspondientes a tu arreglo");
        for (int i=0 ; i<arr.length; i++){
            arr[i] = in.nextInt();
        }  
      for (int i = arr.length-1; i >= 0; i--) {  
          System.out.print(arr[i] + " ");  
      } 
      in.close();
    }
  }
