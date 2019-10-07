package pl.edu.agh.school.persistence;

import java.util.ArrayList;

import pl.edu.agh.school.SchoolClass;
import pl.edu.agh.school.Teacher;

public interface PersistenceManager {
	public void saveTeachers(ArrayList<Teacher> teachers);

	@SuppressWarnings("unchecked")
	public ArrayList<Teacher> loadTeachers();

	public void saveClasses(ArrayList<SchoolClass> classes);

	@SuppressWarnings("unchecked")
	public ArrayList<SchoolClass> loadClasses();
}
