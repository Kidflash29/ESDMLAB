package Assignment2;

public class Student {
    private int id;
    private String name;
    private String dept;
    private float marks;

    Student(int id,String name,String dept,float marks) {
       this.id = id;
       this.name = name;
       this.dept = dept;
       this.marks = marks;
    }

    void setid(int id) {
        this.id = id;
    }
    int getid() {
        return id;
    }
    void setname(String name) {
        this.name = name;
    }
    String getname() {
        return name;
    }
    void setdept(String dept) {
        this.dept = dept;
    }
    String getdept() {
        return dept;
    }
    void setmarks(float marks) {
        this.marks = marks;
    }
    float getmarks() {
        return marks;
    }

    public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("Student={");
    sb.append("Student ID:").append(id);
    sb.append(" Name:").append(name);
    sb.append(" Department:").append(dept);
    sb.append(" zMarks:").append(marks);
    sb.append("}");

return sb.toString();
    }

}
