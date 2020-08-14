package at.ac.tuwien.tiss.course.be;

import at.ac.tuwien.tiss.course.api.PlanningDTO;

public class SemesterPlanningService {

    /**
     * Generate the planning details for a course defined by its course number and the semester code.
     * @param courseNumber  the course number (e.g., "100.001")
     * @param semesterCode  the semester code (e.g., "2020S")
     * @return  the {@link PlanningDTO} object containing the planning details
     */
    public static PlanningDTO generateByCourseNumberAndSemester(String courseNumber, String semesterCode) {

        return null;
    }

    /**
     * Generate the planning details for all courses of a semester defined by the semester code.
     * @param semesterCode  the semester code (e.g., "2020S")
     * @return  the {@link PlanningDTO} object containing the planning details
     */
    public static PlanningDTO generateBySemester(String semesterCode) {

        return null;
    }
}
