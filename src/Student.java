public class Student {

    static void studentID(String name, int id){
        System.out.println("Name " + name + " ID " + id);
    }

    static void studentID( int id, String name){
        System.out.println("Name " + name + " ID " + id);
    }
    public static void main(String[] args) {

    }
}

class Test1{
    public static void main(String[] args) {
        Student.studentID("Gawesh",25245);
        Student.studentID(12345, "Amal Dumal");
    }
}
