	import javafx.application.*;
	import javafx.stage.*;
	import javafx.scene.control.*;
	import javafx.scene.*;
	import javafx.scene.layout.*;
	import javafx.scene.control.*;
	import javafx.scene.text.*;
	import javafx.scene.paint.Color;
	import javafx.event.*;
	import javafx.geometry.Pos;
    import java.io.*;
	import java.io.OutputStream;
	import java.nio.file.*;
	import java.util.*;
    import javafx.scene.control.Alert.AlertType;
			
	public class FA21_BSE_054 extends Application
	{
	    Scanner input;	  
	    int[] memory = new int[101];
	    int i = 0;
	    int countNoOfInstructions = 0;
	    int acumulator = 0;
	    int oppcode = 0;
        int operand = 0;
	    Formatter write;
	    String[] Instructions;
	    String path;
	    File file;
	    File files;
	    Text accumulator_Label=new Text("Accumulator");
	    TextField accumulator_Text=new TextField();
	    Text instCounter_Label=new Text("InstCounter");
	    TextField instCounter_Text=new TextField();
	    Text instReg_Label=new Text("InstReg");
	    TextField instReg_Text=new TextField();
	    Text opCode_Label=new Text("OpCode");
	    TextField opCode_Text=new TextField();
	    Text operand_Label=new Text("Operand");
	    TextField operand_Text=new TextField();
	    Label text=new Label();
	  
	  
	  public void start(Stage primaryStage)
	  {
		BorderPane pane=new BorderPane();
		HBox hbTop=new HBox(10);
		HBox hbBottom=new HBox(10);
		TextArea texts;
		text.setAlignment(Pos.BASELINE_CENTER);
	
				

		accumulator_Text.setMaxWidth(50);
		instCounter_Text.setMaxWidth(40);
		instReg_Text.setMaxWidth(50);
		opCode_Text.setMaxWidth(40);
		operand_Text.setMaxWidth(40);
		Label label=new Label();
		
		Button loadButton=new Button("Load");

		FileChooser chose=new FileChooser();
		loadButton.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event)
			{
				file=chose.showOpenDialog(primaryStage);
				path=file.getAbsolutePath();
				Path p=Paths.get(path);
				try
				{
					input=new Scanner(Paths.get(path));
					long total=Files.lines(p).count();
				    Instructions=new String[(int)total];
					while(input.hasNext())
					{
						Instructions[i]=input.nextLine();
						i++;
					}
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			
				try
				{
					write();
					byte[] Bytes=Files.readAllBytes(Paths.get(path));
					String content=new String(Bytes);
					text.setText(content);
				}
				catch(FileNotFoundException exception)
				{
					exception.printStackTrace();
				}
				catch(IOException exception)
				{
					exception.printStackTrace();
				}
			}
		});


		Button executeButton=new Button("Next Inst");
		executeButton.setOnAction(new EventHandler<ActionEvent>()
		{
		   @Override
		   public void handle(ActionEvent event)
		   {
			execute();
		   }
		});
		
		hbBottom.setAlignment(Pos.CENTER);
		
		hbTop.getChildren().addAll(accumulator_Label,accumulator_Text,instCounter_Label,instCounter_Text,instReg_Label,instReg_Text,opCode_Label,opCode_Text,operand_Label,operand_Text,hbBottom);
		hbBottom.getChildren().addAll(loadButton,executeButton);
		
		pane.setTop(hbTop);
		pane.setBottom(hbBottom);
		pane.setCenter(text);
		Scene scene=new Scene(pane,600,300);
		primaryStage.setTitle("Simpletron");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	  
	  }
	    void write()
	  {
	   
	    
	  try
	  {
        files=new File("D:\\Outputs.txt");
        path=files.getAbsolutePath();
        write=new Formatter(files);
	  }
	  catch(FileNotFoundException e)
	  {
		  e.printStackTrace();
	  }
    
           	write.format("\t%d%12d%13d%12d%12d%12d%12d%12d%12d%12d",0,1,2,3,4,5,6,7,8,9);	
		// for loop displays the contents of the memory
			for(int format = 0; format < memory.length-1; format++)
			{
				//if statement displays the left index of memory location (0,10,20,30...)
				if(format%10 == 0)
				{
					write.format("%n");//print new line
					write.format(" %02d",format);// System prompt
				}
				write.format(" %+05d  ",memory[format]);// Display the memory array (0-100)				
			}// end of for loop		
			
		        write.format("\n");
    
                write.close();
  }
  public  void execute()
  {
	  oppcode=Integer.parseInt(Instructions[countNoOfInstructions])/100;
	  operand=Integer.parseInt(Instructions[countNoOfInstructions])%100;
	  
	  accumulator_Text.setText(Integer.toString(acumulator));
	  instCounter_Text.setText(Integer.toString(countNoOfInstructions+1));
	  opCode_Text.setText(Integer.toString(oppcode));
	  operand_Text.setText(Integer.toString(operand));
	  instReg_Text.setText(Instructions[countNoOfInstructions]);
	  
	  
	  switch(oppcode){
			
			case 10:
				TextInputDialog inputNumber=new TextInputDialog();
				inputNumber.setContentText("Input:");
				inputNumber.setHeaderText("INPUT:");
				inputNumber.showAndWait();
				memory[operand]=Integer.parseInt(inputNumber.getEditor().getText());
				countNoOfInstructions++;
				break;
	
			case 11:
	    		Alert output = new Alert(AlertType.NONE);
	            output.setAlertType(AlertType.INFORMATION);
			    output.setHeaderText("Output");
			    output.setContentText("result " + Integer.toString(memory[operand]));
			    output.showAndWait();			
				countNoOfInstructions++;
				break;
			
			case 20:
				countNoOfInstructions++;
				acumulator=memory[operand];
				break;

			case 21:
				memory[operand]=acumulator;
				countNoOfInstructions++;
				break;
			
			case 30:
				countNoOfInstructions++;
				acumulator+=memory[operand];
				break;
			
			case 31:
				acumulator-=memory[operand];
				countNoOfInstructions++;
				break;

			case 32:
				acumulator/=memory[operand];
				countNoOfInstructions++;
				break;
			
			case 33:
				countNoOfInstructions++;
				acumulator*=memory[operand];
				break;

			case 40:
				countNoOfInstructions=operand;
				break;

			case 41:
				if(acumulator<=0)
					countNoOfInstructions=operand;
				break;

			case 42:
				if(acumulator==0)
				countNoOfInstructions=operand;
				break;
			
			case 43:
	    		Alert HaltAlert = new Alert(AlertType.NONE);
		        HaltAlert.setAlertType(AlertType.INFORMATION);
				HaltAlert.setHeaderText("HALT");
				HaltAlert.setContentText("HALT");
				HaltAlert.showAndWait();
				countNoOfInstructions++;
				break;
		    } 
				try
				{
					write();
					byte[] Bytes=Files.readAllBytes(Paths.get(path));
					String content=new String(Bytes);
					text.setText(content);
				}
				catch(FileNotFoundException exception)
				{
					exception.printStackTrace();
				}
				catch(IOException exception)
				{
					exception.printStackTrace();
				}
        }
  }
