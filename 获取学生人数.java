public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("zhang", 23, 74);
        Student s2 = new Student("lisi", 20, 65);
        Student s3 = new Student("wang", 21, 93);
        System.out.println("Studnet  Number=" + Student.getCounter());
    }
}

class Student {
    private String name;
    private int age;
    private double grade;
    private static int counter = 0;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

}