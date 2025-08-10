package lk.ijse.project_management_tool.dao.custom;

import lk.ijse.project_management_tool.dto.AssignmentDto;
import lk.ijse.project_management_tool.entity.Assignment;

import java.sql.SQLException;
import java.util.ArrayList;

public interface AssignmentDAO extends CrudDAO<Assignment> {
    boolean save(AssignmentDto assignment) throws SQLException, ClassNotFoundException;

    boolean update(AssignmentDto assignment) throws SQLException, ClassNotFoundException;

    boolean delete(Long employeeId, Long taskId) throws SQLException, ClassNotFoundException;

    ArrayList<AssignmentDto> getAll() throws SQLException, ClassNotFoundException;

    ArrayList<AssignmentDto> getAssignmentsByEmployeeId(Long employeeId) throws SQLException, ClassNotFoundException;

    ArrayList<AssignmentDto> getAssignmentsByTaskId(Long taskId) throws SQLException, ClassNotFoundException;
}
