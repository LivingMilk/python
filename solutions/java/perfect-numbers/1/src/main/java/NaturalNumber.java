import java.util.ArrayList;
class NaturalNumber {
    private int number;
    private ArrayList<Integer> factors;
    NaturalNumber(int number) {
        if(number <=0)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        this.number = number;
        factors = new ArrayList<>();
    }

    Classification getClassification() {
        int sum = 0;
        for(int i = 1; i < number; i++){
            if (number % i == 0)
                factors.add(i);
        }
        for(Integer factor: factors){
            sum += factor;
        }
        if(sum == number)
            return Classification.PERFECT;
        else if(sum > number)
            return Classification.ABUNDANT;
        return Classification.DEFICIENT;
    }
}
