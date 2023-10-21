package homework4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassOfTeachers<Teacher> teachers = new ClassOfTeachers<>("teachers");
        teachers.add(new ChemistryTeacher("Ivan", "Bobrov"));
        teachers.add(new ShopTeacher("Olga", "Sergeevna"));

        for (int index = 0; index < teachers.count(); index++) {
            System.out.println(teachers.get(index));
        }




    }
}