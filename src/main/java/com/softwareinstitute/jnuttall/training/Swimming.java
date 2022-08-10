package com.softwareinstitute.jnuttall.training;

public interface Swimming {

    public default String dive(){
        return "Diving!! *Splash*";
    }

    public default String swim(){
        return "I'm swimming!!";
    }

    public default String getOutWater(){
        return "I'm getting out of the water'!!";
    }
}
