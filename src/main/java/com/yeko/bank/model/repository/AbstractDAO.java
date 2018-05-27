package com.yeko.bank.model.repository;

import com.yeko.bank.model.specific_operation.ToSQL;
import java.util.List;

public interface AbstractDAO<T> {

  boolean add(T item);
  boolean update(T item);
  boolean remove(T item);
  List<T> query(ToSQL toSQL);
  T getById(int id);
}
