package at.ac.tuwien.tiss.course.be;

import org.junit.Test;

public class SemesterPlanningServiceTest {

    @Test
    public void generateByCourseNumberAndSemesterTest() {
        System.out.println("SemesterPlanning: " + SemesterPlanningService.generateByCourseNumberAndSemester("100.001", "2020W"));
        // add more "tests" here

    }

    @Test
    public void generateBySemester() {
        System.out.println("SemesterPlanning: " + SemesterPlanningService.generateBySemester("2020W"));
        // add more "tests" here

    }
}
