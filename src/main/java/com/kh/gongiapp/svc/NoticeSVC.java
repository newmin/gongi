package com.kh.gongiapp.svc;

import java.util.List;

import com.kh.gongiapp.dto.NoticeDTO;

public interface NoticeSVC {

	void registerNotice(NoticeDTO noticeDTO);
//	NoticeDTO registerNotice(NoticeDTO noticeDTO);
	NoticeDTO readNotice(int nnum);
	NoticeDTO updateNotice(int nnum, NoticeDTO noticeDTO);
	void deleteNotice(int num);
	List<NoticeDTO> allNotice();
}
