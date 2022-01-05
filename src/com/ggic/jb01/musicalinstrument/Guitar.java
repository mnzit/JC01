package com.ggic.jb01.musicalinstrument;

import com.ggic.jb01.Playable;

public class Guitar implements Playable{

    private static Guitar instance = null;

    private Guitar(){}

    // eager initialization
    static {
        instance = new Guitar();
    }

    // lazy initialization
    public static Guitar getInstance() {
        if(instance == null) {
            instance = new Guitar();
        }
        return instance;
    }
    
    public void play(){
    }
}
