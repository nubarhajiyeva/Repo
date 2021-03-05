/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.inter;

import bean.Config;
import java.io.Serializable;

/**
 *
 * @author NUBAR
 */
public interface MenuProcess {
     
    public abstract void processLogic();
   
    public default void process(){
       processLogic();
    }
}
