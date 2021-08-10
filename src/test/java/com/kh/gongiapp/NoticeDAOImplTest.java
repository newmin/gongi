package com.kh.gongiapp;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.kh.gongiapp.dao.NoticeDAO;
import com.kh.gongiapp.dto.NoticeDTO;

@SpringBootTest
//@Transactional
public class NoticeDAOImplTest {

	@Autowired
	private NoticeDAO noticeDAO;
	
	@Test
	@DisplayName("공지등록")
	@Disabled
	void registerNotice() {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setWriter("글쓴이입니다");
		noticeDTO.setTitle("제목입니다");
		noticeDTO.setContent("이곳은 본문내용입니다.");
		
		 noticeDAO.registerNotice(noticeDTO);
//		return noticeDAO.readNotice(noticeDTO.getNnum());
	}
//	@Test
//	@DisplayName("공지조회")
//	NoticeDTO readNotice(int nnum) {
//		return noticeDAO.readNotice(nnum);
//	}

	@Test
	@DisplayName("공지수정")
	@Disabled
	void updateNotice() {
		int nnum = 2;
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setWriter("바꼈습니다");
		noticeDTO.setTitle("제목두요");
		noticeDTO.setContent("내용도 벗어나지 못했습니다.");
		noticeDAO.updateNotice(nnum,noticeDTO);
	}
	
	@Test
	@DisplayName("공지삭제")
	@Disabled
	void deleteNotice() {
		int nnum = 8;
		noticeDAO.deleteNotice(nnum);
	}
	@Test
	@DisplayName("공지전체조회")
	void allNotice() {
		noticeDAO.allNotice();
	}
	
}
