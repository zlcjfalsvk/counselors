package com.counselors;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.counselors.domain.CounselorsVO;
import com.counselors.mapper.CounselorsMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CounselorsApplication.class)
@WebAppConfiguration
public class CounselorsApplicationTests {

	@Autowired
	private CounselorsMapper mapper;

	// @Autowired
	// private DataSource ds;
	// @Autowired
	// private SqlSessionFactory sqlSession;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testMapper() throws Exception {
		CounselorsVO vo = new CounselorsVO();

		vo.setTitle("test");
		vo.setRegister("cheolmin");
		vo.setPassword("123123"); 
		vo.setEmail("zl123vk@naver.com");
		vo.setContent("Hello World");

		mapper.counselorInsert(vo);

		// System.out.println("ds : "+ds);
		//
		// Connection con = ds.getConnection(); //ds(DataSource)에서 Connection을 얻어내고
		//
		// System.out.println("con : "+con); //확인 후
		//
		// con.close(); //close

	}

	// @Test
	// public void testSqlSession() throws Exception {
	//
	// System.out.println("sqlSession : " + sqlSession);
	//
	// }

}
