package laboratory_02;

public class Box {


    double height;
    double depth;
    double width;

    public Box(double h, double d, double w){

        height = h;
        depth = d;
        width = w;

    }

    public Box(){

        width = height = depth = 1;

    }

    public Box(double value){

        width = height = depth = value;

    }

    double volume(){

        return height*width*depth;

    }

    double surface_area(){

        return 2 * (height * depth) + 2 * (height * width) + 2 * (width * depth);

    }

}
