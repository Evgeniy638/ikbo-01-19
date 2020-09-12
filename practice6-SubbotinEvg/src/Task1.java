public class Task1 {
    private static String[] names = {
        "Вася",
        "Петя",
        "Вова",
        "Гриша"
    };

    public static void main(String[] args) {
        Student[] students = getRandomStudents();
        sortStudents(students);
        printStudents(students);
    }

    private static void printStudents(Student[] students){
        for (Student student: students) {
            System.out.println(student);
        }
    }

    private static void sortStudents(Student[] students) {
        for (int j = 1; j < students.length; j++) {
            Student key = students[j];
            int i = j - 1;

            while (i >= 0 && students[i].getIdNumber() > key.getIdNumber()) {
                students[i+1] = students[i];
                i--;
            }

            students[i+1] = key;
        }
    }

    private static Student[] getRandomStudents() {
        int countStudents = (int)(Math.random() * 11);

        Student[] students = new Student[countStudents];

        for (int i = 0; i < countStudents; i++) {
            students[i] = new Student(getRandomName(), getRandomId());
        }

        return students;
    }

    private static String getRandomName() {
        return names[(int)(Math.random() * names.length)];
    }

    private static int getRandomId() {
        return (int)(Math.random() * 1000);
    }
}
