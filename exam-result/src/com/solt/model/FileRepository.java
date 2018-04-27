package com.solt.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FileRepository extends MemRepository implements Repository {
	private static final String FILE = "data.obj";
	private static Repository REPO;
	

	public static Repository getInstance() {
		if (null == REPO) {
			REPO = new FileRepository();
		}
		return REPO;
	}

	@SuppressWarnings("unchecked")
	FileRepository() {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE))) {
			list = (List<Student>) in.readObject();
		} catch (Exception e) {
			System.err.println("FIRST TIME");
		}
		if (null == list) {
			list = new ArrayList<>();
		}
	}
	@Override
	public void add(Student s) {
		super.add(s);
		saveFile();
	}
	
	private void saveFile() {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE))){
			out.writeObject(list);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void delete(int id) {
		super.delete(id);
		saveFile();
	}
}
