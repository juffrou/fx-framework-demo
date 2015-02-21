package org.juffrou.fx.business.ctrl;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import org.juffrou.fx.business.dom.DiscoPerson;
import org.juffrou.fx.controller.BeanController;
import org.juffrou.fx.controller.model.BeanControllerModel;

public class PersonController extends BeanController<DiscoPerson> {
	
	public static String FXML_PATH = "/org/juffrou/fx/business/Person";
	
	@FXML
	private TextField name;
	
	@FXML
	private TextField email;
	
	@FXML
	private DatePicker dateOfBirth;
	
	public PersonController() {
		super(DiscoPerson.class);
	}

	public void bindControllerModel(BeanControllerModel<DiscoPerson> presentationModel) {

		presentationModel.readWriteBind(name.textProperty(), "name");
		presentationModel.readonlyBind(email.textProperty(), "email");
		presentationModel.readWriteBind(dateOfBirth.valueProperty(), "dateOfBirth");
	}
	
}
