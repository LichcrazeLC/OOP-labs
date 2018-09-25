package lab_01;

import java.util.Scanner;

public class monitor_class {

    float diagonal;
    int price;
    String name;

    Scanner s = new Scanner(System.in);


    public void show_monitor_values(){

        System.out.println("Monitor diagonal:"+ diagonal + ", Monitor price:" + price + ", Monitor name: " + name);

    }

    public void input_new_monitor_values(){

        System.out.println("Enter monitor diagonal: ");
        diagonal = s.nextFloat();
        System.out.println("Enter monitor price: ");
        price = s.nextInt();
        System.out.println("Enter monitor name: ");
        name = s.next();

    }

}
