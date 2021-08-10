package com.kh.gongiapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.gongiapp.dto.NoticeDTO;

import lombok.RequiredArgsConstructor;

@Repository
// @RequiredArgsConstructor
public class NoticeDAOImpl implements NoticeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	// private final JdbcTemplate jdbcTemplate;
	
	@Override
	public void registerNotice(NoticeDTO noticeDTO) {
//		public NoticeDTO registerNotice(NoticeDTO noticeDTO) {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into notice(nnum,writer,title,content) values(notice_nnum_seq.nextval,?,?,?)");
		
		jdbcTemplate.update(sql.toString(),
												noticeDTO.getWriter(),
												noticeDTO.getTitle(),
												noticeDTO.getContent());
//		return readNotice(noticeDTO.getNnum());
	}

	@Override
	public NoticeDTO readNotice(int nnum) {
		StringBuffer sql = new StringBuffer();
		 sql.append("select nnum,writer,title,content,cdate,udate ");
		 sql.append("from notice ");
		 sql.append("where nnum= ? ");
		 
		 NoticeDTO noticeDTO = jdbcTemplate.queryForObject(
				 		sql.toString(),
				 		new BeanPropertyRowMapper<>(NoticeDTO.class),
				 		nnum);
		return noticeDTO;
	}

	@Override
	public NoticeDTO updateNotice(int nnum, NoticeDTO noticeDTO) {
		StringBuffer sql = new StringBuffer();
		sql.append("update notice ");
		sql.append("set writer= ?, ");
		sql.append("		title = ?, ");
		sql.append("	content = ? ");
		sql.append("where nnum= ? ");
		 
		jdbcTemplate.update(sql.toString(),
												noticeDTO.getWriter(),
												noticeDTO.getTitle(),
												noticeDTO.getContent(),
												nnum);
		 
		return readNotice(nnum);
	}

	@Override
	public void deleteNotice(int nnum) {
		StringBuffer sql = new StringBuffer();
		
		sql.append("DELETE FROM notice ");
		sql.append("where nnum = ? ");
		jdbcTemplate.update(sql.toString(),nnum);

	}

	@Override
	public List<NoticeDTO> allNotice() {
		StringBuffer sql = new StringBuffer();
		sql.append("select nnum,writer,title,content,cdate,udate ");
		sql.append("from notice ");
		 
		List<NoticeDTO> list = jdbcTemplate.query(
		 		sql.toString(),
		 		new BeanPropertyRowMapper<>(NoticeDTO.class));
return list;
	}

}
