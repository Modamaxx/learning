package com.learning.hospital.dao.interfaces;

public interface IAbstractDao<T, U> {
    void create(T t);
    T read(U u);
    void update(U u);
    void delete(U u);
}
