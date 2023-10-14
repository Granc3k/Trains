package org.example;
//ctrl-v do cc.net od dalšího řádku
public class Wagon{
    char id;
    int weight;
    public Wagon(char id, int weight) {
        this.id = id;
        this.weight = weight;
    }
    public char getId() {
        return id;
    }
    public void setId(char id) {
        this.id = id;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
}