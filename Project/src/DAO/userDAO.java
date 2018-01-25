package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beans.Userbean;

public class userDAO {

	 public List<Userbean> findAll() {
	        Connection conn = null;
	        List<Userbean> ubList = new ArrayList<Userbean>();
	            // データベースへ接続
	            conn = DBManager.getConnection();
	            try {
	                // データベースへ接続
	                conn = DBManager.getConnection();
	                // SELECT文を準備
	                String sql = "SELECT id, login_id, name, birth_date, profile_photo, create_date, update_date, password, user_tweet, report_flag FROM bbs_user";
	                 // SELECTを実行し、結果表を取得
	                Statement stmt = conn.createStatement();
	                ResultSet rs = stmt.executeQuery(sql);

	                while (rs.next()) {
	                    int id = rs.getInt("id");
	                    String logid = rs.getString("login_id");
	                    String name = rs.getString("name");
	                    int birthdy = rs.getInt("birth_date");
	                    String profphoto = rs.getString("profile_photo");
	                    int createdy = rs.getInt("create_date");
	                    int updatedy = rs.getInt("update_date");
	                    String pass = rs.getString("password");
	                    String utweet = rs.getString("user_tweet");
	                    int reportf = rs.getInt("report_flag");
	                    Userbean user = new Userbean(id, logid, name, birthdy, profphoto, createdy, updatedy, pass, utweet, reportf);
	                    ubList.add(user);
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	                return null;
	            } finally {
	                // データベース切断
	                if (conn != null) {
	                    try {
	                        conn.close();
	                    } catch (SQLException e) {
	                        e.printStackTrace();
	                        return null;
	                    }
	                }
	            }
	            return ubList;
	        }


	 public Userbean findByLoginId(String loginId, String pass) {
		   Connection conn = null;
		   Userbean userbean = new Userbean();

	        try {
	            // データベースへ接続
	            conn = DBManager.getConnection();

	            // SELECT文を準備
	            String sql = "SELECT * FROM bbs_user where login_id = ? and password = ?";

      		PreparedStatement pStmt = conn.prepareStatement(sql);
	            pStmt.setString(1, loginId);
	            pStmt.setString(2, pass);
	            ResultSet rs = pStmt.executeQuery();

	            while (rs.next()) {

	                String logid = rs.getString("login_id");
	                String logpass = rs.getString("password");
	                int userid = rs.getInt("id");
	                String logname = rs.getString("name");
	                String profilephoto = rs.getString("profile_photo");

	                userbean.setLogin_id(logid);
	                userbean.setPassword(logpass);
	                userbean.setUser_id(userid);
	                userbean.setName(logname);
	                userbean.setProfile_photo(profilephoto);
	                return userbean;
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return null;
	        } finally {
	            // データベース切断
	            if (conn != null) {
	                try {
	                    conn.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                    return null;
	                }
	            }
	        }
	        return null;
	}

		public void Usercreate(String clogid, String cname, int cbirthd, String profile_picture, int createdate, int updatedate, String pass, String tweet, int report_flag) {
	        Connection conn = null;
	        try {
	            // データベースへ接続
	        	conn = DBManager.getConnection();
	            // INSERT文を準備
	            String sql = "INSERT INTO usermanagement (login_id, name, birth_date, profile_photo, create_date, update_date, password, usertweet, report_flag) VALUES (?, ?, ?, ?, now(),now(),?,?)";

	         // SELECTを実行し、結果表を取得
	            PreparedStatement pStmt = conn.prepareStatement(sql);
	            pStmt.setString(1, clogid);
	            pStmt.setString(2, cname);
	            pStmt.setInt(3, cbirthd);
	            pStmt.setString(4, profile_picture);
	            pStmt.setString(7, pass);
	            pStmt.setString(8, tweet);
	            pStmt.setInt(9, report_flag);

	            int rs = pStmt.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {

	            // データベース切断
	            if (conn != null) {
	                try {
	                    conn.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();

	                }
	            }
	        }
	  }


}