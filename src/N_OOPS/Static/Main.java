package N_OOPS.Static;

public class Main {
    public static void main(String[] args) {
        Human Raja = new Human(20, "RAJA KUMAR" , 10000,false );
        Human Atharva = new Human(19, "ATHARVA" , 12000,true );

        System.out.println(Raja.name + " " + Human.Population);

        System.out.println(Atharva.name + " " + Human.Population);
    }

    static void fun(){
        //static fun can be used under static only, here greetings is not static... error

//        greeting();

        // However, we can access it by referencing it, and creating an object;

        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();
    }

    //no obj. needed as at last it is going to be called at main fun, where it will create an obj automatically during the run time.

    void greeting(){
        System.out.println("Hey Mr.");
    }
}
