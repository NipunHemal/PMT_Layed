package lk.ijse.project_management_tool.dao.custom;

import lk.ijse.project_management_tool.dto.TaskDto;
import lk.ijse.project_management_tool.utils.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface TaskDAO {
    public boolean save(TaskDto task) throws SQLException, ClassNotFoundException;

    public boolean update(TaskDto task) throws SQLException, ClassNotFoundException;

    public boolean delete(Long taskId) throws SQLException, ClassNotFoundException;

    public ArrayList<TaskDto> getAllTasksForProject(Long id) throws SQLException, ClassNotFoundException;

    public TaskDto getOneById(Long taskId) throws SQLException, ClassNotFoundException;

    public ArrayList<TaskDto> getTasksByProjectId(Long projectId) throws SQLException, ClassNotFoundException;

    public boolean updateStatus(Long taskId, String status) throws SQLException, ClassNotFoundException;
}
