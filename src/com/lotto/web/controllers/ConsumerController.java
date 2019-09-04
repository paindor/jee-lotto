package com.lotto.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lotto.web.domains.ConsumerBean;
import com.lotto.web.pool.Const;
import com.lotto.web.serviceimpls.ConsumerServiceImpl;
import com.lotto.web.services.ConsumerService;

/**
 * Servlet implementation class ConsumerController
 */
@WebServlet("/consumer.do")
public class ConsumerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		switch(request.getParameter("action")) {
		case "move":
			request.getRequestDispatcher(
					String.format(Const.VIEW_PATH, 
							"consumer", request.getParameter("dest")))
			.forward(request, response);
			break;
		case "login":
			System.out.println(request.getParameter("dest"));
			request.getRequestDispatcher(
					String.format(Const.VIEW_PATH, "lotto" , 
							request.getParameter("dest")))
			.forward(request, response);
			
			break;
		case "join":
			String cid = request.getParameter("cid");
			String pw = request.getParameter("pw");
			//ConsumerBean param = new ConsumerBean();
			//param.setCid(cid);
			//param.setPw(pw);
			//ConsumerService cs = new ConsumerServiceImpl();
		//	cs.registConsumer(param);
			System.out.println(request.getParameter("dest"));
			request.getRequestDispatcher(
					String.format(Const.VIEW_PATH, "consumer" , 
							request.getParameter("dest")))
			.forward(request, response);
						
			
			break;
		case "buy":
			String money = request.getParameter("money");
			
			
			break;
			
			
		}
		/*System.out.println("ㄴㅇㅇㄻㄴ");
		String cid = request.getParameter("cid");
		String pw = request.getParameter("pw");
		ConsumerBean param = new ConsumerBean();
		param.setCid(cid);
		param.setPw(pw);
		ConsumerService cs = new ConsumerServiceImpl();
		cs.registConsumer(param);
		System.out.println(param.toString());*/
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
