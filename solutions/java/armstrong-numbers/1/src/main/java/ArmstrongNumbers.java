class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int sum = 0;
        int temp = numberToCheck;

        for(int i = 0; i < ("" + numberToCheck).length(); i++){
            sum += Math.pow(temp % 10, ("" + numberToCheck).length());
            temp /= 10;
        }
        return sum == numberToCheck;
    }

}
