package com.labs;


class Utilities {

    public void compare_obj(Monitor_class mon_01, Monitor_class mon_02){

        if (mon_01.price > mon_02.price)
            System.out.println("monitor_01 is more expensive");

        else
            System.out.println("monitor_01 is cheaper");

        if (mon_01.diagonal > mon_02.diagonal)
            System.out.println("monitor_01 is bigger");

        else
            System.out.println("monitor_02 is bigger");

    }
}
