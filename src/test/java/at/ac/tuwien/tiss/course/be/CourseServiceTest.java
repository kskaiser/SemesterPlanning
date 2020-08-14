package at.ac.tuwien.tiss.course.be;

import at.ac.tuwien.tiss.course.api.CourseDTO;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CourseServiceTest {

    @Test
    public void getByCourseNumberTest() {
        List<CourseDTO> courses = CourseService.getByCourseNumber("100.001");
        Assert.assertEquals(8, courses.size());
    }

    @Test
    public void getBySemesterCodeTest() {
        List<CourseDTO> courses = CourseService.getBySemesterCode("2020W");
        Assert.assertEquals(13, courses.size());
        courses = CourseService.getBySemesterCode("2020S");
        Assert.assertEquals(8, courses.size());
    }

    @Test
    public void getBySemesterCodeAndCourseNumberTest() {
        CourseDTO course = CourseService.getBySemesterCodeAndCourseNumber("2020S", "100.001");
        Assert.assertNotNull(course);
    }

    @Test
    public void getBySemesterCodeAndCourseNumberFailTest() {
        CourseDTO course = CourseService.getBySemesterCodeAndCourseNumber("2020S", "187.001");
        Assert.assertNull(course);
    }
}
