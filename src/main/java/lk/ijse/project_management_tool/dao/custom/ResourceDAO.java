package lk.ijse.project_management_tool.dao.custom;

import lk.ijse.project_management_tool.dto.ResourceDto;
import lk.ijse.project_management_tool.utils.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ResourceDAO {
    public boolean save(ResourceDto resource) throws SQLException, ClassNotFoundException;

    public boolean update(ResourceDto resource) throws SQLException, ClassNotFoundException;

    public boolean delete(Long resId) throws SQLException, ClassNotFoundException;

    public ArrayList<ResourceDto> getAll() throws SQLException, ClassNotFoundException;

    public ResourceDto getOneById(Long resId) throws SQLException, ClassNotFoundException;

    public ArrayList<ResourceDto> getResourcesByProjectId(Long projectId) throws SQLException, ClassNotFoundException;
}
