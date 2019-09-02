package com.lotto.web.daoimpls;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.lotto.web.daos.LottoDao;
import com.lotto.web.domains.LottoBean;
import com.lotto.web.services.LottoService;

public class LottoDaoImpl implements LottoDao{
	public static final String FILE_PATH = String.format("C:%sUsers%suser%seclipse_jee%sjee-lotto%sWebContent%sresources%stxt%s"
			,File.separator
	,File.separator
	,File.separator
	,File.separator
	,File.separator
	,File.separator
	,File.separator
	,File.separator);

	@Override
	public void insertLotto(LottoBean param) {
		try {
			File file = new File(FILE_PATH + "lotto.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(param.getLottoSeq() + "/" + param.getLotteryNum());
			writer.newLine();
			writer.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}



}
