package org.example;
//ctrl-v do cc.net od dalšího řádku
import java.util.Scanner;
public class main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean end = false;
        Train list = new Train();
        String input="";
        char id =' ';
        int weight = 0;
        int position=0;
        try {
            while (!end) {
                input = sc.nextLine();
                String[] dec = input.split("[ :]");
                switch (dec[0]) {
                    case "push":{
                        id = dec[1].charAt(0);
                        weight = Integer.parseInt(dec[2]);
                        list.Push(id, weight);
                        break;
                    }
                    case "pop":{
                        switch (dec[1]) {
                            case "pos":{
                                position = Integer.parseInt(dec[2])-1;
                                list.Pop_pos(position);
                                break;
                            }
                            case "id":{
                                id = dec[2].charAt(0);
                                list.Pop_id(id);
                                break;
                            }
                        }
                        break;
                    }
                    case "move":{
                        id = dec[1].charAt(0);
                        position = Integer.parseInt(dec[2]);
                        list.move(id,position);
                        System.out.println("ok");
                        break;
                    }
                    case "total_weight":{
                        list.total_weight();
                        break;
                    }
                    case "print":{
                        list.print();
                        break;
                    }
                }
            }
        }catch(Exception ignored){
        }
    }
}
