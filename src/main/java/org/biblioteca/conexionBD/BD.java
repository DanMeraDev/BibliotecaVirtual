package org.biblioteca.conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;

public class BD {

    public Connection getConnection() throws Exception {
        return DriverManager.getConnection("");
    }
}
