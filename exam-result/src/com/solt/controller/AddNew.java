package com.solt.controller;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import com.solt.model.Student;
import com.solt.model.Student.Result;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AddNew implements Initializable{
	@FXML
	private TextField roll;
	@FXML
	private TextField name;
	@FXML
	private TextField grade;
	@FXML
	private DatePicker year;
	@FXML
	private TextField man;
	@FXML
	private TextField eng;
	@FXML
	private TextField math;
	@FXML
	private TextField chem;
	@FXML
	private TextField phys;
	@FXML
	private TextField bio;
	@FXML
	private TextField eco;
	private Consumer<Student> saveHandler;
	private Student student;

	public void close() {
		name.getScene().getWindow().hide();
	}

	public void save() {
		if(null == student) {
			student = new Student();
		}
		student.setRoll(Integer.parseInt(roll.getText()));
		student.setName(name.getText());
		student.setGrade(grade.getText());
		student.setYear(year.getValue());
		student.setMyanmar(Integer.parseInt(man.getText()));
		student.setEnglish(Integer.parseInt(eng.getText()));
		student.setMathematics(Integer.parseInt(math.getText()));
		student.setChemastry(Integer.parseInt(chem.getText()));
		student.setPhysics(Integer.parseInt(phys.getText()));
		student.setBiology(Integer.parseInt(bio.getText()));
		student.setEcology(Integer.parseInt(eco.getText()));
		student.setSubject(student.toString());
		student.setResult(checkResult());
		saveHandler.accept(student);
		
		eco.getScene().getWindow().hide();
	}

	public static void show(Consumer<Student> saveHandler) {
		try {
			FXMLLoader loder = new FXMLLoader(AddNew.class.getResource("AddNew.fxml"));
			Parent root = loder.load();
			AddNew controller = loder.getController();
			controller.saveHandler = saveHandler;
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(new Scene(root));
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public Result checkResult() {
		if(student.getMyanmar() > 40) {
			
			return Result.PASS;
		}
	
		return Result.FAIL;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		year.setValue(LocalDate.now());
	}

	
	
}
