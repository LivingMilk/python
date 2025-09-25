class Acronym {
private String phrase;
    Acronym(String phrase) {
    this.phrase = "" + phrase.charAt(0);
        for(int i = 0; i < phrase.length(); i++){
            if(phrase.charAt(i) == ' ' || phrase.charAt(i) == '-' || phrase.charAt(i) == '_'){
                if(phrase.charAt(i + 1) != '_' && phrase.charAt(i + 1) !='-' && phrase.charAt(i + 1) != ' ')
                    this.phrase += phrase.charAt(i + 1);
                }
            
            }
        this.phrase = this.phrase.toUpperCase();
    }

    String get() {
        return phrase;
    }

}
