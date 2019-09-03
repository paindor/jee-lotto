package com.lotto.web.services;

import com.lotto.web.domains.LottoBean;

public interface LottoService {

	
	public void createLotto(LottoBean param);
	
	public String createSequence();
	public int createBall();
	public String createLottoNum();
	public String createLottoN();
	public boolean isExsist(int[] arr, int a);
	public String bubbleSort(int[] arr, boolean isUp);
	
	
	//public List
	
}
