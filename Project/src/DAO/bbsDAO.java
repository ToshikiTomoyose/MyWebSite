package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beans.Bbs_categorybean;
import beans.Bbs_postbean;
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


	 	public ArrayList<Bbs_categorybean> watchBbs_category() {

	 		Connection con = null ;
	 		PreparedStatement st = null;

	 		try {
	 			con = DBManager.getConnection();
	 			st = con.prepareStatement("SELECT * FROM bbs_category");
	 			ResultSet rs = st.executeQuery();

	 			ArrayList<Bbs_categorybean> categoryList = new ArrayList<Bbs_categorybean>();
	 			while (rs.next()) {
	 				Bbs_categorybean bcb = new Bbs_categorybean();
					bcb.setId(rs.getInt("id"));
					bcb.setCategory_name(rs.getString("category_name"));
					categoryList.add(bcb);
				}
	 			return categoryList;
	 		} catch (SQLException e) {
				System.out.println(e.getMessage());

	 		} finally {
                // データベース切断
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                        return null;
                    }
                }
            }
			return watchBbs_category();
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


		public Bbs_threadbean findByBbs(String id) {
			   Connection conn = null;
			   Bbs_threadbean treadbean = new Bbs_threadbean();

		        try {
		            // データベースへ接続
		            conn = DBManager.getConnection();

		            String sql = "SELECT * FROM bbs_thread where id = ?";

	    		PreparedStatement pStmt = conn.prepareStatement(sql);
		            pStmt.setString(1, id);
		            ResultSet rs = pStmt.executeQuery();

		            while (rs.next()) {
		            	int thread_id = rs.getInt("id");
		                String title = rs.getString("title");
		                String maintext = rs.getString("maintext");
		                int cateid = rs.getInt("category_id");
		                String threphoto = rs.getString("thread_photo");
		                int user_id = rs.getInt("user_id");
		                String createdate = rs.getString("create_date");
		                String update = rs.getString("update_date");
		                String prophoto = rs.getString("profile_photo");

		                treadbean.setId(thread_id);
		                treadbean.setTitle(title);
		                treadbean.setMaintext(maintext);
		                treadbean.setCategory_id(cateid);
		                treadbean.setThread_photo(threphoto);
		                treadbean.setUser_id(user_id);
		                treadbean.setCreate_date(createdate);
		                treadbean.setUpdate_date(update);
		                treadbean.setProfile_photo(prophoto);

		                return  treadbean;
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


		public void BbsPost(String pmassage, String pphoto, int user_id, String pprofile_photo, String thread_id) {
	        Connection conn = null;
	        try {
	        	//SELECT文
	        	conn = DBManager.getConnection();
	            String sql = "INSERT INTO bbs_post ( massage, post_photo, user_id, profile_photo, thread_id, create_date, update_date ) VALUES ( ?, ?, ?, ?, ?, now(), now() )";

	            PreparedStatement pStmt = conn.prepareStatement(sql);
	            pStmt.setString(1, pmassage);
	            pStmt.setString(2, pphoto);
	            pStmt.setInt(3, user_id);
	            pStmt.setString(4, pprofile_photo);
	            pStmt.setString(5, thread_id);

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


		public Bbs_postbean Bbs_postExtract(String id) {
			   Connection conn = null;
//			   Bbs_threadbean treadbean = new Bbs_threadbean();
			   Bbs_postbean postbean = new Bbs_postbean();

		        try {
		            // データベースへ接続
		            conn = DBManager.getConnection();
		            //↓　sqlのスペース入れ忘れ注意　くっついた扱いになりエラーになる
		            String sql = "SELECT "
	            					+	" bbs_post. * , bbs_user. * "
		            				+ " FROM "
	            					+ 	"bbs_post "
            						+ "INNER JOIN bbs_user "
            						+ 	"ON bbs_post.user_id = bbs_user.id "
            						+ "WHERE "
	            					+ "bbs_post.thread_id = ? ";

	    		PreparedStatement pStmt = conn.prepareStatement(sql);
		            pStmt.setString(1, id);
		            ResultSet rs = pStmt.executeQuery();

		            while (rs.next()) {
		            	int post_id = rs.getInt("id");
		            	String massage = rs.getString("massage");
		            	String post_photo = rs.getString("post_photo");
		            	int user_id = rs.getInt("user_id");
		            	String profile_photo = rs.getString("profile_photo");
		            	int thread_id = rs.getInt("thread_id");
		            	String create_date = rs.getString("create_date");

		            	postbean.setId(post_id);
		            	postbean.setText(massage);
		            	postbean.setPost_photo(post_photo);
		            	postbean.setUser_id(user_id);
		            	postbean.setProfile_photo(profile_photo);
		            	postbean.setThread_id(thread_id);
		            	postbean.setCreate_date(create_date);

		                return  postbean;
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
		        return null;
		}
}
