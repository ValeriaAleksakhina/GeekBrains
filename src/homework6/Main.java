package homework6;

import homework4.ChemistryTeacher;
import homework4.ShopTeacher;

public class Main {
    public static void main(String[] args) {
        ClassOfTeachers<Teacher> teachers = new ClassOfTeachers<>("teacherss");
        teachers.add(new ChemistryTeacher("Ivan", "Bobrov"));
        teachers.add(new ShopTeacher("Olga", "Sergeevna"));

        for (int index = 0; index < teachers.count(); index++) {
            System.out.println(teachers.get(index));
        }




    }
}
