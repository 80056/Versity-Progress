public class StudentArrayClass {
    public String name;
    public String id;
    public double cgpa;
    public StudentArrayClass(String name, String id, double cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
    public static void main(String[] args) {
        StudentArrayClass[] StudentArrayClasses = new StudentArrayClass[3];
        StudentArrayClasses[0] = new StudentArrayClass("rajee","8686876",3.89);
        StudentArrayClasses[1] = new StudentArrayClass("zaman","7676767",3.80);
        StudentArrayClasses[2] = new StudentArrayClass("kshem","6886868",3.85);
    }
}
