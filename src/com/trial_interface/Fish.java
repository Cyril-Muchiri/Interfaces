package com.trial_interface;

public class Fish implements Prey,Predator{
    @Override
    public void hunt() {
        System.out.println("This fish is hunting sardines");
    }

    @Override
    public void flee() {
        System.out.println("The fish is fleeing from sharks");
    }
}
