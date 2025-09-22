import java.util.List;
import java.util.ArrayList;

class HighScores {

    List<Integer> highScores;
    
    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.get(highScores.size() - 1);
    }

    Integer personalBest() {
        int best = 0;

        for(int i = 1; i < highScores.size(); i++){
            if(highScores.get(i) > highScores.get(best)){
                best = i;
            }
        }
        return highScores.get(best);
    }
    Integer personalBest(List<Integer> l) {
        int best = 0;

        for(int i = 1; i < l.size(); i++){
            if(l.get(i) > l.get(best)){
                best = i;
            }
        }
        return l.get(best);
    }

    List<Integer> personalTopThree() {
        
        List<Integer> best = new ArrayList<>();
        ArrayList<Integer> clone = new ArrayList<>(highScores);

        if(clone.size() == 0){
            return best;
        }
        best.add(personalBest(clone));
        clone.remove(personalBest(clone));

        if(clone.size() == 0){
            return best;
        }
        best.add(personalBest(clone));
        clone.remove(personalBest(clone));

        if(clone.size() == 0){
            return best;
        }
        best.add(personalBest(clone));
        clone.remove(personalBest(clone));

        return best;
        
    }

}
