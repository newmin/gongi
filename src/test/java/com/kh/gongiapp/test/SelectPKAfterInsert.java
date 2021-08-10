package com.kh.gongiapp.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

@SpringBootTest
public class SelectPKAfterInsert {

	@Autowired
	private JdbcTemplate jt;
	
	@Test
	@DisplayName("insert후 자동생성된 pk가져오기")
	void getPK() {
	
		String spl = "insert into notice(nnum,writer,title,content) "
				+ "value(notice_nnum_seq.nextval,?,?,?) ";
		
		KeyHolder keyholder = new GeneratedKeyHolder();
		
//		jt.update(new PreparedStatementCreator() {
			
//			@Override
//			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
//				PreparedStatement pstmt = con.prepareStatement(sql,new String[] {"nnum"});
//				pstmt.setString(1,"작성자2");
//				pstmt.setString(2,"제목2");
//				pstmt.setString(3,"내용2");
//				return pstmt;
//			}
//		},keyholder);
		
		
		
	}
}
