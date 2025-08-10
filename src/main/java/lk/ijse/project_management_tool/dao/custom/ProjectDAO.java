package lk.ijse.project_management_tool.dao.custom;

import lk.ijse.project_management_tool.dto.ProjectDto;
import lk.ijse.project_management_tool.utils.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ProjectDAO {
    public boolean save(ProjectDto project) throws SQLException, ClassNotFoundException;

    public boolean update(ProjectDto project) throws SQLException, ClassNotFoundException;

    public boolean delete(int projectId) throws SQLException, ClassNotFoundException;

    public ArrayList<ProjectDto> getAll() throws SQLException, ClassNotFoundException;

    public ProjectDto getOneById(Long projectId) throws SQLException, ClassNotFoundException;

    public ArrayList<ProjectDto> getProjectsByTeamId(Long teamId) throws SQLException, ClassNotFoundException;

    public boolean updateStatus(int projectId, String status) throws SQLException, ClassNotFoundException;

    public boolean updateProjectTeam(int projectId, int teamId) throws SQLException, ClassNotFoundException;

    public ArrayList<Integer> summaryOfCount() throws SQLException, ClassNotFoundException;
}
