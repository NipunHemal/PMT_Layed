package lk.ijse.project_management_tool.dao.custom.impl;

import lk.ijse.project_management_tool.dao.custom.TaskDAO;
import lk.ijse.project_management_tool.dto.TaskDto;
import lk.ijse.project_management_tool.utils.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TaskDAOImpl implements TaskDAO {
    public boolean save(TaskDto task) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO tasks (title, description, project_id, project_name, tag) VALUES (?,?,?,?,?)";
        return CrudUtil.execute(sql,
                task.getTitle(),
                task.getDescription(),
                task.getProjectId(),
                task.getProjectName(),
                task.getTag());
    }

    public boolean update(TaskDto task) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE tasks SET title=?, description=?, status=?,  progress=?, tag=? WHERE id=?";
        return CrudUtil.execute(sql,
                task.getTitle(),
                task.getDescription(),
                task.getStatus(),
                task.getProgress(),
                task.getTag(),
                task.getId());
    }

    public boolean delete(Long taskId) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM tasks WHERE id=?";
        return CrudUtil.execute(sql, taskId);
    }

    public ArrayList<TaskDto> getAllTasksForProject(Long id) throws SQLException, ClassNotFoundException {
        String sql = "SELECT t.*, p.name as project_name FROM tasks t LEFT JOIN projects p ON t.project_id = p.project_id WHERE t.project_id=?";
        ResultSet resultSet = CrudUtil.execute(sql, id);
        ArrayList<TaskDto> tasks = new ArrayList<>();

        while (resultSet.next()) {
            tasks.add(new TaskDto(
                    resultSet.getLong("id"),
                    resultSet.getString("title"),
                    resultSet.getString("description"),
                    resultSet.getString("status"),
                    resultSet.getLong("project_id"),
                    resultSet.getString("project_name"),
                    resultSet.getInt("progress"),
                    resultSet.getString("tag"),
                    resultSet.getDate("created_at"),
                    resultSet.getDate("updated_at")));
        }
        return tasks;
    }

    public TaskDto getOneById(Long taskId) throws SQLException, ClassNotFoundException {
        String sql = "SELECT t.*, p.name as project_name FROM tasks t LEFT JOIN projects p ON t.project_id = p.project_id WHERE t.id=?";
        ResultSet resultSet = CrudUtil.execute(sql, taskId);

        if (resultSet.next()) {
            return new TaskDto(
                    resultSet.getLong("id"),
                    resultSet.getString("title"),
                    resultSet.getString("description"),
                    resultSet.getString("status"),
                    resultSet.getLong("project_id"),
                    resultSet.getString("project_name"),
                    resultSet.getInt("progress"),
                    resultSet.getString("tag"),
                    resultSet.getDate("created_at"),
                    resultSet.getDate("updated_at"));
        }
        return null;
    }

    public ArrayList<TaskDto> getTasksByProjectId(Long projectId) throws SQLException, ClassNotFoundException {
        String sql = "SELECT t.*, p.name as project_name FROM tasks t LEFT JOIN projects p ON t.project_id = p.project_id WHERE t.project_id=?";
        ResultSet resultSet = CrudUtil.execute(sql, projectId);
        ArrayList<TaskDto> tasks = new ArrayList<>();

        while (resultSet.next()) {
            tasks.add(new TaskDto(
                    resultSet.getLong("id"),
                    resultSet.getString("title"),
                    resultSet.getString("description"),
                    resultSet.getString("status"),
                    resultSet.getLong("project_id"),
                    resultSet.getString("project_name"),
                    resultSet.getInt("progress"),
                    resultSet.getString("tag"),
                    resultSet.getDate("created_at"),
                    resultSet.getDate("updated_at")));
        }
        return tasks;
    }

    public boolean updateStatus(Long taskId, String status) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE tasks SET status=? WHERE id=?";
        return CrudUtil.execute(sql, status, taskId);
    }
}