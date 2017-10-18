package com.counselors.mapper;

import java.util.List;

import com.counselors.domain.CounselorsVO;

public interface CounselorsMapper {
	
	
	
	//�Խù� ����Ʈ ��ȸ
	public  List<CounselorsVO> counselorList() throws Exception;
	
	//�Խù� ����
	public void counselorInsert(CounselorsVO vo) throws Exception;
	
	//�Խù� ����
	public void counselorUpdate(CounselorsVO vo) throws Exception;
	
	//�Խù� ����
	public void counselorDelete(int bno) throws Exception;
	
	//�Խù� �� ��ȸ
	public CounselorsVO counselorView(int bno) throws Exception;
	 

}
