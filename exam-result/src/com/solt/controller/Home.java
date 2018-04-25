package com.solt.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.solt.model.Repository;
import com.solt.model.Student;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;

public class Home implements Initializable{
	@FXML
	private TableView<Student> table;
	private Repository repo;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		repo = Repository.getInstance();
		MenuItem edit = new MenuItem("Edit");
		MenuItem delete = new MenuItem("Delete");
		edit.setOnAction(a -> {
			edit();
		});
		delete.setOnAction(d -> {
			delete();
		});
		ContextMenu ctx = new ContextMenu(edit,delete);
		table.setContextMenu(ctx);
		search();
		
	}
	public void addNew() {
		AddNew.show(this::save);
	}
	private void save(Student s) {
		if(s.getId() == 0){
			repo.add(s);
		}
		search();
	}
	public void search() {
		table.getItems().clear();
		List<Student> result = repo.find();
		table.getItems().addAll(result);
	}
	private void edit() {
		
	}
	private void delete() {
		Student s = table.getSelectionModel().getSelectedItem();
		repo.delete(s.getId());
		search();
	}
}
