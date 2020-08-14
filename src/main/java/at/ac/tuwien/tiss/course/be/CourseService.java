package at.ac.tuwien.tiss.course.be;

import at.ac.tuwien.tiss.control.api.EmploymentCategory;
import at.ac.tuwien.tiss.course.api.*;

import java.util.*;
import java.util.stream.Collectors;

public class CourseService {

    private static List<CourseDTO> ALL_COURSES= Arrays.asList(
            createCourse("100.001", "2020W", "Mathe 1", "VO", CurriculumCourseType.MANDATORY, 2, 0),
            createCourse("100.002", "2020W", "Mathe 1", "UE", CurriculumCourseType.MANDATORY, 3, 10),
            createCourse("100.003", "2020W", "Mathe 2", "VO", CurriculumCourseType.MANDATORY, 1, 0),
            createCourse("100.004", "2020W", "Mathe 2", "UE", CurriculumCourseType.MANDATORY, 2, 7),
            createCourse("100.001", "2020S", "Mathe 1", "VO", CurriculumCourseType.MANDATORY, 2, 0),
            createCourse("100.002", "2020S", "Mathe 1", "UE", CurriculumCourseType.MANDATORY, 3, 12),
            createCourse("100.003", "2020S", "Mathe 2", "VO", CurriculumCourseType.MANDATORY, 2, 0),
            createCourse("100.004", "2020S", "Mathe 2", "UE", CurriculumCourseType.MANDATORY, 2, 5),
            createCourse("100.001", "2019W", "Mathe 1", "VO", CurriculumCourseType.MANDATORY, 1, 0),
            createCourse("100.002", "2019W", "Mathe 1", "UE", CurriculumCourseType.MANDATORY, 2, 10),
            createCourse("100.003", "2019W", "Mathe 2", "VO", CurriculumCourseType.MANDATORY, 1, 0),
            createCourse("100.004", "2019W", "Mathe 2", "UE", CurriculumCourseType.MANDATORY, 2, 4),
            createCourse("100.001", "2019S", "Mathe 1", "VO", CurriculumCourseType.MANDATORY, 2, 0),
            createCourse("100.002", "2019S", "Mathe 1", "UE", CurriculumCourseType.MANDATORY, 3, 12),
            createCourse("100.003", "2019S", "Mathe 2", "VO", CurriculumCourseType.MANDATORY, 2, 0),
            createCourse("100.004", "2019S", "Mathe 2", "UE", CurriculumCourseType.MANDATORY, 2, 5),
            createCourse("100.001", "2018W", "Mathe 1", "VO", CurriculumCourseType.MANDATORY, 1, 0),
            createCourse("100.002", "2018W", "Mathe 1", "UE", CurriculumCourseType.MANDATORY, 2, 12),
            createCourse("100.003", "2018W", "Mathe 2", "VO", CurriculumCourseType.MANDATORY, 1, 0),
            createCourse("100.004", "2018W", "Mathe 2", "UE", CurriculumCourseType.MANDATORY, 2, 7),
            createCourse("100.001", "2018S", "Mathe 1", "VO", CurriculumCourseType.MANDATORY, 1, 0),
            createCourse("100.002", "2018S", "Mathe 1", "UE", CurriculumCourseType.MANDATORY, 2, 12),
            createCourse("100.001", "2017W", "Mathe 1", "VO", CurriculumCourseType.MANDATORY, 1, 0),
            createCourse("100.002", "2017W", "Mathe 1", "UE", CurriculumCourseType.MANDATORY, 2, 12),
            createCourse("100.003", "2017W", "Mathe 2", "VO", CurriculumCourseType.MANDATORY, 1, 0),
            createCourse("100.004", "2017W", "Mathe 2", "UE", CurriculumCourseType.MANDATORY, 3, 4),
            createCourse("100.001", "2017S", "Mathe 1", "VO", CurriculumCourseType.MANDATORY, 1, 0),
            createCourse("100.002", "2017S", "Mathe 1", "UE", CurriculumCourseType.MANDATORY, 2, 11),

            createCourse("185.001", "2020W", "EP1", "VU", CurriculumCourseType.MANDATORY, 10, 20),
            createCourse("185.001", "2020S", "EP1", "VU", CurriculumCourseType.MANDATORY, 6, 10),
            createCourse("185.001", "2019W", "EP1", "VU", CurriculumCourseType.MANDATORY, 8, 21),
            createCourse("185.001", "2019S", "EP1", "VU", CurriculumCourseType.MANDATORY, 6, 6),
            createCourse("185.001", "2018W", "EP1", "VU", CurriculumCourseType.MANDATORY, 10, 16),
            createCourse("185.001", "2018S", "EP1", "VU", CurriculumCourseType.MANDATORY, 6, 10),
            createCourse("185.001", "2017W", "EP1", "VU", CurriculumCourseType.MANDATORY, 8, 22),
            createCourse("185.001", "2017S", "EP1", "VU", CurriculumCourseType.MANDATORY, 6, 10),
            createCourse("185.001", "2016W", "EP1", "VU", CurriculumCourseType.MANDATORY, 8, 22),
            createCourse("185.001", "2016S", "EP1", "VU", CurriculumCourseType.MANDATORY, 6, 10),

            createCourse("185.002", "2020W", "EP2", "VU", CurriculumCourseType.MANDATORY, 10, 20),
            createCourse("185.002", "2020S", "EP2", "VU", CurriculumCourseType.MANDATORY, 8, 18),
            createCourse("185.002", "2019W", "EP2", "VU", CurriculumCourseType.MANDATORY, 8, 18),
            createCourse("185.002", "2019S", "EP2", "VU", CurriculumCourseType.MANDATORY, 8, 18),
            createCourse("185.002", "2018W", "EP2", "VU", CurriculumCourseType.MANDATORY, 10, 20),
            createCourse("185.002", "2018S", "EP2", "VU", CurriculumCourseType.MANDATORY, 8, 16),
            createCourse("185.002", "2017W", "EP2", "VU", CurriculumCourseType.MANDATORY, 10, 20),
            createCourse("185.002", "2017S", "EP2", "VU", CurriculumCourseType.MANDATORY, 8, 16),
            createCourse("185.002", "2016W", "EP2", "VU", CurriculumCourseType.MANDATORY, 10, 20),
            createCourse("185.002", "2016S", "EP2", "VU", CurriculumCourseType.MANDATORY, 8, 25),

            createCourse("187.001", "2020W", "DWI", "VU", CurriculumCourseType.MANDATORY, 3, 22),
            createCourse("187.001", "2019W", "DWI", "VU", CurriculumCourseType.MANDATORY, 4, 21),
            createCourse("187.001", "2018W", "DWI", "VU", CurriculumCourseType.MANDATORY, 4, 22),
            createCourse("187.001", "2017W", "DWI", "VU", CurriculumCourseType.MANDATORY, 5, 18),
            createCourse("187.001", "2016W", "DWI", "VU", CurriculumCourseType.MANDATORY, 2, 15),

            createCourse("300.001", "2020W", "Aktzeichnen", "UE", CurriculumCourseType.FREE, 1, 1),
            createCourse("300.001", "2020S", "Aktzeichnen", "UE", CurriculumCourseType.FREE, 1, 1),
            createCourse("300.001", "2019W", "Aktzeichnen", "UE", CurriculumCourseType.FREE, 1, 5),
            createCourse("300.001", "2019S", "Aktzeichnen", "UE", CurriculumCourseType.FREE, 1, 4),
            createCourse("300.001", "2018W", "Aktzeichnen", "UE", CurriculumCourseType.FREE, 1, 3),
            createCourse("300.001", "2017W", "Aktzeichnen", "UE", CurriculumCourseType.FREE, 1, 1),

            createCourse("191.001", "2020W", "Computer & Brain", "VO", CurriculumCourseType.ELECTIVE, 1, 0),
            createCourse("191.002", "2020W", "Computer & Brain", "SE", CurriculumCourseType.ELECTIVE, 1, 0),
            createCourse("191.003", "2020W", "Computer & Brain", "UE", CurriculumCourseType.ELECTIVE, 1, 1),
            createCourse("191.001", "2019W", "Computer & Brain", "VO", CurriculumCourseType.ELECTIVE, 1, 0),
            createCourse("191.002", "2019W", "Computer & Brain", "SE", CurriculumCourseType.ELECTIVE, 1, 0),
            createCourse("191.003", "2019W", "Computer & Brain", "UE", CurriculumCourseType.ELECTIVE, 1, 1),
            createCourse("191.001", "2018W", "Computer & Brain", "VO", CurriculumCourseType.ELECTIVE, 1, 0),
            createCourse("191.002", "2018W", "Computer & Brain", "SE", CurriculumCourseType.ELECTIVE, 1, 0),
            createCourse("191.003", "2018W", "Computer & Brain", "UE", CurriculumCourseType.ELECTIVE, 1, 1),
            createCourse("191.001", "2016W", "Computer & Brain", "VO", CurriculumCourseType.ELECTIVE, 1, 0),
            createCourse("191.002", "2016W", "Computer & Brain", "SE", CurriculumCourseType.ELECTIVE, 1, 0),
            createCourse("191.003", "2016W", "Computer & Brain", "UE", CurriculumCourseType.ELECTIVE, 1, 1),

            createCourse("191.001", "2019S", "Advanced Computer & Brain", "VO", CurriculumCourseType.ELECTIVE, 1, 0),
            createCourse("191.001", "2019S", "Advanced Computer & Brain", "PR", CurriculumCourseType.ELECTIVE, 1, 2),
            createCourse("191.001", "2018S", "Advanced Computer & Brain", "VO", CurriculumCourseType.ELECTIVE, 1, 0),
            createCourse("191.001", "2018S", "Advanced Computer & Brain", "PR", CurriculumCourseType.ELECTIVE, 1, 1),
            createCourse("191.001", "2016S", "Advanced Computer & Brain", "VO", CurriculumCourseType.ELECTIVE, 1, 0),
            createCourse("191.001", "2016S", "Advanced Computer & Brain", "PR", CurriculumCourseType.ELECTIVE, 1, 1),

            createCourse("400.001", "2020W", "Fun with Flags", "VO", CurriculumCourseType.FREE, 2, 0),
            createCourse("400.001", "2018W", "Fun with Flags", "VO", CurriculumCourseType.FREE, 2, 0),
            createCourse("400.001", "2017W", "Fun with Flags", "VO", CurriculumCourseType.FREE, 2, 0),
            createCourse("400.001", "2016W", "Fun with Flags", "VO", CurriculumCourseType.FREE, 1, 0),

            createCourse("185.003", "2020W", "AlgoDat", "VU", CurriculumCourseType.MANDATORY, 3, 15),
            createCourse("185.003", "2020S", "AlgoDat", "VU", CurriculumCourseType.MANDATORY, 3, 12),
            createCourse("185.003", "2019W", "AlgoDat", "VU", CurriculumCourseType.MANDATORY, 3, 12),
            createCourse("185.003", "2019S", "AlgoDat", "VU", CurriculumCourseType.MANDATORY, 3, 10),
            createCourse("185.003", "2018W", "AlgoDat", "VU", CurriculumCourseType.MANDATORY, 3, 18),
            createCourse("185.003", "2018S", "AlgoDat", "VU", CurriculumCourseType.MANDATORY, 2, 16),
            createCourse("185.003", "2017W", "AlgoDat", "VU", CurriculumCourseType.MANDATORY, 3, 14),
            createCourse("185.003", "2017S", "AlgoDat", "VU", CurriculumCourseType.MANDATORY, 2, 20),
            createCourse("185.003", "2016W", "AlgoDat", "VU", CurriculumCourseType.MANDATORY, 2, 12)
            );


