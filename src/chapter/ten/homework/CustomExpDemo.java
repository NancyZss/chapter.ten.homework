package chapter.ten.homework;
import java.util.Scanner;

import softcits.exception.demo.CustomExeption;

public class CustomExpDemo {

	private static String mobile;

	public static void judgeMobile() {
		if (mobile.length() < 11) {
			// �׳�ҵ���쳣
			throw new CustomExeption("�ֻ�λ������");
		}

		else if ((!mobile.matches("^[0-9]*$")))// �ֻ����������Ϊ���֡���������
		{
			throw new CustomExeption("�ֻ��ű���Ϊ����");
		} else if (mobile == null || "".equals(mobile.trim()))// �ֻ��Ų���Ϊ�ա�������������
		{
			throw new CustomExeption("�ֻ��Ų���Ϊ��");

		}
	}

	public static void main(String[] args) {
		mobile = "��������12346";

		try {
			judgeMobile();
		} catch (CustomExeption ce) {
			System.out.println(ce.getMessage());
		}

	}

}
