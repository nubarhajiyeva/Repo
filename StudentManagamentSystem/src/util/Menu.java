/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import bean.Config;
import service.menu.MenuLoginService;
import service.menu.MenuRegisterService;
import service.menu.MenuAddStudentService;
import service.menu.MenuAddTeacherService;
import service.menu.MenuShowStudentService;
import service.menu.MenuShowTeacherService;
import static util.MenuUtil.showMenu;
import service.inter.MenuProcess;

/**
 *
 * @author NUBAR
 */
public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_TEACHER(3, "Add teachers", new MenuAddTeacherService()),
    ADD_STUDENT(4, "Add students", new MenuAddStudentService()),
    SHOW_ALL_TEACHER(5, "Show all teachers", new MenuShowTeacherService()),
    SHOW_ALL_STUDENT(6, "Show all students", new MenuShowStudentService()),
    UNKOWN();

    private int number;
    private String label;
    private MenuProcess service;
    

    Menu() {

    }

    Menu(int number, String label, MenuProcess service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return number+"."+label;
    }

    public void process() {
        service.process();
        showMenu();
    }

    public int getNumber() {
        return this.number;
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return Menu.UNKOWN;
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNKOWN) {
                if(menus[i]==LOGIN ||menus[i]==REGISTER){
                    if(!(Config.isLoggedIn()))
                   System.out.println(menus[i]); 
                }else if(Config.isLoggedIn()){
                System.out.println(menus[i]);
                }
            }
        }
    }

}
