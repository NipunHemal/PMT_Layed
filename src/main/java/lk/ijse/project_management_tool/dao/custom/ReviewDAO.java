package lk.ijse.project_management_tool.dao.custom;

import lk.ijse.project_management_tool.dto.ReviewDto;
import lk.ijse.project_management_tool.utils.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ReviewDAO {
    public boolean save(ReviewDto review) throws SQLException, ClassNotFoundException;

    public boolean update(ReviewDto review) throws SQLException, ClassNotFoundException;

    public boolean delete(Long reviewId) throws SQLException, ClassNotFoundException;

    public ArrayList<ReviewDto> getAll() throws SQLException, ClassNotFoundException;

    public ReviewDto getOneById(Long reviewId) throws SQLException, ClassNotFoundException;

    public ArrayList<ReviewDto> getReviewsByTaskId(Long taskId) throws SQLException, ClassNotFoundException;
}
