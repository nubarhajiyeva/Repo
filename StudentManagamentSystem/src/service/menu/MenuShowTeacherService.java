/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.menu;

import bean.Config;
import bean.Teacher;
import menu.service.inter.MenuShowTeacherServiceInter;

/**
 *
 * @author NUBAR
 */
public class MenuShowTeacherService implements MenuShowTeacherServiceInter{

    @Override
    public void processLogic() {
       Teacher[] allteachers=Config.instance().getTeachers();
        for (int i = 0; i <allteachers.length; i++) {
            System.out.println(allteachers[i]);
        }
    }
    
}
