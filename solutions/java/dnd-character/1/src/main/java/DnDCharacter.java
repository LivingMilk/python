import java.util.List;
import java.util.Random;
import java.util.ArrayList;

class DnDCharacter {

    private int strength = ability(rollDice());
    private int dexterity = ability(rollDice());
    private int constitution = ability(rollDice());
    private int wisdom = ability(rollDice());
    private int charisma = ability(rollDice());
    private int intelligence = ability(rollDice());;
    
    int ability(List<Integer> scores) {

        int lowElm = 0;
        int sum = 0;
        
        for(int i = 1; i < scores.size(); i++){
            if(scores.get(i) < scores.get(lowElm)){
                lowElm = i; 
            }
        }
        for(int i = 0; i < scores.size(); i++){
            if(i != lowElm){
                sum+= scores.get(i);
            }
        }
        return sum;
    }

    List<Integer> rollDice() {
        Random rand = new Random();

        List<Integer> rolls = new ArrayList<Integer>();

        rolls.add(new Integer(rand.nextInt(6) + 1));
        rolls.add(new Integer(rand.nextInt(6) + 1));
        rolls.add(new Integer(rand.nextInt(6) + 1));
        rolls.add(new Integer(rand.nextInt(6) + 1));

        return rolls;
        
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(constitution);
    }
}
