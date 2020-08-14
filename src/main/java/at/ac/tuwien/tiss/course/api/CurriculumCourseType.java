package at.ac.tuwien.tiss.course.api;

public enum CurriculumCourseType {

    /**
     * Indicates if the course is at least in 1 curriculum mandatory (= MANDATORY),
     * elective (ie. not mandatory at all, but at least in 1 curriculum ELECTIVE),
     * or free (ie. in none curriculum mandatory or elective).
     */
    MANDATORY,
    ELECTIVE,
    FREE

}
