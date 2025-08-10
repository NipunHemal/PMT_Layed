package lk.ijse.project_management_tool.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    private Long id;
    private String title;
    private String description;
    private String status;
    private Long projectId;
    private String projectName;
    private int progress;
    private String tag;
    private Date createdAt;
    private Date updatedAt;
}