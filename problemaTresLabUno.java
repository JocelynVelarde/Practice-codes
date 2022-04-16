public class problemaTresLabUno {
    static int[]lista;
    static boolean number(int num){
        for(int i = 0; i<lista.length; i++){
            if (lista[i] == num){
                return false;
            }
        }  return true;
    }
    public static void main(String[] args) {
    int[] array = {1, 2, 3}; //ingresa los valores de tu array
    lista = new int[array.length];
    for(int i = 0; i<array.length; i++){
        int cont = 0;
        for(int j = 0; j<array.length; j++){
            if (array[i] == array [j]){
                cont++;
                if(number(array[i])){
                    lista[i] = array[i];
                }
            }
        }
        if(lista[i] != 0){
            System.out.println(lista[i] + "aparece" +cont + "veces");
        }
    }
    }
}
    

