/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Config;
import bean.Teacher;
import java.util.Scanner;
import menu.service.inter.MenuAddTeacherServiceInter;

/**
 *
 * @author NUBAR
 */
public class MenuAddTeacherService implements MenuAddTeacherServiceInter{

    @Override
    public void processLogic() {
    
           Scanner sc = new Scanner(System.in);
        System.out.println("please enter name:");
        String name=sc.nextLine();
        
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("please enter surname:");
        String surname=sc2.nextLine();
        
        
        Scanner sc3 = new Scanner(System.in);
        System.out.println(" enter salary :");
        double salary=sc.nextDouble();
        
       Teacher t=new Teacher();
        t.setName(name);
        t.setSurname(surname);
        t.setSalary(salary);
        
       Config.instance().appendTeacher(t);
        System.out.println("teacher added");
    }
    
}
