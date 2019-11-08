package com.atguigu.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class MybatisTest {
	
	
	@Test
	public void test() throws IOException {
		
		String resource = "mybatis.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);	
		System.out.println(sqlSessionFactory);
		
		SqlSession session = sqlSessionFactory.openSession();
		
		Object one = session.selectOne("hello.s", 1);
		
		System.out.println(one);
		
	}

}
