package com.softwareinstitute.jnuttall.training;

public class Cat extends Mammal{

    private String name;
    private String catType;
    private String kill;

    public Cat(String animalType, String mammalName, String catType, String name) {
        super(animalType, mammalName);

        this.name = name;
        this.catType = catType;
    }

    public Cat(){
        super("Mammal", "Cat");

        this.name = "Ginger";
        this.catType = "Tabby";

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    public String getKill() {
        return "This mouse is mine!!";
    }

    public void setKill(String kill) {
        this.kill = kill;
    }
}
