package com.kh.gongiapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.gongiapp.dto.NoticeDTO;
import com.kh.gongiapp.svc.NoticeSVC;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/notice")
// @RequiredArgsConstructor
public class NoticeController {
	
	@Autowired
	private NoticeSVC noticeSVC;
	// private final NoticeSVC noticeSVC;
	
//	공지리스트 전체조회
	@GetMapping("")
	String allNotice() {
		noticeSVC.allNotice();
		return "notice/list";
	}
//	공지 조회
	@GetMapping("/{nnum}")
	String notice(int nnum) {
		noticeSVC.readNotice(nnum);
//TODO		return "notice/{nnum}";
		return "notice/samplePost";
	}
//	공지 등록 페이지
	@GetMapping("/register")
	String registerForm() {
		return "notice/registerForm";
	}
//	공지 등록
	@PostMapping("/register")
	String register(NoticeDTO noticeDTO) {
		noticeSVC.registerNotice(noticeDTO);
//		noticeSVC.readNotice(noticeDTO.getNnum());
//		return "redirect:/notice/{nnum}";
		return "notice/samplePost";
//		return "redirect:/notice/samplePost";
		//TODO
	}
	// 수정폼
	@GetMapping("/update")
	String updateForm(int nnum) {
		return "notice/updateForm";
	}
	//수정 처리
	@PatchMapping("/update")
	String update(int nnum, NoticeDTO noticeDTO) {
		noticeSVC.updateNotice(nnum, noticeDTO);
//		return "redirect:/notice/{nnum}";
		return "redirect:/notice/samplePost";
	}
	//공지 삭제
	@DeleteMapping("/delete")
	String delete(int nnum) {
		noticeSVC.deleteNotice(nnum);
		return "redirect:/notice/list";
	}
	
}
