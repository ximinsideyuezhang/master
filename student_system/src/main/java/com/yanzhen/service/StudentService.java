package com.yanzhen.service;

import com.yanzhen.dao.StudentDao;
import com.yanzhen.dao.StudentDao;
import com.yanzhen.entity.Student;
import com.yanzhen.entity.Teacher;
import com.yanzhen.utils.BeanMapUtils;
import com.yanzhen.utils.MD5Utils;
import com.yanzhen.utils.MapParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public int create(Student pi) {
        pi.setStuPwd(MD5Utils.getMD5(pi.getStuPwd()));
        return studentDao.create(pi);
    }

    public int delete(Integer id) {
        return studentDao.delete(MapParameter.getInstance().addId(id).getMap());
    }
    public int delete(String ids) {
        int flag = 0;
        for (String str : ids.split(",")) {
            flag = studentDao.delete(MapParameter.getInstance().addId(Integer.parseInt(str)).getMap());
        }
        return flag;
    }

    public int update(Student student) {
        Map<String, Object> map = MapParameter.getInstance().add(BeanMapUtils.beanToMapForUpdate(student)).addId(student.getId()).getMap();
        return studentDao.update(map);
    }

    public List<Student> query(Student student) {
        return studentDao.query(BeanMapUtils.beanToMap(student));
    }

    public Student detail(Integer id) {
        return studentDao.detail(MapParameter.getInstance().addId(id).getMap());
    }

    public int count(Student student) {
        return studentDao.count(BeanMapUtils.beanToMap(student));
    }


    public Student login(String userName, String password){
        Map<String, Object> map = MapParameter.getInstance()
                .add("stuNo", userName)
                .add("stuPwd", password)
                .getMap();
        return studentDao.detail(map);
    }

    public List<HashMap> querySelectStudent(Integer courseId, Integer sectionId){
        Map<String, Object> map = MapParameter.getInstance()
                .add("courseId", courseId)
                .add("sectionId", sectionId)
                .getMap();
        return studentDao.querySelectStudent(map);
    }

    public List<Student> queryStudentByTeacher(Integer teacherId,Integer clazzId,Integer subjectId){
        Map<String, Object> map = MapParameter.getInstance()
                .add("teacherId", teacherId)
                .add("clazzId", clazzId)
                .add("subjectId", subjectId)
                .getMap();
        return studentDao.queryStudentByTeacher(map);
    }

}
