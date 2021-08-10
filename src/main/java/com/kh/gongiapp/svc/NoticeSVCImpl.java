package com.kh.gongiapp.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.gongiapp.dao.NoticeDAO;
import com.kh.gongiapp.dto.NoticeDTO;

import lombok.RequiredArgsConstructor;

@Service
public class NoticeSVCImpl implements NoticeSVC{

	@Autowired
	private NoticeDAO noticeDAO;
	
	@Override
//	public NoticeDTO registerNotice(NoticeDTO noticeDTO) {
	public void registerNotice(NoticeDTO noticeDTO) {
		noticeDAO.registerNotice(noticeDTO);
//		return noticeDAO.registerNotice(noticeDTO);
		
	}
	@Override
	public NoticeDTO readNotice(int nnum) {
		return noticeDAO.readNotice(nnum);
	}
	@Override
	public NoticeDTO updateNotice(int nnum, NoticeDTO noticeDTO) {
		return noticeDAO.updateNotice(nnum, noticeDTO);
	}
	@Override
	public void deleteNotice(int num) {
		noticeDAO.deleteNotice(num);		
	}
	@Override
	public List<NoticeDTO> allNotice() {
		return noticeDAO.allNotice();
	}
}
