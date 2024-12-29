package N_OOPS.Properties.Inheritance;

public class main {
    public static void main(String[] args) {

        Box box1 = new Box();
        Box box2 = new Box(4);
        Box box3 = new Box(3, 5, 7);

        System.out.println(box1.h + " " + box1.w + " " + box1.l);
        System.out.println(box2.h + " " + box2.w + " " + box2.l);
        System.out.println(box3.h + " " + box3.w + " " + box3.l);


        BoxWeight box4 = new BoxWeight();
        System.out.println(box4.l + " " + box4.h + " " + box4.w);


        BoxWeight box5 = new BoxWeight(2, 3, 4, 8);
        System.out.println(box5.l + " " + box5.h + " " + box5.w + " " + box5.weight);


    }
}
