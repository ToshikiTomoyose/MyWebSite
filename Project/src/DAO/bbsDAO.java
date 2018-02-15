package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beans.Bbs_threadbean;;

public class bbsDAO {

	 public List<Bbs_threadbean> findAllforThread() {
	        Connection conn = null;
	        List<Bbs_threadbean> threadList = new ArrayList<Bbs_threadbean>();

	            conn = DBManager.getConnection();
	            try {
	                conn = DBManager.getConnection();

	                String sql = "SELECT id, title, maintext, category_id, thread_photo, user_id, create_date, update_date, profile_photo FROM bbs_thread";
	                Statement stmt = conn.createStatement();
	                ResultSet rs = stmt.executeQuery(sql);

	                while (rs.next()) {
	                    int id = rs.getInt("id");
	                    String title = rs.getString("title");
	                    String maintext = rs.getString("maintext");
	                    int category_id = rs.getInt("category_id");
	                    String thread_photo = rs.getString("thread_photo");
	                    int user_id = rs.getInt("user_id");
	                    String create_date = rs.getString("create_date");
	                    String update_date = rs.getString("update_date");
	                    String profile_photo = rs.getString("profile_photo");
	                    Bbs_threadbean thread = new Bbs_threadbean(id, title, maintext, category_id, thread_photo, user_id, create_date, update_date, profile_photo);
	                    threadList.add(thread);
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	                return null;
	            } finally {

	                if (conn != null) {
	                    try {
	                        conn.close();
	                    } catch (SQLException e) {
	                        e.printStackTrace();
	                        return null;
	                    }
	                }
	            }
	            return threadList;
	        }


		public void Bbscreate(String ctitle, String cmaintext, String ccategory_id, String cthread_photo, int user_id, String cprofile_photo) {
	        Connection conn = null;
	        try {

	        	conn = DBManager.getConnection();

	            String sql = "INSERT INTO bbs_thread ( title , maintext , category_id , thread_photo , user_id , create_date , update_date , profile_photo ) VALUES ( ?, ?, ?,  ?, ?, now(), now(), ? )";

	            PreparedStatement pStmt = conn.prepareStatement(sql);
	            pStmt.setString(1, ctitle);
	            pStmt.setString(2, cmaintext);
	            pStmt.setString(3, ccategory_id);
	            pStmt.setString(4, cthread_photo);
	            pStmt.setInt(5, user_id);
	            pStmt.setString(6, cprofile_photo);

	            int rs = pStmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
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
