package at.ac.tuwien.tiss.course.api;

import lombok.Data;

@Data
public class PlanningDTO {

    // please insert here your data model to describe the kind of data relevant to be displayed
    // If you model is more complex, feel free to define new classes (in this package).

    // For each course number all details relevant to the study dean should be available:
    // * the semester for which the planning is to be made
    // * the sum of the hours of all lecturers
    // * the sum of the weighted hours of all lecturers
    // * the sum of all hours of all tutors (employment category: STUD_MA)
    // Extra task:
    // * a trend of the total sum of hours from the previous course to the planned semester course: e.g., "UP", "EQUALS", "DOWN", whereas "EQUALS" is in the range of +/- 10%

    // Considerations: You may need a {@link List} or {@link Map} ...

    @Override
    public String toString() {
        // add code here to print out the object


        return "";
    }


}
