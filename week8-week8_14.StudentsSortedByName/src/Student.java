
public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public int compareTo(Student compare) {
        if (this.name.compareToIgnoreCase(compare.name) == 0) {

            return 0;

        } else if (this.name.compareToIgnoreCase(compare.name) > 0) {
            return 1;
        } else {
            return -1;
        }
    }

}
