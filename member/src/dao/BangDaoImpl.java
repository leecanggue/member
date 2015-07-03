package dao;

import java.io.StringReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import bean.BangBean;
import util.DBmanager;

public class BangDaoImpl implements CommonDAO{
	 	Connection conn = null;
	    PreparedStatement pstmt = null;
	    Statement stmt = null;
	    ResultSet rs = null;
	    String sql = "";
	    BangBean bean = new BangBean();
	    
	    private static BangDaoImpl bangDAO = new BangDaoImpl();
	    
	    private BangDaoImpl() {
	        // 단위 테스트가 끝나고 프로젝트가 완성되면 걷어 낼 부분
	        conn = DBmanager.getConnection();
	    }
	 
	    public static BangDaoImpl getInstance() {
	        return bangDAO;
	    }
	 
	    // 현재는 작동하지 않지만 위 DBmanager 를 걷어내는 순간
	    // 작동함. 미리 설정함.
	    public Connection getConnection() throws Exception {
	        Connection conn = null;
	        Context initContext = new InitialContext();
	        Context envContext = (Context) initContext.lookup("java:/comp/env");
	        DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
	        conn = ds.getConnection();
	        return conn;
	    }
	@Override
	public int insert(Object obj) {
		int result = 0 ;
		String sql = "insert into GUESTBOOK (REGISTER,NAME,EMAIL,PASSWORD,CONTENT) "+
            "values (?,?,?,?,?)";
		 try {
	            
	            pstmt = conn.prepareStatement(sql);
	            
	            pstmt.setString(1, String.valueOf(bean.getRegister()));
	            pstmt.setString(2, bean.getName());
	            pstmt.setString(3, bean.getEmail());
	            pstmt.setString(4, bean.getPassword());
	            pstmt.setString(5,null);
	            result = pstmt.executeUpdate();
	            
	        } catch(Exception ex) {
	            ex.printStackTrace();
	        } finally {
	            if (pstmt != null) try { pstmt.close(); } catch(Exception ex) {}
	            if (conn != null) try { conn.close(); } catch(Exception ex) {}
	        }

		return result;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getElementById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> getElementsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
