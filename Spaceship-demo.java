//A demo for the spaceship class
public class MainSpaceShip {
    public static void main(String[] args) {
        SpaceShip nave1, nave2; 
        nave1 = new SpaceShip("nave1", 10); 
        nave2 = new SpaceShip("nave2", 10); 
        boolean flag = nave1.equals(nave2);
        SpaceShip clone = (SpaceShip)nave1.clone();
        
         
        nave1.board(0); 
        nave1.transferTo(nave2); 
         
        nave1.board(0); 
        nave1.transferTo(nave2); 
         
        nave1.board(0); 
        nave1.transferTo(nave2); 
        System.out.println(nave1); 
        System.out.println(nave2); 
        System.out.println(flag);
        System.out.println(clone);
       
    }
}
