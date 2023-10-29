package homework5;

import homework5.StudentModel;
import homework5.TeacherModel;
import homework5.UserView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherModel teacher = new TeacherModel("Oleg Pertrov", 20, "001");
        StudentModel student1 = new StudentModel("Victor Ivanov", 26, "k003");
        StudentModel student2 = new StudentModel("Sveta Semenova", 50, "k005");
        UserView userView = new UserView();
        userView.saveGroup(new TeacherModel(teacher.getTeacherId()),
                (List.of(new StudentModel(student1.getStudentId()), new StudentModel(student2.getStudentId()))), "group1");
        userView.getGroup("group1");

    }
}
