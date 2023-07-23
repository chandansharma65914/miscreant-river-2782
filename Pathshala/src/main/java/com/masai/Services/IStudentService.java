package com.masai.Services;

import java.util.List;

import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomethingWentWrongException;
import com.masai.entity.Assignment;
import com.masai.entity.Course;
import com.masai.entity.Discussion;
import com.masai.entity.Grade;
import com.masai.entity.Student;

public interface IStudentService {
	void singUp(Student student)throws SomethingWentWrongException;
    Student login(String username, String password) throws NoRecordFoundException;
    
    void accessAssignments(Student loggedInStudent);
    
    void trackProgress();
    void accessLectures(String username, String password) throws SomethingWentWrongException, NoRecordFoundException;
    void accessReadings(String username, String password)throws SomethingWentWrongException;
    void accessVideos(String username, String password)throws SomethingWentWrongException;
    void logout();
    List<Course> getEnrolledCourses(Student student);
    List<Assignment> getAssignmentsByStudent(Student student);
    void submitAssignment(Student student, Assignment assignment, String submission);
    List<Grade> getGradesByStudent(Student student);
    List<Discussion> getDiscussionsByCourse(Course course);
    void createDiscussionPost(Student student, Course course, String content);
    List<Discussion> getDiscussionPostsByDiscussion(Discussion discussion);
}
