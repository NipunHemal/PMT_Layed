package lk.ijse.project_management_tool.dao.custom;

import lk.ijse.project_management_tool.db.DbConnector;
import lk.ijse.project_management_tool.dto.EmployeeDto;
import lk.ijse.project_management_tool.utils.CrudUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface EmployeeDAO {
    public boolean save(EmployeeDto employee) throws SQLException, ClassNotFoundException;

    public boolean update(EmployeeDto employee) throws SQLException, ClassNotFoundException;

    public boolean delete(Long employeeId) throws SQLException, ClassNotFoundException;

    public ArrayList<EmployeeDto> getAll() throws SQLException, ClassNotFoundException;

    public EmployeeDto getOneById(Long employeeId) throws SQLException, ClassNotFoundException;

    public ArrayList<EmployeeDto> getEmployeesByTeamId(int teamId) throws SQLException, ClassNotFoundException;

    public EmployeeDto getEmployeeByEmail(String email) throws SQLException, ClassNotFoundException;

    public void getEmployeeByTeamId(Long teamId) throws SQLException, ClassNotFoundException;

    public boolean addTeamToEmployee(int employeeId, int teamId) throws SQLException, ClassNotFoundException;

    public boolean changeStatus(int employeeId, String status) throws SQLException, ClassNotFoundException;

    public ArrayList<Integer> summaryOfEmployeeCount() throws SQLException, ClassNotFoundException;
}
