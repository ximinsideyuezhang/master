package com.yanzhen.service;

import com.yanzhen.dao.JobDao;
import com.yanzhen.entity.Job;
import com.yanzhen.utils.BeanMapUtils;
import com.yanzhen.utils.MapParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class JobService {

    @Autowired
    private JobDao jobDao;

    public int create(Job pi) {
        return jobDao.create(pi);
    }

    public int delete(Integer id) {
        return jobDao.delete(MapParameter.getInstance().addId(id).getMap());
    }

    public int update(Job job) {
        Map<String, Object> map = MapParameter.getInstance().add(BeanMapUtils.beanToMapForUpdate(job)).addId(job.getId()).getMap();
        return jobDao.update(map);
    }

    public List<Job> query(Job job) {
        return jobDao.query(BeanMapUtils.beanToMap(job));
    }

    public Job detail(Integer id) {
        return jobDao.detail(MapParameter.getInstance().addId(id).getMap());
    }

    public Job detailByStudent(Integer stuId) {
        return jobDao.detail(MapParameter.getInstance().add("stuId",stuId).getMap());
    }

    public int count(Job job) {
        return jobDao.count(BeanMapUtils.beanToMap(job));
    }

}
