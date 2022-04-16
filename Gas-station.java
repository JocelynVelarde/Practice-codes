//using methods, seters, geters and specified attributes I was able to represent a gas station
import java.util.Scanner;

public class GasTanki {
public double amount;

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Ingresa un parametro de entrada");
    double amount = in.nextDouble();
    GasTanki carro = new GasTanki(amount);
carro.setAmount(45);
    in.close();

}
 public void setAmount(double amount) {
        this.amount = amount;
    }

public void addGas (double amount){
    if(amount < 0){
        System.out.println("Valor no es valido, ingrese un valor positivo");
    } else
        amount += amount;
        this.amount = amount;

}

public void useGas(double amount){
if(amount < 0){
    System.out.println("Valor no es valido, ingrese un valor positivo");
} else
    amount -= amount;
    this.amount = amount;

}

public boolean isEmpty(){
if(amount < 0.1){
    return true;
}else
    return false;
}

GasTanki(double amount){
this.amount = amount;
}

}
