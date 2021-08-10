package com.kh.gongiapp.dao;

import java.util.List;

import com.kh.gongiapp.dto.NoticeDTO;

public interface NoticeDAO {

	void registerNotice(NoticeDTO noticeDTO);
//	NoticeDTO registerNotice(NoticeDTO noticeDTO);
	NoticeDTO readNotice(int nnum);
	NoticeDTO updateNotice(int nnum, NoticeDTO noticeDTO);
	void deleteNotice(int num);
	List<NoticeDTO> allNotice();
}
