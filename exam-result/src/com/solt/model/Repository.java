package com.solt.model;

import java.util.List;

public interface Repository {
	static Repository getInstance() {
		return MemRepository.getInstance();
	}
	void add(Student s);
	List<Student> find();
	void delete(int id);
	Student find(int id);
}
