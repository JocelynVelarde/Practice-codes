public class MainSpaceShip {
    public static void main(String[] args) {
        SpaceShip nave1, nave2, nave3; 
        nave1 = new SpaceShip("nave1", 10); 
        nave2 = new SpaceShip("Nave1", 10);  //Aquí da true. Cambia un valor y debe dar false
        boolean flag = nave1.equals(nave2);        
        
        //Pruebas mías
        nave3 = nave1.clone();
        System.out.println(nave3);
        
        /*
        nave1.board(0); 
        nave1.transferTo(nave2); 
         
        nave1.board(0); 
        nave1.transferTo(nave2); 
         
        nave1.board(0); 
        nave1.transferTo(nave2); 
        System.out.println(nave1); 
        
        System.out.println(nave2); 
        */
        //System.out.println(flag);
       
    }
}
