package com.counselors.mapper;

import java.util.List;

import com.counselors.domain.CounselorsVO;

public interface CounselorsMapper {
	
	
	
	//게시물 리스트 조회
	public  List<CounselorsVO> counselorList() throws Exception;
	
	//게시물 삽입
	public void counselorInsert(CounselorsVO vo) throws Exception;
	
	//게시물 수정
	public void counselorUpdate(CounselorsVO vo) throws Exception;
	
	//게시물 삭제
	public void counselorDelete(int bno) throws Exception;
	
	//게시물 상세 조회
	public CounselorsVO counselorView(int bno) throws Exception;
	 

}
