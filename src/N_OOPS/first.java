package N_OOPS;

public class first {
    public void main(String[] args) {

        Student Raja = new Student();
//
//        Raja.RollNo = 10;
//        Raja.Cgpa = 9.1f;
//        Raja.name = "RAJA KUMAR";


        System.out.println(Raja.RollNo);
        System.out.println(Raja.Cgpa);
        System.out.println(Raja.name);
    }

    class Student {
        int RollNo;
        String name;
        float Cgpa;

        Student(){
            this.RollNo = 13;
            this.name = "Any";
            this.Cgpa = 9.8f;

        }

        Student(int rollNo, String name, float Cgpa){
            this.RollNo = rollNo;
            this.name = name;
            this.Cgpa = Cgpa;
        }

//        Studentdetails(int roll, String naam, float Gpa){
//            RollNo = roll;
//            name = naam;
//            Cgpa = Gpa;
//        }


    }
}
