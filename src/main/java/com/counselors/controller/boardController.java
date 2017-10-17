package com.counselors.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.boot.domain.BoardVO;
import com.counselors.domain.CounselorsVO;
import com.counselors.mapper.CounselorsMapper;

@Controller
public class boardController {

	@Autowired
	private CounselorsMapper conMapper;

	// List 글목록
	@RequestMapping(value = "/counselors/", method = RequestMethod.GET)
	public ModelAndView counselorList() throws Exception {
		List<CounselorsVO> list = conMapper.counselorList();
		return new ModelAndView("counselorsList", "list", list);

	}

	// 글 생성 페이지
	@RequestMapping(value = "/counselors", method = RequestMethod.GET)
	public ModelAndView counselorWrite() throws Exception {
		return new ModelAndView("counselorsWriter");
	}

	// 글 작성
	@RequestMapping(value = "/counselors", method = RequestMethod.POST)
	public String write(@ModelAttribute("CounselorsVO") CounselorsVO con) throws Exception {
		conMapper.counselorInsert(con);
		return "redirect://localhost:8080/counselors/";

	}

	// 글 상세 정보
	@RequestMapping(value = "/counselors/{bno}", method = RequestMethod.GET)
	public ModelAndView counselorView(@PathVariable("bno") int bno) throws Exception {
		CounselorsVO counselorVO = conMapper.counselorView(bno);
		return new ModelAndView("counselorsView", "counselorVO", counselorVO);
	}

	// 글 삭제
	@RequestMapping(value = "/counselors/{bno}", method = RequestMethod.DELETE)
	public String counselorDelete(@PathVariable("bno") int bno) throws Exception {
		conMapper.counselorDelete(bno);
		return "redirect://localhost:8080/counselors/";
	}

	// 글 수정 get
	// 글 상세 정보
	@RequestMapping(value = "/counselors/{bno}", method = RequestMethod.GET)
	public ModelAndView counselorUpdate(@PathVariable("bno") int bno) throws Exception {
		CounselorsVO counselorVO = conMapper.counselorView(bno);
		return new ModelAndView("counselorsUpdate", "counselorVO", counselorVO);
	}

	// 글 수정put
	@RequestMapping(value = "/counselors/{bno}", method = RequestMethod.PUT)
	public String Update(@ModelAttribute("CounselorsVO") CounselorsVO conVo, @PathVariable("bno") int bno)
			throws Exception {
		conMapper.counselorUpdate(conVo);
		return "redirect://localhost:8080/counselors/";
	}

}
