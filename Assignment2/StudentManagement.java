package Assignment2;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentManagement {
    ArrayList<Student>studlist = new ArrayList<>();
    HashMap<Integer,Student> sMap = new HashMap<>();

    public void AddStudent(Student stud) {
        if(sMap.containsKey(stud.getid())) {
            System.out.println("Record Already Exists");
            return;
        }
        studlist.add(stud);
        sMap.put(stud.getid(),stud);
    }

    public void Display() {
        if(studlist.isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        for(Student s : studlist) {
            System.out.println(s);
        }
    }
    public void search(int id) throws StudentNotFoundException {
        Student stud = sMap.get(id);

        if(stud==null) {
            throw new StudentNotFoundException("Student Record Not Exists");
        }
        System.out.println(stud);

    }
    public void update(int id,float marks) throws StudentNotFoundException{
        Student stud = sMap.get(id);
            if(stud==null) {
            throw new StudentNotFoundException("Student Record Not Exists");
        }

        stud.setmarks(marks);
        
        System.out.println(stud);
    }
    public void delete(int id) throws StudentNotFoundException {
        Student stud = sMap.get(id);
        if(stud==null) {
            throw new StudentNotFoundException("Student Record Not Exists");
        }

        studlist.remove(stud);
        sMap.remove(id);
    }
}
