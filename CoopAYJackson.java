import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javax.swing.ImageIcon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.beans.property.SimpleStringProperty;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.WritableImage;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CoopAYJackson extends Application
{  //data fields - class level variables
   
   Button btnWelcome;
   Button btnBack1;
   Button btnBack2;
   Button btnSubmit;
   String style;
   Label lblTitle;
   TextArea taInto1;
   String style1 = "-fx-font-size: 38px; -fx-text-fill: #a353cf;";
      
   TextField  tfSupervisor2 = new TextField();
   TextField  tfFirstAidPlace = new   TextField();
   TextField tfFirstAidTrained = new TextField();
   TextArea   taSafetyRules = new TextArea();
   TextArea  taWorkProcedures = new TextArea();
   TextArea taHazards = new TextArea();
   TextArea taIllnesses = new TextArea();
   TextArea taEmergencyProcedures = new TextArea();
   TextArea taProtectiveEquipment = new TextArea();
   TextField  tfOtherTopics = new TextField();
   
   // All checkbox lbls
   
   VBox timeSheetsBox = new VBox(10,
    new Label("Time Sheets"),
    new CheckBox("Time Sheet #1"),
    new CheckBox("Time Sheet #2"),
    new CheckBox("Time Sheet #3"),
    new CheckBox("Time Sheet #4"),
    new CheckBox("Time Sheet #5"),
    new CheckBox("Time Sheet #6"),
    new CheckBox("Time Sheet #7"),
    new CheckBox("Time Sheet #8")
   );

   VBox prePlacementBox = new VBox(10,
    new Label("Pre-Placement"),
    new CheckBox("Young Worker Awareness Program"),
    new CheckBox("Worker Health and Safety in 4 Steps"),
    new CheckBox("WHMIS Online Certification"),
    new CheckBox("Resume and References"),
    new CheckBox("Cover Letter"),
    new CheckBox("Interview Folder"),
    new CheckBox("What Is Co-op?"),
    new CheckBox("Company And Job Research"),
    new CheckBox("5 Interview Qs"),
    new CheckBox("Employer Interview Evaluation")
   );

   VBox integrationBox = new VBox(10,
    new Label("Integration"),
    new CheckBox("Safety Orientation"),
    new CheckBox("Language of The Workplace"),
    new CheckBox("First Week Observation Sheet"),
    new CheckBox("A Tour Through My Placement")
   );

   VBox reflectionBox = new VBox(10,
    new Label("Reflection"),
    new CheckBox("Reflection 1"),
    new CheckBox("Reflection 2"),
    new CheckBox("Reflection 3"),
    new CheckBox("Reflection 4")
   );

   VBox culminatingBox = new VBox(10,
    new Label("Culminating"),
    new CheckBox("Final Visit and Evaluation"),
    new CheckBox("Finalized Learning Plan"),
    new CheckBox("Final Project: Book Creator"),
    new CheckBox("Final Project: Mind Map"),
    new CheckBox("Final Presentation"),
    new CheckBox("Exit Resume"),
    new CheckBox("Thank you letter")
   );

   ProgressBar progressBar = new ProgressBar();

         

   
       // Creating the root system interface 3 uses grid insted
         
   StackPane root1 = new StackPane();
   GridPane grid2 = new GridPane();
   GridPane grid3 = new GridPane();
   GridPane grid4 = new GridPane();
   GridPane grid5 = new GridPane();
   
        // creating all stages
        
   Stage stage1 = new Stage();
   Stage stage2 = new Stage();
   Stage stage3 = new Stage();
   Stage stage4 = new Stage();
   Stage stage5 = new Stage();
   
        // createing scenes
   Scene scene1 = new Scene(root1, 400, 400);
   Scene scene2 = new Scene(grid2, 400, 400);
   Scene scene3 = new Scene(grid3, 700, 700);
   Scene scene4 = new Scene(grid4, 800, 600);
   Scene scene5 = new Scene(grid5, 400, 400);
   
   
      // creating the first interface foe welcoming the user
   public static void main(String[] args) {
      launch(args);
   }
   public void start(Stage stage)
   {         
         // Creating and Intializing the buttons
            
      Button btnWelcome = new Button("welcome");
      btnWelcome.setOnAction(e ->   Choose(stage1));
            
      Button btnBack2 = new Button("Back");
      btnBack2.setOnAction(e ->   Choose(stage));
         
         
        // btnSubmit.setOnAction(e -> Submit( ));
       
         //title
        
      lblTitle = new Label("Welcome to Coop!");
      lblTitle.setStyle(style1);
      StackPane.setAlignment(lblTitle, Pos.TOP_CENTER);
      StackPane.setMargin(lblTitle, new Insets(10));
      root1.getChildren().add(lblTitle);
         
         // Creating screne for  user to see
          
      root1.setStyle("-fx-background-color: #87CEEB");
      stage1.setTitle("Welcome");
      stage1.setScene(scene1);
      stage1.show();
           
          // Load the image into ImageView
   
      ImageView imageView = new ImageView("AYJackson.png");   
                 
          // Resize image
           
      imageView.setFitWidth(350);
      imageView.setFitHeight(250);
      root1.getChildren().add(imageView);
      StackPane.setAlignment(imageView, Pos.CENTER);
      StackPane.setMargin(imageView, new Insets(25, 0, 20, 0));
           
          // placing the welcome btn 
      root1.getChildren().add(btnWelcome);
      StackPane.setAlignment(btnWelcome, Pos.CENTER);
   
   }//..end start
   
   void Choose(Stage stage)
   {
      stage1.close();
      stage3.close();
      stage4.close();
      stage5.close();
      grid2.setStyle("-fx-background-color: #B3D9FF;");
      stage2.setTitle("Choose");
      stage2.setScene(scene2);
      stage2.show();
      
      grid2.setPadding(new Insets(5)); 
      grid2.setHgap(5);
      grid2.setVgap(5); 
                          
          //title
        
      lblTitle = new Label("Choose the program you would like to use");
      lblTitle.setStyle( "-fx-font-size: 20px; -fx-text-fill: #a353cf;");
      grid2.add(lblTitle,0,0,4,2);
      
      TextArea intro = new TextArea(
         "Welcome to the Co-operative Education Program! I am excited to have you join the program for this unique learning experience that blends classroom theory with hands-on workplace practice. Throughout the program, you'll have the opportunity to explore potential career paths, develop valuable employability skills, and build meaningful connections in the professional world. I look forward to supporting you on this journey as you grow both personally and professionally."
         );
         
      intro.setMaxSize(400, 120); // tweak as needed
      StackPane.setMargin(intro, new Insets(20));
   
   // Optional styling tweaks
      intro.setWrapText(true); // Makes sure the text wraps inside the area
      intro.setEditable(false); // Prevents the user from modifying the text
      grid2.add(intro, 0,5,3,1);
   
   
          // Load the image
      Image image1 = new Image("https://media.licdn.com/dms/image/v2/D5612AQHVbxEtd4-N8w/article-cover_image-shrink_600_2000/article-cover_image-shrink_600_2000/0/1688520136134?e=2147483647&v=beta&t=um6fDYsJ7Zg1L8-xJ32kB4gMpJA6ieC1KWJmJE3l0B8");
      Image image2 = new Image("https://i0.wp.com/iserotope.com/wp-content/uploads/2014/02/8151789_orig.png");
   
          // Add image to an ImageView
   
      ImageView imageView1 = new ImageView(image1);
   
          // Add image to an ImageView
   
      ImageView imageView2 = new ImageView(image2);
   
          // creting image buttons and placing them
   
      Button imageButton1 = new Button();
      imageButton1.setGraphic(imageView1);
      grid2.add(imageButton1,0,9,1,1);
      imageView1.setFitWidth(200);
      imageView1.setPreserveRatio(true);
      imageButton1.setOnAction(e -> safty(stage));
   
   
      Button imageButton2 = new Button();
      imageButton2.setGraphic(imageView2);
      grid2.add(imageButton2,2,9,1,1);
      imageView2.setFitWidth(150);
      imageView2.setPreserveRatio(true);
      imageButton2.setOnAction(e ->  assigment(stage));
   
      Button btnBack1 = new Button("Back");
      btnBack1.setOnAction(e -> stage2.setScene(scene1));
                 
      // placing the back btn       
      grid2.add(btnBack1,0,10);
   
   }
   void safty(Stage stage)
   {  
      stage2.close();
      grid3.setStyle("-fx-background-color: aff7df;");
      stage3.setTitle("Choose");
      stage3.setScene(scene3);
      stage3.show();
            // Creating the grid
           
      grid3.setPadding(new Insets(30,20, 20, 30));
      grid3.setVgap(15);
      grid3.setHgap(15);
   
      lblTitle = new Label("Safety Orientation");
      lblTitle.setStyle( "-fx-font-size: 20px; -fx-text-fill: #f7afc7");
      grid3.add(lblTitle,0,0);
     
      Label lblh = new Label("Please scroll through and answer all of the question.");
      lblh.setStyle( "-fx-font-size: 10px;");
   
       
      grid3.add(lblh, 1, 0);
   
   
      Separator separator = new Separator();
      GridPane.setColumnSpan(separator, 6);
      grid3.add(separator, 0, 1);             
                     
         // Supervisor replacment
         
      Label lbl1 = new Label("Who to report to if supervisor is not on site: ");
      lbl1.setWrapText(true); 
      grid3.add(lbl1, 0, 2);
      grid3.add(tfSupervisor2, 1, 2);
   
         
         //  First aid kit and eye wash facilities
         
      Label lbl2 = new Label("Location of first aid kit and eye wash facilities (if applicable):");
      lbl2.setPrefWidth(400);
      lbl2.setWrapText(true);
      grid3.add(lbl2, 0, 3);
      grid3.add(tfFirstAidPlace,1,3);
         
         //  Trained in first aid?
         
      Label lbl3 = new Label("Who is trained in first aid?");
      lbl3.setWrapText(true);
      grid3.add(lbl3, 0, 4);
      grid3.add(tfFirstAidTrained,1,4);
   
         
         // Workplace health and safety rules emphasized:
   
   
      Label lbl4 = new Label("Workplace health and safety rules emphasized: ");
      lbl4.setWrapText(true); 
      grid3.add(lbl4, 0, 5);
      taSafetyRules.setText("1\n2.\n3");
      taSafetyRules.setPrefWidth(100);  
      taSafetyRules.setPrefHeight(70); 
      grid3.add( taSafetyRules, 1,5);
         
         // Specific tasks
         
      Label lbl5 = new Label("Safe work procedures for specific tasks: ");
      lbl5.setWrapText(true); 
      grid3.add(lbl5, 0, 6);
      taWorkProcedures.setText("1\n2.\n3");
      taWorkProcedures.setPrefWidth(100);  
      taWorkProcedures.setPrefHeight(70); 
      grid3.add(taWorkProcedures, 1,6);
         
         // Hazards
         
      Label lbl6 = new Label("Knowns hazards and how to deal with them: ");
      lbl6.setWrapText(true); 
      grid3.add(lbl6, 0, 7);
      taHazards.setText("1\n2.\n3");
      taHazards.setPrefWidth(100);  
      taHazards.setPrefHeight(70); 
      grid3.add(taHazards, 1,7);
         
         // Reporting of Illnesses and Injuries
         
      Label lbl7 = new Label("Reporting of Illnesses and Injuries: ");
      lbl7.setWrapText(true); 
      grid3.add(lbl7, 0, 8);
      taIllnesses.setText("1) When to report:\nb) Who to report to:\nc) Documentation required:");
      taIllnesses.setPrefWidth(100);  
      taIllnesses.setPrefHeight(70); 
      grid3.add( taIllnesses, 1,8);
         
         // Emergency procedures
        
      Label lbl8 = new Label("Emergency procedures: ");
      lbl8.setWrapText(true); 
      grid3.add(lbl8, 0, 9);
      taEmergencyProcedures.setText("a)  Location of emergency exits\nb) Location of meeting points\nc) Location of fire extinguishers\nd) Location of fire alarms\ne) Fire escape plan\n");
      taEmergencyProcedures.setPrefWidth(300);  
      taEmergencyProcedures.setPrefHeight(100); 
      grid3.add(taEmergencyProcedures, 1,9);
   
   
   
         // Personal protective equipment 
         
      Label lbl9 = new Label("Personal protective equipment (what, when, where): ");
      lbl9.setWrapText(true); 
      grid3.add(lbl9, 0, 10);
      taProtectiveEquipment.setText("1\n2.\n3");
      taProtectiveEquipment .setPrefWidth(100);  
      taProtectiveEquipment.setPrefHeight(70); 
      grid3.add(taProtectiveEquipment , 1,10);
                 
         //  Other topics
         
      Label lbl10 = new Label("Other topics (confidentiality, theft prevention, etc.)");
      lbl10.setWrapText(true);
      grid3.add(lbl10, 0, 11);
      grid3.add(tfOtherTopics,1,11);
   
   
      Separator separator2 = new Separator();
      GridPane.setColumnSpan(separator2, 6);  
      grid3.add(separator2, 0, 12);            
   
            
         // Creating the back button
                   
      Button btnBack2 = new Button("Back");
      btnBack2.setOnAction(e ->   Choose(stage));
   
               
         // Creaing the submit button
         
      Button btnSubmit = new Button("Submit");
      btnSubmit.setOnAction(e -> submit(stage));
   
           // Creaing the clear button
         
      Button btnClear = new Button("Clear");
      btnClear.setOnAction(e ->clear());
      
      
      HBox buttonBox = new HBox(100); // 10px spacing between buttons
      buttonBox.getChildren().addAll(btnClear, btnBack2, btnSubmit);
      grid3.add(buttonBox,0,13,2,1);
   }
   void clear()
   {
      tfSupervisor2.setText("");
      tfFirstAidPlace.setText("");
      tfFirstAidTrained.setText("");
      taSafetyRules.setText("1\n2.\n3");
      taWorkProcedures.setText("1\n2.\n3");
      taHazards.setText("1\n2.\n3");
      taIllnesses.setText("1) When to report:\nb) Who to report to:\nc) Documentation required:");
      taEmergencyProcedures.setText("a)  Location of emergency exits\nb) Location of meeting points\nc) Location of fire extinguishers\nd) Location of fire alarms\ne) Fire escape plan\n");
      taProtectiveEquipment.setText("1\n2.\n3");
      tfOtherTopics.setText("");    
   }
   
   void submit(Stage stage)
   {  
      stage3.close();
      grid4.setStyle("-fx-background-color: #fafabe;");
      stage4.setTitle("Safety Orientation Submited");
      stage4.setScene(scene4);
      stage4.show();
            // Creating the grid
           
      grid4.setPadding(new Insets(30,20, 20, 30));
      grid4.setVgap(15);
      grid4.setHgap(15);
   
      lblTitle = new Label("Safety Orientation Submited");
      lblTitle.setStyle( "-fx-font-size: 20px; -fx-text-fill: #F6CA94");
      grid4.add(lblTitle,0,0);
      
      Button btnBack4 = new Button("Back");
      btnBack4.setOnAction(e ->  Choose(stage));
      grid4.add( btnBack4,0,2);
   
      TableView<SafetyTopic> table = new TableView<>();
         
      TableColumn<SafetyTopic, String> topicCol = new TableColumn<>("Topic");
      topicCol.setCellValueFactory(new PropertyValueFactory<>("topic"));
      topicCol.setPrefWidth(250);
         
      TableColumn<SafetyTopic, String> detailsCol = new TableColumn<>("Details");
      detailsCol.setCellValueFactory(new PropertyValueFactory<>("details"));
      detailsCol.setPrefWidth(500);   
      table.getColumns().addAll(Arrays.asList(topicCol, detailsCol));
   
         
      ObservableList<SafetyTopic> data = FXCollections.observableArrayList(
                new SafetyTopic("Supervisor Not On Site", tfSupervisor2.getText()),
                new SafetyTopic("First Aid Kit Location", tfFirstAidPlace.getText()),
                new SafetyTopic("Trained in First Aid", tfFirstAidTrained.getText()),
                new SafetyTopic("Safety Rules", taSafetyRules.getText()),
                new SafetyTopic("Work Procedures", taWorkProcedures.getText()),
                new SafetyTopic("Hazards", taHazards.getText()),
                new SafetyTopic("Illness & Injury Reporting", taIllnesses.getText()),
                new SafetyTopic("Emergency Procedures", taEmergencyProcedures.getText()),
                new SafetyTopic("Protective Equipment", taProtectiveEquipment.getText()),
                new SafetyTopic("Other Topics", tfOtherTopics.getText())
               );
         
      table.setItems(data);
      table.setPrefWidth(700);  
      table.setPrefHeight(800); 
   
         
      grid4.add(table,0,1,3,1);
         
      Button btnSave = new Button("Save");
      btnSave.setOnAction(
         e -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save Safety Table Snapshot");
            fileChooser.getExtensionFilters().add(
               new FileChooser.ExtensionFilter("PNG Image", "*.png")
               );
            fileChooser.setInitialFileName("safety_table.png");
         
            File file = fileChooser.showSaveDialog(stage4); // Use your current stage
            if (file != null) {
               download(table, file);
            }
         });
      grid4.add(btnSave, 1, 2);
          
   }
   public static class SafetyTopic {
      private final SimpleStringProperty topic;
      private final SimpleStringProperty details;
   
      public SafetyTopic(String topic, String details) {
         this.topic = new SimpleStringProperty(topic);
         this.details = new SimpleStringProperty(details);
      }
   
      public String getTopic() {
         return topic.get();
      }
   
      public void setTopic(String value) {
         topic.set(value);
      }
   
      public String getDetails() {
         return details.get();
      }
   
      public void setDetails(String value) {
         details.set(value);
      }
    
   }
   public void download(TableView<SafetyTopic> table, File file) {
      WritableImage snapshot = table.snapshot(new SnapshotParameters(), null);
   
      int width = (int) snapshot.getWidth();
      int height = (int) snapshot.getHeight();
   
      BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
   
      for (int y = 0; y < height; y++) {
         for (int x = 0; x < width; x++) {
            int argb = snapshot.getPixelReader().getArgb(x, y);
            bufferedImage.setRGB(x, y, argb);
         }
      }
      try {
         ImageIO.write(bufferedImage, "png", file);
         System.out.println("Image export successful!");
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   void assigment(Stage stage) {
      stage2.close();
      stage5.setTitle("Assignment List");
   
    // Background image
      Image image = new Image(getClass().getResourceAsStream("/comming.jpg"));
      ImageView imageView3 = new ImageView(image);
      imageView3.setPreserveRatio(false);
      imageView3.setMouseTransparent(true);
      imageView3.setOpacity(0.3);
   
    // Bind image size to scene later
      imageView3.fitWidthProperty().bind(stage5.widthProperty());
      imageView3.fitHeightProperty().bind(stage5.heightProperty());
   
    // Title label
      Label lblTitle = new Label("Assignment List");
      lblTitle.setStyle("-fx-font-size: 24px; -fx-text-fill: #4B006E");
      lblTitle.setMaxWidth(Double.MAX_VALUE);
      lblTitle.setAlignment(Pos.CENTER);
   
    // Checkbox grid
      GridPane checkboxGrid = new GridPane();
      checkboxGrid.setPadding(new Insets(20));
      checkboxGrid.setAlignment(Pos.TOP_LEFT);
      checkboxGrid.setStyle("-fx-background-color: rgba(255,255,255,0.7);");
      checkboxGrid.setHgap(30);
      checkboxGrid.setVgap(20);
   
      TitledPane timeSheetsPane = new TitledPane("🕒 Time Sheets", timeSheetsBox);
      TitledPane prePlacementPane = new TitledPane("🏢 Pre-Placement", prePlacementBox);
      TitledPane integrationPane = new TitledPane("🔄 Integration", integrationBox);
      TitledPane reflectionPane = new TitledPane("💭 Reflection", reflectionBox);
      TitledPane culminatingPane = new TitledPane("🎓 Culminating", culminatingBox);
   
      for (TitledPane pane : List.of(timeSheetsPane, prePlacementPane, integrationPane, reflectionPane, culminatingPane)) {
         pane.setExpanded(false);
         pane.setMaxWidth(Double.MAX_VALUE);
      }
   
      checkboxGrid.add(timeSheetsPane, 0, 0);
      checkboxGrid.add(prePlacementPane, 1, 0);
      checkboxGrid.add(integrationPane, 0, 1);
      checkboxGrid.add(reflectionPane, 1, 1);
      checkboxGrid.add(culminatingPane, 2, 0);
   
    // Progress bar
      progressBar.setProgress(0.0);
      progressBar.setPrefHeight(20);
      progressBar.prefWidthProperty().bind(stage5.widthProperty().multiply(0.5));
   
      HBox progressBox = new HBox(progressBar);
      progressBox.setAlignment(Pos.CENTER);
      progressBox.setPadding(new Insets(10));
      progressBox.setMaxWidth(Double.MAX_VALUE);
   
    // Collect checkboxes
      List<CheckBox> checkboxList = new ArrayList<>();
      for (VBox box : List.of(timeSheetsBox, prePlacementBox, integrationBox, reflectionBox, culminatingBox)) {
         for (Node node : box.getChildren()) {
            if (node instanceof CheckBox cb) {
               checkboxList.add(cb);
            }
         }
      }
      CheckBox[] allCheckboxes = checkboxList.toArray(new CheckBox[0]);
   
      for (CheckBox cb : allCheckboxes) {
         cb.setOnAction(
            e -> {
               long selectedCount = Arrays.stream(allCheckboxes).filter(CheckBox::isSelected).count();
               double progress = (double) selectedCount / allCheckboxes.length;
               progressBar.setProgress(progress);
            });
      }
   
    // Buttons
      Button btnBack3 = new Button("Back");
      btnBack3.setOnAction(e -> Choose(stage));
   
      Button btnClear = new Button("Clear");
      btnClear.setOnAction(
         e -> {
            for (CheckBox cb : allCheckboxes) cb.setSelected(false);
            progressBar.setProgress(0.0);
         });
   
      HBox buttonBox = new HBox(10, btnClear, btnBack3);
      buttonBox.setAlignment(Pos.CENTER);
      buttonBox.setPadding(new Insets(10)); 
      buttonBox.setMaxWidth(Double.MAX_VALUE);
   
    // Main layout
      VBox mainLayout = new VBox(20, lblTitle, checkboxGrid, progressBox, buttonBox);
      mainLayout.setPadding(new Insets(20));
      mainLayout.setAlignment(Pos.TOP_CENTER);
   
    // StackPane for layering
      StackPane layeredPane = new StackPane(imageView3, mainLayout);
   
    // Create new scene
      Scene scene5 = new Scene(layeredPane, 800, 600);
      stage5.setScene(scene5);
      stage5.show();
   }
}//..end class imageView3