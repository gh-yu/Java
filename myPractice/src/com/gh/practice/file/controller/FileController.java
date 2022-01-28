package com.gh.practice.file.controller;

import com.gh.practice.file.model.dao.FileDAO;

public class FileController {

	FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		
		return fd.checkName(file);
	}

	public void fileSave(String file, StringBuilder sb) {

//		String[] strArr = new String[str.length()]; 
//		String[] strArr = str.split("\n"); // ���� cher�迭�� �Ѱ��ٰŸ� split�ؼ� fd.fileSave�� �Ѱ��༭ for�� ������ �� �پ� ����� ���� ����
		
		String str = sb.substring(0, sb.length()); // StringBuilder�ڷ��� sb�� String���� �ٲٴ� ����
//		String str = sb.toString(); // �̷��Ե� ����
		fd.fileSave(file, str);
	}

	public StringBuilder fileOpen(String file) {
		
		return fd.fileOpen(file);
	}

	public void fileEdit(String file, StringBuilder sb) {
		
		String str = sb.substring(0, sb.length());
		
		fd.fileEdit(file, str);
	}

}