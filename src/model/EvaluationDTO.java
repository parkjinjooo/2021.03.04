package model;

import java.util.Calendar;

public class EvaluationDTO {
    // 필드
    private int id;
    private int teacherId;
    private int studentId;
    private String content;
    private Calendar writtenDate;

    // getters/setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Calendar getWrittenDate() {
        return writtenDate;
    }

    public void setWrittenDate(Calendar writtenDate) {
        this.writtenDate = writtenDate;
    }

    // equals()
    public boolean equals(Object o) {
        if (o instanceof EvaluationDTO) {
            EvaluationDTO e = (EvaluationDTO) o;
            if (id == e.id) {
                return true;
            }
        }
        return false;
    }

}
