package com.ggic.jb01.factory;

import com.ggic.jb01.Playable;
import com.ggic.jb01.ball.Basketball;
import com.ggic.jb01.ball.Football;

public class PlayableFactory {

    public static Playable produce(String type){
        Playable playable = null;
        
        switch(type){
            case "football":
            playable = new Football();
            case "basketball":
            playable = new Basketball();
        }

        return playable;
    }
    
}
