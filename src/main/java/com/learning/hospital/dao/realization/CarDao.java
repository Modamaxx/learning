package com.learning.hospital.dao.realization;

import com.learning.hospital.ConnectionPool;
import com.learning.hospital.dao.interfaces.ICarDao;
import com.learning.hospital.pojo.Car;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Log4j2
public class CarDao implements ICarDao {
    private final static String READ_QUERY = "SELECT * FROM Car WHERE id=?";
    @Override
    public List<Car> getListOfCars() {
        return null;
    }

    @Override
    public void create(Car car) {

    }

    @Override
    public Car read(Integer integer) {
        Car car = new Car();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection connection = null;
        try {
          connection = ConnectionPool.getConnection();
          ps = connection.prepareStatement(READ_QUERY);
          ps.setInt(1, integer);
          rs = ps.executeQuery();
          if(rs.next()) {
              car.setId(rs.getInt(1));
              car.setNumber(rs.getString(2));
          }
        } catch (SQLException e) {
            log.error("error while connecting to database", e);
        }
        return car;
    }

    @Override
    public void update(Integer integer) {

    }

    @Override
    public void delete(Integer integer) {

    }
}
