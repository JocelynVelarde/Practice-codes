package merlin;

public class Merlin {

    public static void main(String[] args){
        Merlin wizard = Merlin.summon(); 
        Merlin.consult(); 
        Merlin.consult(); 
        Merlin.consult(); 
        Merlin.summon();
    }
    private static Merlin theWizard;

    private Merlin(Merlin theWizard){
        return;
    }

    public static Merlin summon(){
        if(Merlin.theWizard==null){
            Merlin thewizard = new Merlin(theWizard);
            return null;
        }else
            return Merlin.theWizard;
    }

    public static void consult(){
        String frases [] = new String [8];
        frases [0] = "I am Merlin";
        frases [1] = "No one's ever needed to do it, as much as you do. This is your moment. Believe in yourself.  ";
        frases [2] = "What exactly do you think I'm capable of?  ";
        frases [3] = "Camelot isn't built on magic, but on people, on their faith.";
        frases [4] = "I have walked my way since the beginning of time. Sometimes I give, sometimes I take, it is mine to know which and when!  ";
        frases [5] = "Anál nathrach, orth’ bháis’s bethad, do chél dénmha. ";
        frases [6] = "Behold! The Sword of Power! Excalibur!  ";
        frases [7] = "Remember, there's always something cleverer than yourself.  ";
        
        int min = 0;
		int max = 7;
		int getRandomValue = (int)(Math.random()*(max-min)) + min;
        System.out.println("Merlin dice:" + frases[getRandomValue]);
        }
    }