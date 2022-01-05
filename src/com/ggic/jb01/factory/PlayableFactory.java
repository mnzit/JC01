package com.ggic.jb01.factory;

import com.ggic.jb01.Playable;
import com.ggic.jb01.ball.Basketball;
import com.ggic.jb01.ball.Football;
import com.ggic.jb01.musicalinstrument.Drum;
import com.ggic.jb01.musicalinstrument.Guitar;

// SOLID PRINCIPLE
// PATTERN

public class PlayableFactory {

    public static Playable produceBall(String type){
        Playable playable = null;
        
        switch(type){
            case "football":
            playable = new Football();
            break;
            case "basketball":
            playable = new Basketball();
            break;
        }

        return playable;
    }

    public static Playable produceMi(String type){
        Playable playable = null;
        
        switch(type){
            case "drum":
            playable = new Drum();
            break;
            case "guitar":
            playable = Guitar.getInstance();
            break;
        }

        return playable;
    }



    
}
