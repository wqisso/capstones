package com.postgraduate.utils;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.postgraduate.controller.LesTeaController;
import com.postgraduate.controller.SelCourseController;
import com.postgraduate.controller.StudentController;
import com.postgraduate.controller.TrainController;
import com.postgraduate.mapper.TbSelCourseMapper;
import com.postgraduate.pojo.TbLesTea;
import com.postgraduate.pojo.TbLesson;
import com.postgraduate.pojo.TbSelCourse;
import com.postgraduate.pojo.TbStudent;
import com.postgraduate.pojo.TbTrain;
import com.postgraduate.pojo.TbUsers;
import com.postgraduate.service.LessonService;
import com.postgraduate.service.SelCourseService;
import com.postgraduate.service.StudentService;
import com.postgraduate.service.TrainService;
import com.postgraduate.service.UsersService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring/applicationContext-*.xml",
        "classpath:spring/springmvc.xml" })
public class test {
	@Resource
    private LessonService plessonService;
	
	
	@Test
    public void findUserTest(){
		TbLesson plesson =new TbLesson();
		//plesson.setId(1);
		plesson.setName("物联网");
		List<TbLesson> plesson2 = plessonService.selectPart(plesson);
		for (TbLesson str : plesson2) {
            System.out.println(JSON.toJSONString(str));
        }
    }
	
	@Resource
	private TbSelCourseMapper les;
	
	@Test
	public void Test1() {
		List<TbSelCourse> list = les.selectAll(201621001);
		System.out.println(list.size());
		for(TbSelCourse l:list) {
			System.out.println(l);
		}
		
		
	}
	

}
