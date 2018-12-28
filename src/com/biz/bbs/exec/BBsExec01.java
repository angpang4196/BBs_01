package com.biz.bbs.exec;

import com.biz.bbs.dao.BBsFake;
import com.biz.bbs.dao.BBsMainDaoImp;

public class BBsExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BBsMainDaoImp bm = new BBsMainDaoImp();
		
		bm.delete(20l);
		
		BBsFake bf = new BBsFake();
		bf.delete(20l);

	}

}