/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Student;
import java.util.Scanner;
import menu.service.inter.MenuAddStudentServiceInter;
import bean.Config;

/**
 *
 * @author NUBAR
 */
public class MenuAddStudentService implements MenuAddStudentServiceInter {

    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter name:");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("please enter surname:");
        String surname = sc2.nextLine();

        Scanner sc3 = new Scanner(System.in);
        System.out.println(" enter schoolarship if have:");
        double schoolarship = sc.nextDouble();

        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);
        s.setSchoolarship(schoolarship);

        Config.instance().appendStudent(s);
        System.out.println("student added");
     
    }
}
