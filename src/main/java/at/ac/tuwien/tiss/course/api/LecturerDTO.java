package at.ac.tuwien.tiss.course.api;

import at.ac.tuwien.tiss.control.api.EmploymentCategory;
import lombok.Data;

@Data
public class LecturerDTO {

    private Long id;
    private Long personId;
    private Float hours;
    private Tariff tariff;
    private EmploymentCategory category;
}
