package at.ac.tuwien.tiss.course.api;

import lombok.Data;

import java.util.List;

@Data
public class CourseDTO {

    private Long id;
    private String courseNumber;
    private String semesterCode;
    private String title;
    private String type;
    private List<LecturerDTO> lecturers;
    private CurriculumCourseType ccType;
}
