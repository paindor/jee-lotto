package com.lotto.web.serviceimpls;

import java.util.List;
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
		
		param.setBall(createBall());
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
		 Random rd = new Random();
		String result = "";
		int idx = 0;
		int[] arr = new int[6];
		for(int i = 0 ; i < 30 ;i ++) {
			if(idx == 6) {
				break;
			}
			if(duplicatePrevention(arr)) {
				arr[idx] = rd.nextInt(45)+1;
				
			}
			else {
				arr[idx] = rd.nextInt(45)+1;
				idx++;
			}
		}
		
		for(int i = 0  ; i <arr.length; i++ ) {
			result += (i == 6)? String.valueOf(arr[i]):String.valueOf(arr[i]) +",";
		}
	
		return result;
	}
	//public String CreateLottoN() {


	@Override
	public String createLottoN() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String createBall() {
		String ball = "";
		
		return new Random().nextInt(45)+1 +"";
	}


	@Override
	public boolean duplicatePrevention(int[] arr) {
		boolean result = false;
		for(int i = 0;i < 6; i++) {
			for(int j = 0 ; j < 5; j++) {
				if(arr[j] != 0 && arr[j+1]!= 0) {
					if(arr[j] == arr[j+1]) {
						result = true;
					}
				}
				
			}
		}
		return result;
	}


	@Override
	public String ascendingSort(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}
		
	//}


	
}
