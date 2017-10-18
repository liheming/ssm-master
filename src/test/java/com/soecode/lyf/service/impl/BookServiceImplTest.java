package com.soecode.lyf.service.impl;

import com.soecode.lyf.BaseTest;
import com.soecode.lyf.dto.AppointExecution;
import com.soecode.lyf.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImplTest extends BaseTest {

	@Autowired
	private BookService bookService;

	@Test
	public void testAppoint() throws Exception {
		long bookId = 1001;
		long studentId = 12345678910L;
		AppointExecution execution = bookService.appoint(bookId, studentId);
		System.out.println(execution);
	}
	public static void main(String[] args) {
		System.out.println("hello world ");
		BookServiceImplTest bookServiceImplTest = new BookServiceImplTest();
		try {
			bookServiceImplTest.testAppoint();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
