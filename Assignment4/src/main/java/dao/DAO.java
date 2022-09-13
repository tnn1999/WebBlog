package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import connect.DBConnect;
import model.NewsModel;

public class DAO {

	public List<NewsModel> getAllNewsModels() {
		List<NewsModel> listNewsModel = new ArrayList<NewsModel>();
		Connection con = null;
		DBConnect db = new DBConnect();
		try {
			con = db.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery("SELECT * FROM newsservlet.news WHERE status = 1" + " ORDER BY createddate DESC");
			while (rs.next()) {
				NewsModel NewsModel = new NewsModel();

				NewsModel.setId(rs.getLong(1));
				NewsModel.setTitle(rs.getString(2));
				NewsModel.setThumbnail(rs.getString(3));
				NewsModel.setShortdescription(rs.getString(4));
				NewsModel.setContent(rs.getString(5));
				NewsModel.setStatus(rs.getInt(6));
				NewsModel.setAuthor(rs.getString(7));

				NewsModel.setCreatedAt(rs.getTimestamp(8));
				listNewsModel.add(NewsModel);
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listNewsModel;
	}

	public NewsModel getNewsByID(long id) {
		NewsModel NewsModel = new NewsModel();
		String query = "SELECT * FROM newsservlet.news WHERE status = 1 AND id = " + id;
		Connection con = null;
		DBConnect db = new DBConnect();
		try {
			con = db.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				NewsModel.setId(rs.getLong(1));
				NewsModel.setTitle(rs.getString(2));
				NewsModel.setThumbnail(rs.getString(3));
				NewsModel.setShortdescription(rs.getString(4));
				NewsModel.setContent(rs.getString(5));
				NewsModel.setStatus(rs.getInt(6));
				NewsModel.setAuthor(rs.getString(7));

			}
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return NewsModel;
	}

	public void updateNewsModel(NewsModel art) {
		Connection con = null;
		DBConnect db = new DBConnect();
		try {
			con = db.getConnection();
			String sql = "UPDATE newsservlet.news SET title = ?, shortdescription = ?, content = ?, " + "status = ? WHERE id = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, art.getTitle());
			stmt.setString(2, art.getShortdescription());
			stmt.setString(3, art.getContent());
			stmt.setInt(4, art.getStatus());
			stmt.setLong(5, art.getId());
			stmt.executeUpdate();
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DAO dao = new DAO();
		List<NewsModel> list = dao.getAllNewsModels();
		for (NewsModel newsModel : list) {
			System.out.println(newsModel);
		}

	}
}
