package com.lotto.web.services;

import com.lotto.web.domains.LottoBean;

public interface LottoService {

	
	public void createLotto(LottoBean param);
	
	public String createSequence();
	public String createBall();
	public String createLottoNum();
	public String createLottoN();
	public boolean duplicatePrevention(int[] arr);
	public String ascendingSort(int[] arr);
	
	
	//public List
	
}
