package com.yanzhen.dao;

import java.util.List;
import java.util.Map;

import com.yanzhen.entity.Clazz;

public interface ClazzDao {
    public int create(Clazz pi);

    public int delete(Map<String, Object> paramMap);

    public int update(Map<String, Object> paramMap);

    public List<Clazz> query(Map<String, Object> paramMap);

    public Clazz detail(Map<String, Object> paramMap);

    public int count(Map<String, Object> paramMap);
}