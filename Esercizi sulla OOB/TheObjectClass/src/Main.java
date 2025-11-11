public class Main extends Object {

    public static void main(String[] args) {

        Student max = new Student("Max", 21);
        System.out.println(max);

        // System.out.println(.max.toString()); senza definire toString()
        // restituisce Student@8efb846 --> la parte dopo @ si chiama hash code
        // l'hash code è un intero che è unico per un'istanza, nel codice attualmente in esecuzione
        // da notare che l'intero è in formato esadecimale, per scopi di debugging
        // l'hash code ci può tornare utile per vedere se molteplici riferimenti puntano a una singola istanza

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carole");
        System.out.println(jimmy);
    }
}

class Student {

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudent extends Student {

    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}
