import java.util.Scanner;

class Square{
    private int sideLen;
    private float area;
    private float perimeter;

    Square(int sideLen){
        this.sideLen=sideLen;
    }

    Square(Square S){
        this.sideLen=S.sideLen;
        this.area=S.area;
        this.perimeter=S.perimeter;
    }

    int getSideLen(){
        return sideLen;
    }

    float getArea(){
        return area;
    }

    float getPerim(){
        return perimeter;
    }

    void setSideLen(int sideLen){
        this.sideLen=sideLen;
    }

    void calcArea(){
        area=sideLen*sideLen;
    }

    void calcPerim(){
        perimeter=4*sideLen;
    }

    void displayInfo(){
        System.out.println("Side Length:"+sideLen);
        System.out.println("Area:"+area);
        System.out.println("Perimeter:"+perimeter);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        Square s1=new Square(23);
        Square s2=new Square(12);

        s1.calcArea();
        s1.calcPerim();
        s2.calcArea();
        s2.calcPerim();

        Square s3=new Square(s1);
        System.out.println("Square 1:");
        s1.displayInfo();
        System.out.println("Square 2:");
        s2.displayInfo();
        System.out.println("Square 3");
        s3.displayInfo();
        sc.close();
    }
    
}