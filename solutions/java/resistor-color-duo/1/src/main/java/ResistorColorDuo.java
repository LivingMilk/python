class ResistorColorDuo {
    int value(String[] colors) {
        int rtn = 0;
        for(int i = 0; i < 2 && i < colors().length ;i++){
            rtn *=10;
            rtn += colorCode(colors[i]);
            
        }
        return rtn;
    }
    String[] colors() {
        return new String[]{"black","brown","red","orange","yellow", "green","blue","violet","grey","white"};
    }
    int colorCode(String color) {
        for(int i = 0; i < colors().length; i++){
            if(color == colors()[i])
                return i;
        }
        return 0;
    }
}
