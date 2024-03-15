package tqcfx.gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class TQCMainSceneController implements Initializable{
	
	@FXML
	private TextField tfName;
	

    @FXML
    private TextField func_config;

    @FXML
    private TextField func_desc;

    @FXML
    private TextField func_in;

    @FXML
    private TextField func_out;

    @FXML
    private TextField func_status;

    @FXML
    private TableView<?> func_variables;

    @FXML
    private TextField functionainfo_id;

    @FXML
    private TextField functionalityID;

    @FXML
    private TextField functionalityName;

    @FXML
    private TableView<set_functionality> functionalityVariable;
    @FXML private TableColumn<set_functionality, String> variablesColumn;
    @FXML private TableColumn<set_functionality, String> constraintColumn;
    @FXML private TableColumn<set_functionality, Integer> InputIOColumn;
    @FXML private TableColumn<set_functionality, Integer> OutputIOColumn;
    

    @FXML
    private TableView<functionality_req> functionalityrequiirements;
    @FXML private TableColumn<functionality_req,String> functionalityColumn;
    @FXML private TableColumn<functionality_req,String> requirementColumn;
    @FXML private TableColumn<functionality_req,Integer> IDColumn;


	private boolean add;
    

	
	@FXML
	public void btnTestOnClick(ActionEvent event) {
		Stage mainWindow = (Stage) tfName.getScene().getWindow();
		String title = tfName.getText();
		mainWindow.setTitle(title);		
	}
	

    @FXML
    void btnLoadFunctionOnClick(ActionEvent event) {

    }


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		//set up the columns in the functionality_req table
		functionalityColumn.setCellValueFactory(new PropertyValueFactory<functionality_req,String>("functionality_name"));
		requirementColumn.setCellValueFactory(new PropertyValueFactory<functionality_req, String>("requirement"));
		IDColumn.setCellValueFactory(new PropertyValueFactory<functionality_req, Integer>("ID"));
		
		//set up the columns in the functionalityvariable table
		variablesColumn.setCellValueFactory(new PropertyValueFactory<set_functionality,String>("variables"));
		constraintColumn.setCellValueFactory(new PropertyValueFactory<set_functionality, String>("constraint"));
		InputIOColumn.setCellValueFactory(new PropertyValueFactory<set_functionality, Integer>("inputIO"));
		OutputIOColumn.setCellValueFactory(new PropertyValueFactory<set_functionality,Integer>("outputIO"));
		
		
		//load data in the functionality_req table
		functionalityrequiirements.setItems(getFuntionalityRequirementsItems());
		//load data in the funationalityvariable table
		functionalityVariable.setItems(getFunctionalityVariables());
		
		
	}
	
	
	public ObservableList<set_functionality> getFunctionalityVariables() {
		ObservableList<set_functionality> func_varabledetail = FXCollections.observableArrayList();
		func_varabledetail.add(new set_functionality("Test Pressure", "< 3000 mbar", 0, 1));
		func_varabledetail.add(new set_functionality("Fill Time", "10 sec", 0, 1));
		func_varabledetail.add(new set_functionality("Stabilisation Time", "15 sec", 0, 1));
		func_varabledetail.add(new set_functionality("Isolation Delay", "5 sec", 0, 1));
		return func_varabledetail;
	}


	public ObservableList<functionality_req> getFuntionalityRequirementsItems() {
		ObservableList<functionality_req> func_reqdetail = FXCollections.observableArrayList();
		func_reqdetail.add(new functionality_req("leakTest", "TestPressure<3000mbar", 1));
		return func_reqdetail;
		
	}
    
    
    

   
}
