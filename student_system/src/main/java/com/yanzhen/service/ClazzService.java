package com.yanzhen.service;

import com.github.pagehelper.PageHelper;
import com.yanzhen.dao.ClazzDao;
import com.yanzhen.dao.UserDao;
import com.yanzhen.entity.Clazz;
import com.yanzhen.entity.User;
import com.yanzhen.utils.BeanMapUtils;
import com.yanzhen.utils.MapParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ClazzService {

    @Autowired
    private ClazzDao clazzDao;

    public int create(Clazz pi) {
        return clazzDao.create(pi);
    }

    public int delete(Integer id) {
        return clazzDao.delete(MapParameter.getInstance().addId(id).getMap());
    }

    public int delete(String ids) {
        int flag = 0;
        for (String str : ids.split(",")) {
            flag = clazzDao.delete(MapParameter.getInstance().addId(Integer.parseInt(str)).getMap());
        }
        return flag;
    }

    public int update(Clazz clazz) {
        return clazzDao.update(MapParameter.getInstance().add(BeanMapUtils.beanToMapForUpdate(clazz)).addId(clazz.getId()).getMap());
    }

    public List<Clazz> query(Clazz clazz) {
        if(clazz != null && clazz.getPage() != null){
            PageHelper.startPage(clazz.getPage(),clazz.getLimit());
        }
        return clazzDao.query(BeanMapUtils.beanToMap(clazz));
    }

    public Clazz detail(Integer id) {
        return clazzDao.detail(MapParameter.getInstance().addId(id).getMap());
    }

    public int count(Clazz clazz) {
        return clazzDao.count(BeanMapUtils.beanToMap(clazz));
    }

}
