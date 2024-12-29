package N_OOPS.Static;

//if outside it has not to be static
class Test {
    static String name;

    public Test(String name) {
        Test.name = name;
    }
}

//static public class -> outside class cannot be static
public class innerClasses {


//    //but if Inside, it has to be a static, as now it is dependent on the obj of Inner class
//
//    static class Test {
//        String name;
//
//        public Test(String name) {
//            this.name = name;
//        }
//    }


    public static void main(String[] args) {
        Test a = new Test("Raja");
        Test b = new Test("Kunal");
        System.out.println(a.name);
        System.out.println(b.name);

    }
}
