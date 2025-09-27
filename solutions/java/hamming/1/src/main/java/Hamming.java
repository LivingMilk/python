public class Hamming {
    private int distance;
    private String leftStrand;
    private String rightStrand;
    public Hamming(String leftStrand, String rightStrand) {
        int distance = 0;
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        if(leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("strands must be of equal length");
        
    }

    public int getHammingDistance() {
        for(int i = 0; i < leftStrand.length(); i++){
            if(leftStrand.charAt(i) != rightStrand.charAt(i))
                distance++;
        }
        return distance;
    }
}
