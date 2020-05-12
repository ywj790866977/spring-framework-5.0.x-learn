package com.yanlaoge.test;

import com.yanlaoge.config.Appconfig;
import com.yanlaoge.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 好人
 * @date 2020-05-11 21:13
 **/
public class Domain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Appconfig.class);
		UserDao  userDao = context.getBean(UserDao.class);
		System.out.println(userDao);
	}
}
