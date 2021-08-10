package com.kh.gongiapp.dto;

import java.time.LocalDate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class NoticeDTO {
	int nnum;				 	// number(3),
  String writer;  	// varchar2(30),
  String title;			// VARCHAR2(60),
  String content;		// clob,
  LocalDate cdate;	// timestamp default systimestamp,
  LocalDate udate;	// timestamp,


  // "nnum" : 
  // "writer" : 
  // "title" : 
  // "content" : 
  // "cdate" : 
  // "udate" : 


}
