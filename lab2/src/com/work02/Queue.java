package com.work02;

import java.util.List;
import java.util.ArrayList;

public class Queue {

    private List<Integer> elements = new ArrayList<Integer>();
    int nr_of_elements;


    public Queue( int a ){

        nr_of_elements = a;

    }

    public Queue(){

        //nothing much

    }

    public void push(Integer b){

        if (!isFull())
            elements.add(0, b);

    }

    boolean isEmpty(){

        return elements.size() == 0;

    }

    boolean isFull(){

        return elements.size() == nr_of_elements;
    }

    public Integer pop(){

        Integer temp = elements.get(elements.size() - 1);

        elements.remove(temp);
        return temp;

    }

    public void print_elements(){

        for (int i = 0; i < elements.size(); i++){

            System.out.println(elements.get(i));

        }

    }

}

