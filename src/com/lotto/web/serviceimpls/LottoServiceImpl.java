package com.lotto.web.serviceimpls;


import java.util.Random;

import com.lotto.web.daoimpls.LottoDaoImpl;
import com.lotto.web.daos.LottoDao;
import com.lotto.web.domains.LottoBean;
import com.lotto.web.services.LottoService;

public class LottoServiceImpl implements LottoService{
	private LottoDao dao;
	public LottoServiceImpl() {
		 dao = new LottoDaoImpl();
		
		 
	}
	

	@Override
	public void createLotto(LottoBean param) {
		
		//param.setBall(createBall();
		param.setLottoSeq(createSequence());
		param.setLotteryNum(createLottoNum());
		
		dao.insertLotto(param);
		
		
		
	}


	@Override
	public String createSequence() {
		 Random rd = new Random();
		String result ="No.";
		for(int i = 0 ;i < 4; i++) {
			result += rd.nextInt(9) +"";
			
		}
		return result;
	}


	@Override
	public String createLottoNum() {
		String result = "";
		int[] arr = new int[6];
		for(int i = 0 ;i< 6; i++) {
			int rd = this.createBall();
			
			if(isExsist(arr, rd )) {
				i--;
			}
			else
			{
				arr[i] = rd;
			}
		}
	
		result = bubbleSort(arr, true);
		
		System.out.println(result);
		return result;
	}
	//public String CreateLottoN() {


	@Override
	public String createLottoN() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int createBall() {
		int ball =0;
		
		//Array.
		
		return (int)(Math.random() *45 )+1;
		
	}


	@Override
	public boolean isExsist(int[] arr , int a) {
		boolean result = false;
		for(int i = 0 ;i < arr.length; i++) {
			if(arr[i] != 0 && a == arr[i]) {
			
				result = true;
				break;
				
			}
		}
		return result;
	}


	@Override
	public String bubbleSort(int[] arr , boolean isUp) {
		for(int i= 0 ; i < arr.length; i++ ) {
			for(int j = 0 ; j < arr.length-1 ; j++ ) {
				if(isUp) {
					if(arr[j] > arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
					
				}
				else {
					if(arr[j] < arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
					
				}
				
			}
			
		}
		String result = "";
		for(int i = 0 ;i < arr.length ; i++) {
			if(i == 5) {
				result += arr[i];
			}
			else
			{
				result += arr[i]+",";
			}
		}
		return result;
	}
		
	//}


	
}
