/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.airtickets.model;

import api.airtickets.logic.InfoUser.DaoInfoUser;
import api.airtickets.logic.InfoUser.InfoUser;

/**
 *
 * @author bryan
 */
public class InfoUserModel {

    public boolean updateInfoUser(InfoUser infoUser) {
        return dao.updateInfoUser(infoUser);
    }

    public boolean addInfoUser(InfoUser infoUser) {
        return dao.addInfoUser(infoUser);
    }

    public InfoUser getInfoUserByID(String id) {
        return dao.getInfoUserById(id).get();
    }

    public InfoUserModel() {
        dao = DaoInfoUser.getInstance();
    }

//    public static InfoUserModel getInstance() {
//        if (instance == null) {
//            instance = new InfoUserModel();
//        }
//        return instance;
//    }
//
//    private static InfoUserModel instance = null;
    private final DaoInfoUser dao;

}
