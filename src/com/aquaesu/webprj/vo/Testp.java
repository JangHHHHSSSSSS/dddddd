package com.aquaesu.webprj.vo;
import java.sql.SQLException;
import java.util.List;

import com.aquaesu.webprj.dao.MemberDao;

public class Testp {

	   public static void main(String[] args) throws SQLException {
	      MemberDao dao = new MemberDao();
	      List<Member> list = dao.getMembers(2);
	      
	      for(Member m : list){
	         System.out.print("mid:%s,name : %s\n"+m.getMid()+m.getTitle());
	      }

	   }

	}