package lk.ijse.project_management_tool.dao.custom.impl;

import lk.ijse.project_management_tool.dao.custom.ReviewDAO;
import lk.ijse.project_management_tool.dto.ReviewDto;
import lk.ijse.project_management_tool.utils.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReviewDAOImpl implements ReviewDAO {
    public boolean save(ReviewDto review) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO reviews (task_id, note) VALUES (?,?)";
        return CrudUtil.execute(sql,
                review.getTaskId(),
                review.getNote()
        );
    }

    public boolean update(ReviewDto review) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE reviews SET task_id=?, note=? WHERE review_id=?";
        return CrudUtil.execute(sql,
                review.getTaskId(),
                review.getNote(),
                review.getReviewId()
        );
    }

    public boolean delete(Long reviewId) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM reviews WHERE review_id=?";
        return CrudUtil.execute(sql, reviewId);
    }

    public ArrayList<ReviewDto> getAll() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM reviews";
        ResultSet resultSet = CrudUtil.execute(sql);
        ArrayList<ReviewDto> reviews = new ArrayList<>();

        while (resultSet.next()) {
            reviews.add(new ReviewDto(
                    resultSet.getLong("review_id"),
                    resultSet.getLong("task_id"),
                    resultSet.getString("note")
            ));
        }
        return reviews;
    }

    public ReviewDto getOneById(Long reviewId) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM reviews WHERE review_id=?";
        ResultSet resultSet = CrudUtil.execute(sql, reviewId);

        if (resultSet.next()) {
            return new ReviewDto(
                    resultSet.getLong("review_id"),
                    resultSet.getLong("task_id"),
                    resultSet.getString("note")
            );
        }
        return null;
    }

    public ArrayList<ReviewDto> getReviewsByTaskId(Long taskId) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM reviews WHERE task_id=?";
        ResultSet resultSet = CrudUtil.execute(sql, taskId);
        ArrayList<ReviewDto> reviews = new ArrayList<>();

        while (resultSet.next()) {
            reviews.add(new ReviewDto(
                    resultSet.getLong("review_id"),
                    resultSet.getLong("task_id"),
                    resultSet.getString("note")
            ));
        }
        return reviews;
    }
} 