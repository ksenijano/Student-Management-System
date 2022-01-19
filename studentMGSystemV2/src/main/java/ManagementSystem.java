import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ManagementSystem {

    Scanner scannerInt = new Scanner(System.in);
    Scanner scannerStr = new Scanner(System.in);

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Exam> exam = new ArrayList<>();

    ListIterator li = null;
    ListIterator li2 = null;

    public void addStudent() throws Exception {

            System.out.print("ENTER HOW MANY STUDENT YOU WANT TO ADD: ");
            int numberOfStudentsToAdd = scannerInt.nextInt();
            for (int i = 0; i < numberOfStudentsToAdd; i++) {

                System.out.print("ENTER STUDENT ID: ");
                int studentId = scannerInt.nextInt();

                System.out.print("ENTER STUDENT NAME: ");
                String studentName = scannerStr.nextLine().toUpperCase();

                students.add(new Student(studentId, studentName));
            }

           // oos = new ObjectOutputStream(new FileOutputStream(file)); //adding students to the file
           // oos.writeObject(students);
           // oos.close();

    }

    public void displayStudentById() {
            System.out.println("----------------------------------");
            for (Student student : students)
                System.out.println(student);
            System.out.println("----------------------------------");
    }

    public void searchStudentById() {
        boolean studentFound = false;
        System.out.print("ENTER STUDENT ID TO SEARCH: ");
        int studentId = scannerInt.nextInt();
        System.out.println("----------------------------------");
        li = students.listIterator();
        while (li.hasNext()) {
            Student student = (Student) li.next();
            if (student.getStudentId() == studentId) {
                System.out.println(student);
                studentFound = true;
                System.out.println("----------------------------------");
            }
        }
        if (!studentFound) {
            System.out.println("STUDENT NOT FOUND");
            System.out.println("----------------------------------");
        }
    }

    public void deleteStudentById() {
        boolean studentFound = false;
        System.out.print("ENTER STUDENT ID TO DELETE: ");
        int studentId = scannerInt.nextInt();
        System.out.println("----------------------------------");
        li = students.listIterator();
        while (li.hasNext()) {
            Student student = (Student) li.next();
            if (student.getStudentId() == studentId) {
                li.remove();
                studentFound = true;
            }
        }
        if (studentFound) {
            //oos = new ObjectOutputStream(new FileOutputStream(file));
            //oos.writeObject(students);
            //oos.close();
            System.out.println("STUDENT WITH ID " + studentId + " DELETED");
        } else {
            System.out.println("STUDENT NOT FOUND");
        }
        System.out.println("----------------------------------");
    }

    public void editStudentInfo() {
        boolean studentFound = false;
        System.out.print("ENTER STUDENT ID TO EDIT: ");
        int studentId = scannerInt.nextInt();
        System.out.println("----------------------------------");
        li = students.listIterator();
        while (li.hasNext()) {
            Student student = (Student) li.next();
            if (student.getStudentId() == studentId) {
                System.out.println("ENTER NEW STUDENT NAME: ");
                String studentName = scannerStr.nextLine().toUpperCase();
                li.set(new Student(studentId, studentName));
                studentFound = true;
            }
        }
        if (studentFound) {
            //oos = new ObjectOutputStream(new FileOutputStream(file));
            //oos.writeObject(students);
            //oos.close();
            System.out.println("STUDENT WITH ID " + studentId + " EDITED");
        } else {
            System.out.println("STUDENT NOT FOUND");
        }
        System.out.println("----------------------------------");

    }

    public void addTeacher() {
        System.out.print("ENTER HOW MANY TEACHERS YOU WANT TO ADD: ");
        int numberOfTeachersToAdd = scannerInt.nextInt();
        for (int i = 0; i < numberOfTeachersToAdd; i++) {

            System.out.print("ENTER TEACHER ID: ");
            int teacherId = scannerInt.nextInt();

            System.out.print("ENTER TEACHER NAME: ");
            String teacherName = scannerStr.nextLine().toUpperCase();


            teachers.add(new Teacher(teacherId, teacherName));
        }
        //oos = new ObjectOutputStream(new FileOutputStream(file)); //adding students to the file
        //oos.writeObject(students);
        //oos.close();
    }

    public void displayTeacherById() {
        System.out.println("----------------------------------");
        for (Teacher teacher : teachers)
            System.out.println(teacher);
        System.out.println("----------------------------------");
    }

    public void searchTeacherById() {
        boolean teacherFound = false;
        System.out.print("ENTER TEACHER ID TO SEARCH: ");
        int teacherId = scannerInt.nextInt();
        System.out.println("----------------------------------");
        li = teachers.listIterator();
        while (li.hasNext()) {
            Teacher teacher = (Teacher) li.next();
            if (teacher.getTeacherId() == teacherId) {
                System.out.println(teacher);
                teacherFound = true;
                System.out.println("----------------------------------");
            }
        }
        if (!teacherFound) {
            System.out.println("TEACHER NOT FOUND");
            System.out.println("----------------------------------");
        }
    }

    public void deleteTeacherById() {
        boolean teacherFound = false;
        System.out.print("ENTER TEACHER ID TO DELETE: ");
        int teacherId = scannerInt.nextInt();
        System.out.println("----------------------------------");
        li = teachers.listIterator();
        while (li.hasNext()) {
            Teacher teacher = (Teacher) li.next();
            if (teacher.getTeacherId() == teacherId) {
                li.remove();
                teacherFound = true;
            }
        }
        if (teacherFound) {
            //oos = new ObjectOutputStream(new FileOutputStream(file));
            //oos.writeObject(students);
            //oos.close();
            System.out.println("TEACHER WITH ID " + teacherId + " DELETED");
        } else {
            System.out.println("STUDENT NOT FOUND");
        }
        System.out.println("----------------------------------");
    }

    public void editTeacherInfo() {
        boolean teacherFound = false;
        System.out.print("ENTER TEACHER ID TO EDIT: ");
        int teacherId = scannerInt.nextInt();
        System.out.println("----------------------------------");
        li = teachers.listIterator();
        while (li.hasNext()) {
            Teacher teacher = (Teacher) li.next();
            if (teacher.getTeacherId() == teacherId) {
                System.out.println("ENTER NEW TEACHER NAME: ");
                String teacherName = scannerStr.nextLine().toUpperCase();
                li.set(new Teacher(teacherId, teacherName));
                teacherFound = true;
            }
        }
        if (teacherFound) {
            //oos = new ObjectOutputStream(new FileOutputStream(file));
            //oos.writeObject(students);
            //oos.close();
            System.out.println("TEACHER WITH ID " + teacherId + " EDITED");
        } else {
            System.out.println("TEACHER NOT FOUND");
        }
        System.out.println("----------------------------------");
    }

    public void addCourse() {
        System.out.print("ENTER HOW MANY COURSES YOU WANT TO ADD: ");
        int numberOfCoursesToAdd = scannerInt.nextInt();
        for (int i = 0; i < numberOfCoursesToAdd; i++) {

            System.out.print("ENTER COURSE ID: ");
            int courseId = scannerInt.nextInt();

            System.out.print("ENTER COURSE NAME: ");
            String courseName = scannerStr.nextLine().toUpperCase();
            displayTeacherById();
            System.out.print("CHOOSE TEACHER FROM THE LIST AND ENTER ID: ");
            int teacherId = scannerInt.nextInt();
            li = teachers.listIterator();
            boolean teacherFound = false;
            while (li.hasNext()) {
                Teacher teacher = (Teacher) li.next();
                if (teacher.getTeacherId() == teacherId) {
                    courses.add(new Course(courseId, courseName, teacher));
                    teacherFound = true;
                    System.out.println("----------------------------------");
                }
            }
            if (!teacherFound) {
                System.out.println("TEACHER NOT FOUND");
                System.out.println("----------------------------------");
            }
        }
    }

    public void displayCourseById() {
        System.out.println("----------------------------------");
        for (Course course : courses)
            System.out.println(course);
        System.out.println("----------------------------------");
    }

    public void searchCourseById() {
        boolean courseFound = false;
        System.out.print("ENTER COURSE ID TO SEARCH: ");
        int courseId = scannerInt.nextInt();
        System.out.println("----------------------------------");
        li = courses.listIterator();
        while (li.hasNext()) {
            Course course = (Course) li.next();
            if (course.getCourseId() == courseId) {
                System.out.println(course);
                courseFound = true;
                System.out.println("----------------------------------");
            }
        }
        if (!courseFound) {
            System.out.println("COURSE NOT FOUND");
            System.out.println("----------------------------------");
        }
    }

    public void deleteCourseById() {
        boolean courseFound = false;
        System.out.print("ENTER COURSE ID TO DELETE: ");
        int courseId = scannerInt.nextInt();
        System.out.println("----------------------------------");
        li = courses.listIterator();
        while (li.hasNext()) {
            Course course = (Course) li.next();
            if (course.getCourseId() == courseId) {
                li.remove();
                courseFound = true;
            }
        }
        if (courseFound) {
            //oos = new ObjectOutputStream(new FileOutputStream(file));
            //oos.writeObject(students);
            //oos.close();
            System.out.println("COURSE WITH ID " + courseId + " DELETED");
        } else {
            System.out.println("COURSE NOT FOUND");
        }
        System.out.println("----------------------------------");
    }

    public void editCourseInfo() {
        boolean courseFound = false;
        boolean teacherFound = false;
        System.out.print("ENTER COURSE ID TO EDIT: ");
        int courseId = scannerInt.nextInt();
        System.out.println("----------------------------------");
        li = courses.listIterator();
        while (li.hasNext()) {
            Course course = (Course) li.next();
            if (course.getCourseId() == courseId) {
                System.out.println("ENTER NEW COURSE NAME: ");
                String courseName = scannerStr.nextLine().toUpperCase();
                displayTeacherById();
                System.out.print("ASSIGN NEW TEACHER FROM THE LIST AND ENTER ID: ");
                int teacherId = scannerInt.nextInt();
                li2 = teachers.listIterator();
                while (li2.hasNext()) {
                    Teacher teacher = (Teacher) li2.next();
                    if (teacher.getTeacherId() == teacherId) {
                        li.set(new Course(courseId, courseName, teacher));
                        teacherFound = true;
                        courseFound = true;
                        System.out.println("----------------------------------");
                    }
                }
                if (!teacherFound) {
                    System.out.println("TEACHER NOT FOUND");
                    System.out.println("----------------------------------");
                }
            }

        }
        if (courseFound) {
            //oos = new ObjectOutputStream(new FileOutputStream(file));
            //oos.writeObject(students);
            //oos.close();
            System.out.println("COURSE WITH ID " + courseId + " EDITED");
        } else {
            System.out.println("COURSE NOT FOUND");
        }
        System.out.println("----------------------------------");
    }

    public void addExam() {
        displayCourseById();
        System.out.print("CHOOSE FROM THE LIST AND ENTER COURSE ID: ");
        int courseId = scannerInt.nextInt();
        li = courses.listIterator();
        boolean courseFound = false;
        boolean studentFound = false;
        while (li.hasNext()) {
            Course course = (Course) li.next();
            if (course.getCourseId() == courseId) {
                courseFound = true;
                System.out.print("ENTER EXAM ID: ");
                int examId = scannerInt.nextInt();
                System.out.print("ENTER EXAM SCORE: ");
                int score = scannerInt.nextInt();
                displayStudentById();
                System.out.print("ASSIGN STUDENT FROM THE LIST AND ENTER ID: ");
                int studentId = scannerInt.nextInt();
                li2 = students.listIterator();
                while (li2.hasNext()) {
                    Student student = (Student) li2.next();
                    if (student.getStudentId() == studentId) {
                        studentFound = true;
                        exam.add(new Exam(generateRecordId(), examId, course, score, student));
                    }
                }
                if (!studentFound) {
                    System.out.println("STUDENT NOT FOUND");
                    System.out.println("----------------------------------");
                }
            }
            if (!courseFound) {
                System.out.println("COURSE NOT FOUND");
                System.out.println("----------------------------------");
            }
        }

    }

    private int generateRecordId() {
        if (this.exam.size() > 0) {
            Exam lastExam = this.exam.get(this.exam.size() - 1);
            int nextId = lastExam.getRecordId() + 1;
            return nextId;
        } else {
            return 1;
        }
    }

    public void displayExamResults() {
        System.out.println("----------------------------------");
        for (Exam exam : exam)
            System.out.println(exam);
        System.out.println("----------------------------------");
    }

    //!needs to be adjusted
    public void editExamInfo() {
        boolean recordFound = false;
        displayExamResults();
        System.out.print("ENTER REC NO TO EDIT: ");
        int recordId = scannerInt.nextInt();
        li = exam.listIterator();
        while (li.hasNext()) {
            Exam exam = (Exam) li.next();
            if (exam.getRecordId() == recordId) {
                System.out.print("ENTER NEW SCORE: ");
                int newScore = scannerInt.nextInt();
                li.set(new Exam(recordId, newScore));
                recordFound = true;
                System.out.println("----------------------------------");
            }
        }
        if (!recordFound) {
            System.out.println("RECORD NOT FOUND");
            System.out.println("----------------------------------");
        }
    }

}



