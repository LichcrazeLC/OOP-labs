package lab_02;


public class student {

    int age;
    int mark;
    String name;

    void SetAge(int age_input){

        age = age_input;

    }

    void SetMark(int mark_input){

        mark = mark_input;

    }

    void SetName(String input_name){

        name = input_name;

    }

    void ShowStudentsStats(){

        System.out.println("age:" + age + ", name: " + name + ", mark: " + mark);
    }


}

