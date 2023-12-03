package spring.board.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import spring.board.vo.Board;

public  class MainDaoImpl extends SqlSessionDaoSupport implements MainDao {
	
	public String getToday() {
		String today =  (String)getSqlSession().selectOne("main.getToday");
		return today;
	}

	public int writeProc(Map<String, Object> paramMap) {
		return getSqlSession().insert("main.writeProc",paramMap );
	}

	public int writeProc2(Board board) {
		return getSqlSession().insert("main.writeProc2",board);
	}
	public List getList(Map<String, Object> paramMap) {
		return getSqlSession().selectList("main.getList",paramMap );
	}

	public String getUserPwd(String userId) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("main.getUserPwd",userId);
	}
}
