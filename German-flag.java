//Using bidimensional arrays I was able to represent the colors of the German flag according to the specified size by the user
public class germanyflag {
    public static void main(String[] args) {
        createGermanyFlag(1);
    }
    public static String [][] createGermanyFlag(int size){
        String[][] flag = new String[3*size][5*size];
            for(int row = 0; row < flag.length; row++){
                for(int column = 0; column < flag[row].length; column++) {
                     if (row < size ){
                        flag [row][column]="negro";
                     }else
                        if(row<2*size){
                        flag [row][column]="rojo";
                        }else
                            if(row<3*size){
                                flag [row][column]="amarillo";
                            }
                     }
                }
                for (int i=0; i < flag.length; i++){
                    for (int j=0; j < flag[i].length; j++)
                          System.out.print(" | " + flag[i][j]+ " | ");   
                    System.out.println("");
            }
        return flag;
    }
}
