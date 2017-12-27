package chapter.ten.homework;
import java.util.Scanner;

import softcits.exception.demo.CustomExeption;

public class CustomExpDemo {

	private static String mobile;

	public static void judgeMobile() {
		if (mobile.length() < 11) {
			// 抛出业务异常
			throw new CustomExeption("手机位数不对");
		}

		else if ((!mobile.matches("^[0-9]*$")))// 手机号码里必须为数字。。。。。
		{
			throw new CustomExeption("手机号必须为数字");
		} else if (mobile == null || "".equals(mobile.trim()))// 手机号不能为空。。。。。。。
		{
			throw new CustomExeption("手机号不能为空");

		}
	}

	public static void main(String[] args) {
		mobile = "啦啊啊了12346";

		try {
			judgeMobile();
		} catch (CustomExeption ce) {
			System.out.println(ce.getMessage());
		}

	}

}
