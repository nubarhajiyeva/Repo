/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.inter;

import bean.Config;

/**
 *
 * @author NUBAR
 */
public interface SaveableProcess extends MenuProcess {
    public default void process(){
      processLogic();
        Config.save();
    }
}
