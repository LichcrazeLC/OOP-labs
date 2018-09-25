package lab_02;

import java.lang.reflect.Array;

public class university {

    int foundationYear;
    String name;
    student[] student_list = new student[3];

    int student_list_current_index = 0;

    void SetFoundationYear(int input_year){
        foundationYear = input_year;
    }

    void SetName(String input_name){
        name = input_name;
    }

    void addStudent(student st){
        student_list[student_list_current_index] = st;
        student_list_current_index++;
    }

    float average_mark(){

        float result = 0;

        for (int i = 0; i < student_list.length; i++){

            result += student_list[i].mark;

        }

        return result/student_list.length;

    }

    void ShowUniversityStats(){

        System.out.println("foundationYear:" + foundationYear + ", name: " + name);
    }

}