    private static CourseDTO createCourse(String courseNumber, String semesterCode, String title,String type, CurriculumCourseType ccType, int lectCount, int tutorCount) {
        CourseDTO c = new CourseDTO();
        c.setCourseNumber(courseNumber);
        c.setSemesterCode(semesterCode);
        c.setCcType(ccType);
        c.setTitle(title);
        c.setType(type);
        c.setLecturers(createLecturers(lectCount, tutorCount));
        return c;
    }

    public static List<CourseDTO> getBySemesterCode(String semesterCode) {
        return ALL_COURSES.stream()
                .filter(c -> semesterCode.equals(c.getSemesterCode()))
                .sorted(Comparator.comparing(CourseDTO::getCourseNumber))
                .collect(Collectors.toList());
    }

    public static List<CourseDTO> getByCourseNumber(String courseNumber) {
        return ALL_COURSES.stream()
                .filter(c -> courseNumber.equals(c.getCourseNumber()))
                .sorted(Comparator.comparing(CourseDTO::getSemesterCode).reversed())
                .collect(Collectors.toList());
    }

    public static CourseDTO getBySemesterCodeAndCourseNumber(String semesterCode, String courseNumber) {
        return ALL_COURSES.stream()
                .filter(c -> semesterCode.equals(c.getSemesterCode()))
                .filter(c -> courseNumber.equals(c.getCourseNumber()))
                .findFirst().orElse(null);
    }

    private static List<LecturerDTO> createLecturers(int lectCount, int tutorCount) {
        List<LecturerDTO> lecturers = new ArrayList<>(lectCount + tutorCount);
        for (int i = 0; i < lectCount; i++) {
            LecturerDTO l = new LecturerDTO();
            Random rand = new Random();
            int empPos = rand.nextInt(3);
            l.setCategory(EmploymentCategory.values()[empPos]);
            if (EmploymentCategory.LECTURER == l.getCategory()) {
                int tPos = rand.nextInt(3);
                l.setTariff(Tariff.values()[tPos]);
            } else
                l.setTariff(Tariff.F);
            l.setHours((float)(rand.nextInt(31) + 10)/10);
            lecturers.add(l);
        }
        for (int i = 0; i < tutorCount; i++) {
            LecturerDTO l = new LecturerDTO();
            l.setCategory(EmploymentCategory.STUD_MA);
            l.setTariff(Tariff.T);
            // get a random number between 1 and 10
            Random rand = new Random();
            l.setHours((float)(rand.nextInt(81) + 10)/10);
            lecturers.add(l);
        }
        return lecturers;
    }
}
