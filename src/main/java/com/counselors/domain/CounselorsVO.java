package com.counselors.domain;

import java.util.Date;

public class CounselorsVO {
	
	
	private int bno; // �Խù� ��ȣ
	private String title; // �Խù� ����
	private String register; // �ۼ���
	private String password; // �Խù� ��й�ȣ
	private String contract; // �ۼ��� ����ó
	private String email; // �ۼ��� email
	private Date registeredTime; // �Խ� �ð�
	private String content; // ����
	
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
