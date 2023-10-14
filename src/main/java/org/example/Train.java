package org.example;
//ctrl-v do cc.net od dalšího řádku
import java.util.ArrayList;
public class Train {
    ArrayList<Wagon> list;
    public Train() {
        this.list = new ArrayList<Wagon>();
    }
    public void Push(char id, int weight){
        Wagon temp = new Wagon(id, weight);
        list.add(temp);
        System.out.println("ok");
    }
    public void Pop_id(char id){
        boolean found = false;
        for(Wagon temp : list){
            if(id == temp.getId()){
                found = true;
                list.remove(temp);
            }
        }
        if(found){
            System.out.println("ok");
        }else{
            System.out.println("error");
        }
    }
    public void Pop_pos(int position){
        if(position < list.size()){
            list.remove(position);
            System.out.println("ok");
        }else{
            System.out.println("error");
        }
    }
    public void move(char id, int position){
        int wagonIndex = -1; // Index vozu, který se bude přesouvat
        Wagon wagonToMove = null; // Vůz, který se bude přesouvat
        // Najdeme index a vůz, který se má přesouvat
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                wagonIndex = i;
                wagonToMove = list.get(i);
                break;
            }
        }
        if (wagonIndex != -1) {
            // Odebereme vůz z původní pozice
            list.remove(wagonIndex);
            // Pokud nová pozice je větší než aktuální pozice, ostatní vozy se posunou dopředu
            if (position > wagonIndex) {
                position = Math.min(position, list.size());
            }
            // Vložíme vůz na novou pozici
            list.add(position, wagonToMove);
        }
    }
    public void total_weight(){
        if(list.size()==0){
            System.out.println("empty");
        }else{
            int total=0;
            for(Wagon temp:list){
                total+=temp.getWeight();
            }
            System.out.println(total);
        }
    }
    public void print(){
        if(list.size()==0){
            System.out.println("empty");
        }else{
            for(Wagon temp:list){
                System.out.println(temp.getId()+":"+temp.getWeight());
            }
        }
    }
}
