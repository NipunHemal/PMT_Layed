package lk.ijse.project_management_tool.dao.custom;

import lk.ijse.project_management_tool.db.DbConnector;
import lk.ijse.project_management_tool.dto.TeamDto;
import lk.ijse.project_management_tool.utils.CrudUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface TeamDAO {
    public boolean save(TeamDto team) throws SQLException, ClassNotFoundException;

    public boolean updateStatus(int teamId,String status) throws SQLException, ClassNotFoundException;

    public boolean update(TeamDto team) throws SQLException, ClassNotFoundException;


    public boolean delete(Long teamId) throws SQLException, ClassNotFoundException;

    public ArrayList<TeamDto> getAll() throws SQLException, ClassNotFoundException;

    public ArrayList<TeamDto> getAllTeamsWithSuspend() throws SQLException, ClassNotFoundException;

    public TeamDto getOneById(int teamId) throws SQLException, ClassNotFoundException;

    public boolean addTeamToEmployee(int employeeId, int teamId) throws SQLException, ClassNotFoundException;

    public boolean removeTeamToEmployee(int employeeId, int teamId) throws SQLException, ClassNotFoundException;
}
