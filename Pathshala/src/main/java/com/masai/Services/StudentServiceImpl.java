package com.masai.Services;

import java.util.List;

import com.masai.Dao.IStudentDao;
import com.masai.Dao.StudentsDaoImpl;
import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomethingWentWrongException;
import com.masai.entity.Assignment;
import com.masai.entity.Course;
import com.masai.entity.Discussion;
import com.masai.entity.Grade;
import com.masai.entity.Student;

public class StudentServiceImpl implements IStudentService {

	@Override
	public void singUp(Student student) throws SomethingWentWrongException {

		IStudentDao st = new StudentsDaoImpl();
		st.singUp(student);

	}

	@Override
	public Student login(String username, String password) throws NoRecordFoundException {
		IStudentDao st = new StudentsDaoImpl();
		return st.login(username, password);

	}

	@Override
	public void accessAssignments(Student loggedInStudent) {
		IStudentDao st = new StudentsDaoImpl();
		st.accessAssignments(loggedInStudent);

	}

	@Override
	public void trackProgress() {
		IStudentDao st = new StudentsDaoImpl();
		st.trackProgress();

	}

	@Override
	public void accessLectures(String username, String password)
			throws SomethingWentWrongException, NoRecordFoundException {
		IStudentDao st = new StudentsDaoImpl();
		st.accessLectures(username, password);

	}

	@Override
	public void accessReadings(String username, String password) throws SomethingWentWrongException {
		IStudentDao st = new StudentsDaoImpl();
		st.accessReadings(username, password);

	}

	@Override
	public void accessVideos(String username, String password) throws SomethingWentWrongException {
		IStudentDao st = new StudentsDaoImpl();
		st.accessVideos(username, password);

	}

	@Override
	public void logout() {
		IStudentDao st = new StudentsDaoImpl();
		st.logout();

	}

	@Override
	public List<Course> getEnrolledCourses(Student student) {
		IStudentDao st = new StudentsDaoImpl();

		return st.getEnrolledCourses(student);
	}

	@Override
	public List<Assignment> getAssignmentsByStudent(Student student) {
		IStudentDao st = new StudentsDaoImpl();

		return st.getAssignmentsByStudent(student);
	}

	@Override
	public void submitAssignment(Student student, Assignment assignment, String submission) {
		IStudentDao st = new StudentsDaoImpl();

		st.submitAssignment(student, assignment, submission);

	}

	@Override
	public List<Grade> getGradesByStudent(Student student) {
		IStudentDao st = new StudentsDaoImpl();

		return st.getGradesByStudent(student);
	}

	@Override
	public List<Discussion> getDiscussionsByCourse(Course course) {
		IStudentDao st = new StudentsDaoImpl();

		return st.getDiscussionsByCourse(course);
	}

	@Override
	public void createDiscussionPost(Student student, Course course, String content) {
		IStudentDao st = new StudentsDaoImpl();

		st.createDiscussionPost(student, course, content);

	}

	@Override
	public List<Discussion> getDiscussionPostsByDiscussion(Discussion discussion) {
		IStudentDao st = new StudentsDaoImpl();

		return st.getDiscussionPostsByDiscussion(discussion);
	}

}
