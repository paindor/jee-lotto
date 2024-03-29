package com.lotto.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lotto.web.domains.LottoBean;
import com.lotto.web.pool.Const;
import com.lotto.web.serviceimpls.LottoServiceImpl;
import com.lotto.web.services.LottoService;
@WebServlet("/lotto.do")
public class LottoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		switch(request.getParameter("action")) {
		case "buy":
			String money = request.getParameter("money");
			
			break;
			
		}
		
		
		System.out.println(request.getParameter("money"));
		String money = request.getParameter("money");
		LottoBean lot = new LottoBean();
		LottoService ls = new LottoServiceImpl();
		ls.createLotto(lot);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
