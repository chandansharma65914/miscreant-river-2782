package com.masai.Dao;



import java.util.List;

import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomethingWentWrongException;
import com.masai.entity.Assignment;
import com.masai.entity.Course;
import com.masai.entity.Discussion;
import com.masai.entity.Grade;
import com.masai.entity.Instructor;
import com.masai.entity.Student;

public interface IInstructorDao {

    void register(Instructor instructor) throws SomethingWentWrongException;

    Instructor login(String username, String password) throws NoRecordFoundException;

    List<Course> getCoursesByInstructor(Instructor instructor);
    

    void createCourse(Course course) throws SomethingWentWrongException;

    void updateCourse(Course course) throws SomethingWentWrongException, NoRecordFoundException;

    void deleteCourse(Course course) throws SomethingWentWrongException, NoRecordFoundException;

    List<Assignment> getAssignmentsByCourse(Course course);

    void createAssignment(Assignment assignment, Course course) throws SomethingWentWrongException;

    void updateAssignment(Assignment assignment) throws SomethingWentWrongException, NoRecordFoundException;

    void deleteAssignment(Assignment assignment) throws SomethingWentWrongException, NoRecordFoundException;

    List<Grade> getGradesByAssignment(Assignment assignment);

    void gradeAssignment(Student student, Assignment assignment, int score) throws SomethingWentWrongException, NoRecordFoundException;

    List<Discussion> getDiscussionsByCourse(Course course);

    void createDiscussion(Discussion discussion, Course course) throws SomethingWentWrongException;

    void updateDiscussion(Discussion discussion) throws SomethingWentWrongException, NoRecordFoundException;

    void deleteDiscussion(Discussion discussion) throws SomethingWentWrongException, NoRecordFoundException;

//    List<DiscussionPost> getDiscussionPostsByDiscussion(Discussion discussion);
//
//    void createDiscussionPost(DiscussionPost post, Discussion discussion) throws SomethingWentWrongException;
//
//    void updateDiscussionPost(DiscussionPost post) throws SomethingWentWrongException, NoRecordFoundException;
//
//    void deleteDiscussionPost(DiscussionPost post) throws SomethingWentWrongException, NoRecordFoundException;

    void logout();
}
