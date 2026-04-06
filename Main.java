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

        float area = s1.getArea();
        int nonDecimal = (int) area;
        float decimal = area - nonDecimal;

        System.out.println("Non Decimal Part: " + nonDecimal);
        System.out.println("Decimal Part: " + decimal);

        int num = s2.getSideLen();
        if (num >= 100 && num <= 999) {
            int d1 = num / 100;
            int d2 = (num / 10) % 10;
            int d3 = num % 10;

            if (d1 == d2 && d2 == d3)
                System.out.println("Yes");
            else
                System.out.println("No");
        } else {
            System.out.println("No");
        }

        int side = s1.getSideLen();
        int greater = 0, smaller = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number: ");
            int input = sc.nextInt();

            if (input == side) {
                break;
            } else if (input > side) {
                greater++;
            } else {
                smaller++;
            }
        }

        System.out.println("Greater count: " + greater);
        System.out.println("Smaller count: " + smaller);
    }
    
}