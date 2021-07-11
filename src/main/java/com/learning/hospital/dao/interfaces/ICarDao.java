package com.learning.hospital.dao.interfaces;

import com.learning.hospital.pojo.Car;

import java.util.List;

public interface ICarDao extends IAbstractDao<Car, Integer> {
    List<Car> getListOfCars();
}
