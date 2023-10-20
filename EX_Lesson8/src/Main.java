import java.util.*;

public class Main {
    public static void main(String[] args) {
        Couser couser = new Couser();
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Anh", 19, 8.0f));
        studentSet.add(new Student("Bảo", 18, 7.9f));
        studentSet.add(new Student("Công", 21, 9.0f));
        studentSet.add(new Student("Đông", 22, 10.0f));
        studentSet.add(new Student("Em", 20, 9.5f));
        if (studentSet.size() >= 5 || studentSet.size() < 20 ){
            couser.setStudentSet(studentSet);
        }
        System.out.println("Danh Sách học sinh trong lớp theo tên A-Z:");
        iterator(couser.getSortStudentByName());
        System.out.println();
        System.out.println("Danh sách sinh viên theo điểm:");
        iterator(couser.getSortStudentByScore());

    }

    public Student addStudent(Scanner input) {
        System.out.println("Add information:");
        System.out.println("Name:");
        var name = input.nextLine();
        System.out.println("Age:");
        var age = checkInputInteger(input);
        System.out.println("Score (Score > 0 || Score < 10.0):");
        var score = checkInputFloat(input);
        if (score < 0 || score > 10.0) {
            score = 0f;
        }
        return new Student(name, age, score);
    }

    public int checkInputInteger(Scanner input) {
        int number = 0;
        while (!input.hasNextInt()) {
            System.out.println("That's not a integer number,retry!");
            input.next();
        }
        return number = input.nextInt();
    }

    public float checkInputFloat(Scanner input) {
        float number = 0;
        while (!input.hasNextInt()) {
            System.out.println("That's not a float number,retry!");
            input.next();
        }
        return number = input.nextFloat();
    }

    public static void iterator(Set<Student> students) {
        Iterator iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
