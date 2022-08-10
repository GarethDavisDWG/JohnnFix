package com.softwareinstitute.jnuttall.training;

public interface Moving {

    public default String walk(){
        return "I'm walking!!";
    }

    public default String run(){
        return "I'm running!!";
    }

    public default String rest(){
        return "I'm taking a rest'!!";
    }
}
