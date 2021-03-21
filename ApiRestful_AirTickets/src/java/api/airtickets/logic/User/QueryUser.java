/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.airtickets.logic.User;

/**
 *
 * @author bryan
 */
public enum QueryUser {

    //Procedures
    PROCEDURE_GETUSER_ID("{call getUser(?)}"),
    //QUERIES
    CREATE("INSERT INTO User (Id,User,Password,Role) VALUES (?,?,?,?); "),
    READ("SELECT Id,User,Password,Role FROM User WHERE Id=?; "),
    UPDATE("UPDATE User SET User=?,Password=?,Role=? WHERE Id=?; "),
    DELETE("DELETE FROM User WHERE Id=?; ");

//    LIST_USER("SELECT id_usuario, clave_acceso, clave_vencida,rol "
//            + "FROM usuario ORDER BY id_usuario; "),
//    VERIFY("SELECT id_usuario FROM usuario WHERE id_usuario=? "
//            + "AND clave_acceso=?; ");
    QueryUser(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    private final String query;
}
