package com.learning.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private static List<Connection> pool = new ArrayList<>(5);
    private static final int MAX_POOL_SIZE = 5;
    private static int conAmount = 0;


    private ConnectionPool() {}

    public static Connection getConnection() throws SQLException {
        if(pool.size() > 0) {
            return pool.remove(0);
        } else if(conAmount < 5) {
            conAmount++;
            return DriverManager.getConnection("");
        }
        return null;
    }

    public static void releaseCon(Connection con) {
        pool.add(con);
    }
}
