package lab_02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        university uni_01 = new university();
        university uni_02 = new university();
        university uni_03 = new university();


        student st_01 = new student();
        student st_02 = new student();
        student st_03 = new student();


        student st_04 = new student();
        student st_05 = new student();
        student st_06 = new student();


        student st_07 = new student();
        student st_08 = new student();
        student st_09 = new student();

        st_01.SetAge(s.nextInt());
        st_01.SetMark(s.nextInt());
        st_01.SetName(s.next());

        st_01.ShowStudentsStats();

        st_02.SetAge(s.nextInt());
        st_02.SetMark(s.nextInt());
        st_02.SetName(s.next());

        st_02.ShowStudentsStats();

        st_03.SetAge(s.nextInt());
        st_03.SetMark(s.nextInt());
        st_03.SetName(s.next());

        st_03.ShowStudentsStats();


        st_04.SetAge(s.nextInt());
        st_04.SetMark(s.nextInt());
        st_04.SetName(s.next());

        st_04.ShowStudentsStats();

        st_05.SetAge(s.nextInt());
        st_05.SetMark(s.nextInt());
        st_05.SetName(s.next());

        st_05.ShowStudentsStats();


        st_06.SetAge(s.nextInt());
        st_06.SetMark(s.nextInt());
        st_06.SetName(s.next());

        st_06.ShowStudentsStats();


        st_07.SetAge(s.nextInt());
        st_07.SetMark(s.nextInt());
        st_07.SetName(s.next());

        st_07.ShowStudentsStats();

        st_08.SetAge(s.nextInt());
        st_08.SetMark(s.nextInt());
        st_08.SetName(s.next());

        st_08.ShowStudentsStats();


        st_09.SetAge(s.nextInt());
        st_09.SetMark(s.nextInt());
        st_09.SetName(s.next());

        st_09.ShowStudentsStats();


        uni_01.SetName(s.next());
        uni_01.SetFoundationYear(s.nextInt());

        uni_01.ShowUniversityStats();

        uni_02.SetName(s.next());
        uni_02.SetFoundationYear(s.nextInt());

        uni_02.ShowUniversityStats();

        uni_03.SetName(s.next());
        uni_03.SetFoundationYear(s.nextInt());

        uni_03.ShowUniversityStats();


        uni_01.addStudent(st_01);
        uni_01.addStudent(st_02);
        uni_01.addStudent(st_03);

        uni_02.addStudent(st_04);
        uni_02.addStudent(st_05);
        uni_02.addStudent(st_06);

        uni_03.addStudent(st_07);
        uni_03.addStudent(st_08);
        uni_03.addStudent(st_09);

        System.out.println("University 01 average mark: " + uni_01.average_mark());
        System.out.println("University 02 average mark: " + uni_02.average_mark());
        System.out.println("University 03 average mark: " + uni_03.average_mark());

        System.out.println("Average from all universities: " +
                (uni_01.average_mark() + uni_02.average_mark() + uni_03.average_mark()) / 3 );


    }
}
