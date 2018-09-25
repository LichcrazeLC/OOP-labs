package lab_01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        monitor_class monitor_01 = new monitor_class();
        monitor_class monitor_02 = new monitor_class();
        Utilities utils = new Utilities();
        int input_check_counter = 1;

        Scanner s = new Scanner(System.in);

        while (input_check_counter == 1) {

            monitor_01.input_new_monitor_values();

            monitor_01.show_monitor_values();

            monitor_02.input_new_monitor_values();

            monitor_02.show_monitor_values();

            utils.compare_obj(monitor_01, monitor_02);

            System.out.println("do you want to make some changes? 0 if no / 1 if yes");

            input_check_counter = s.nextInt();

        }

    }
}

