package com.solt.model;

import java.util.ArrayList;
import java.util.List;

public class MemRepository implements Repository {
	private static Repository REPO;

	static Repository getInstance() {
		if (null == REPO) {
			REPO = new MemRepository();
		}
		return REPO;
	}

	protected List<Student> list;

	MemRepository() {
		list = new ArrayList<>();
	}

	@Override
	public void add(Student s) {
		int size = list.size();

		if (size == 0) {
			s.setId(1);
		} else {
			int id = list.get(size - 1).getId() + 1;
			s.setId(id);
		}

		list.add(s);
	}

	public List<Student> find() {
		return list;
	}

	@Override
	public void delete(int id) {
		Student s = find(id);
		if(null != s) {
			list.remove(s);
		}
	}
	@Override
	public Student find(int id) {
		for (Student student : list) {
			if(student.getId() == id) {
				return student;
			}
		}
		return null;
	}
}
