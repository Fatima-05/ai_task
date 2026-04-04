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
}