package com.gh.practice.numRange.controller;

import com.gh.practice.numRange.exception.NumRangeException;

public class NumberController {

	public boolean checkDouble (int num1, int num2) throws NumRangeException {
		
		if (num1 >= 1 && num1 <= 100 && num2 >= 1 && num2 <= 100) {
			if (num1 % num2 == 0) {
				return true;
			} else {
				return false;
			}
		} else {
//			throw new NumRangeException("���� �߻�!"); 
			// 			NumRangeException(String msg)
			// new�����ڷ� ���� ��ü ���� �� String�� �Ű������� �ϴ� ������ȣ��, ����(��ü) ������(throw)
			throw new NumRangeException("1���� 100 ������ ���� �ƴմϴ�."); 
		}

	}

}