
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Couser {
    private Set<Student> studentSet = new HashSet<>();

    public Couser() {

    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public Set<Student> getSortStudentByName() {
        Set<Student> studentSet1 = new TreeSet<>(new SortByName());
        if (!this.studentSet.isEmpty()) {
            studentSet1.addAll(studentSet);
        }
        return studentSet1;
    }

    public Set<Student> getSortStudentByScore(){
        Set<Student> studentSet1 = new TreeSet<>(new SortByScore());
        if (!this.studentSet.isEmpty()){
            studentSet1.addAll(studentSet);
        }
        return studentSet1;
    }
    @Override
    public String toString() {
        return "Couser{" +
                "studentSet=" + studentSet +
                '}';
    }
}


