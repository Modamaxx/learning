package com.learning.hospital.service;

import com.learning.hospital.dao.interfaces.ICarDao;
import com.learning.hospital.dao.realization.CarDao;

public class CarService {

    public void carService() {
        ICarDao carDao = new CarDao();
    }
}
