package com.counselors.domain;

import java.util.Date;

public class CounselorsVO {
	
	
	private int bno; // 게시물 번호
	private String title; // 게시물 제목
	private String register; // 작성자
	private String password; // 게시물 비밀번호
	private String contract; // 작성자 연락처
	private String email; // 작성자 email
	private Date registeredTime; // 게시 시간
	private String content; // 내용
	
	public void setBno(int bno) {
		this.bno = bno;
	}
	public int getBno() {
		return bno;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setRegister(String reg) {
		this.register = reg;
	}
	public String getRegister() {
		return register;
	}
	
	public void setPassword(String pass) {
		this.password=pass;
	}
	public String getPassword() {
		return password;
	}
	
	public void setContract(String string) {
		this.contract = string;
	}
	public String getContract() {
		return contract;
	}
	
	
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return  email;
	}
	
	public void setRegisteredTime(Date date) {
		this.registeredTime = date;
	}
	public Date getRegisteredTime() {
		return registeredTime;
	}
	
	
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return content;
	}
	
	
	

}
