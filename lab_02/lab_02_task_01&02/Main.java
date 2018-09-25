package laboratory_02;

public class Main {

    public static void main(String[] args) {

        Queue q = new Queue();

        q.nr_of_elements = 100;


        q.push(3);
        q.push(4);
        q.push(5);

        q.pop();

        q.print_elements();

    }

}
