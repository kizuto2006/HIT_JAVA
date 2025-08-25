package Bai1.dang2;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args)
    {
        ArrayList<Moveable> moveableArrayList = new ArrayList<>();
        moveableArrayList.add(new Bike());
        moveableArrayList.add(new Car());
        for(Moveable a : moveableArrayList)
        {
            a.move();
        }
    }
}
