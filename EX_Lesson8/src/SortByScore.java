import java.util.Comparator;

class SortByScore implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getScore() < o2.getScore()) {
            return 1;
        } else if (o1.getScore() > o2.getScore()) {
            return -1;
        }
        return 0;
    }
}