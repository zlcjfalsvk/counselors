package com.counselors.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.counselors.domain.CounselorsVO;
import com.counselors.domain.FileVO;
import com.counselors.mapper.CounselorsMapper;
 

@Controller
public class boardController {

	@Autowired
	private CounselorsMapper conMapper;
	
	
	// List �۸��
	@RequestMapping(value = "/counselors/", method = RequestMethod.GET)
	public ModelAndView counselorList() throws Exception {
		
		List<CounselorsVO> list = conMapper.counselorList();
		return new ModelAndView("counselorsList", "list", list);

	}

	
	
	// �� ���� ������
	@RequestMapping(value = "/counselors", method = RequestMethod.GET)
	public ModelAndView counselorWrite( ) throws Exception {
	
		return new ModelAndView("counselorsWriter");
	}

	
	
	// �� �ۼ�
	@RequestMapping(value = "/counselors", method = RequestMethod.POST)
	public String write(@ModelAttribute("CounselorsVO") CounselorsVO con,
			@ModelAttribute("FileVO") FileVO fo,
			HttpServletRequest request,@RequestPart MultipartFile files) throws Exception {
		
		
		
		if(files.isEmpty()) {
			conMapper.counselorInsert(con);
		}else {
			 
 	
		String FileName = files.getOriginalFilename();
		String FileNameExtension = FilenameUtils.getExtension(FileName).toLowerCase();
 
		File destinationFile;
		String destinationFileName;
		String fileUrl="c://cheolmin//java//counselors//src//main//webapp//WEB-INF//uploadFiles//";
		
	
		do {
			destinationFileName = RandomStringUtils.randomAlphanumeric(32)+"."+FileNameExtension;
			destinationFile= new File(fileUrl+destinationFileName);
			
		}while(destinationFile.exists());
		
		destinationFile.getParentFile().mkdirs();
		files.transferTo(destinationFile);
		
		
		conMapper.counselorInsert(con);
		
		
		fo.setBno(con.getBno());
		fo.setFileName(destinationFileName);
		fo.setFileOriName(FileName);
		fo.setFileUrl("asdf");
		
		conMapper.fileInsert(fo);
		
		}
		return "redirect://localhost:8080/counselors/";

	}
	
	
	

	// �� �� ����
	@RequestMapping(value = "/counselors/{bno}", method = RequestMethod.GET)
	public ModelAndView counselorView(@PathVariable("bno") int bno) throws Exception {
		CounselorsVO counselorVO = conMapper.counselorView(bno);
		return new ModelAndView("counselorsView", "counselorVO", counselorVO);
	}
	
	

	// �� ����
	@RequestMapping(value = "/counselors/{bno}", method = RequestMethod.DELETE)
	public String counselorDelete(@PathVariable("bno") int bno) throws Exception {
		conMapper.counselorDelete(bno);
		return "redirect://localhost:8080/counselors/";
	}
	
	

	// �� ���� get
	@RequestMapping(value = "/counselors/{bno}/{password}", method = RequestMethod.GET)
	public ModelAndView counselorUpdate(@PathVariable("bno") int bno,HttpServletRequest request) throws Exception {
		CounselorsVO counselorVO = conMapper.counselorView(bno);
		return new ModelAndView("counselorsUpdate", "counselorVO", counselorVO);
	}
	
	
	

	// �� ����put
	@RequestMapping(value = "/counselors/{bno}", method = RequestMethod.PUT)
	public String Update(@ModelAttribute("CounselorsVO") CounselorsVO conVo, @PathVariable("bno") int bno)
			throws Exception {
		conMapper.counselorUpdate(conVo);
		return "redirect://localhost:8080/counselors/";
	}

}
