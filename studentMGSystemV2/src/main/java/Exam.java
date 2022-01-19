public class Exam {

    private int recordId;
    private int examId;
    private Course course;
    private int score;
    private Student student;

    public Exam() {}

    public Exam(int recordId, int score) {
        this.recordId = recordId;
        this.score = score;
    }

    public Exam(int recordId, int examId, Course course, int score, Student student) {
        this.recordId = recordId;
        this.examId = examId;
        this.course = course;
        this.score = score;
        this.student = student;

    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public Course getCourseName() {
        return course;
    }

    public Course getCourseId () {
        return course;
    }

    public void setCourseName(Course course) {
        this.course = course;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student getStudentId() {
        return student;
    }

    public void setStudentId(Student student) {
        this.student = student;
    }


    @Override
    public String toString() {
        return "REC No: " + recordId + "EXAM ID" + examId + ", COURSE " + course.getCourseName() + ", SCORE " + score + ", STUDENT ID" + student.getStudentId() + ", NAME " + student.getStudentName();
    }
}
