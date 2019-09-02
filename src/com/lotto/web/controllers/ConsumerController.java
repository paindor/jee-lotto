package com.lotto.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lotto.web.domains.ConsumerBean;
import com.lotto.web.serviceimpls.ConsumerServiceImpl;
import com.lotto.web.services.ConsumerService;

/**
 * Servlet implementation class ConsumerController
 */
@WebServlet("/Consumer.do")
public class ConsumerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ㄴㅇㅇㄻㄴ");
		String cid = request.getParameter("cid");
		String pw = request.getParameter("pw");
		ConsumerBean param = new ConsumerBean();
		param.setCid(cid);
		param.setPw(pw);
		ConsumerService cs = new ConsumerServiceImpl();
		cs.registConsumer(param);
		System.out.println(param.toString());
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
