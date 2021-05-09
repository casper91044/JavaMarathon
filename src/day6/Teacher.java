package day6;

import java.util.Random;

public class Teacher {
    private String teacherName;
    private String subject;

    public Teacher(String teacherName, String subject) {
        this.teacherName = teacherName;
        this.subject = subject;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int randomVal = random.nextInt(4) + 2;

        String evaluation = "";
        switch (randomVal) {
            case 2:
                evaluation = "неудовлетворительно";
                break;
            case 3:
                evaluation = "удовлетворительно";
                break;
            case 4:
                evaluation = "хорошо";
                break;
            case 5:
                evaluation = "отлично";
                break;
            default:
                break;
        }
        System.out.println("Преподаватель " + this.teacherName +
                        " оценил студента с именем " + student.getStudentName() +
                " по предмету " + this.subject + " на оценку " + evaluation);
    }
}
