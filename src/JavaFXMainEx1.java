
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFXMainEx1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Color azul = Color.rgb(102, 204, 255);
        Color roxo = Color.rgb(153, 102, 255);
        Color vermelho = Color.rgb(153, 0, 0);
        //remove code from here 
	Button btn = new Button();
        btn.setText("Say 'HelloWorld'");
        btn.setOnAction(new EventHandler<ActionEvent>() 
	{
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        Stop[] stops = new Stop[]
        {
            new Stop(0, roxo),
            new Stop(1, vermelho)
        };
        LinearGradient grad = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops); //degrade de roxo para vermelho  
        
        Rectangle rect = new Rectangle(125, 100, 50, 50); //criacao de um retangulo
        rect.setFill(grad);
        rect.setStroke(vermelho);
        rect.setStrokeWidth(4);
        
        Polygon poli = new Polygon(50, 100, 0, 50, 0, 100, 3);//criacao de um triangulo
       
        poli.setFill(grad);
        
        
        Group root = new Group();
       root.getChildren().addAll(rect,poli);
        
        Scene scene = new Scene(root, 300, 250, azul);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
		//to here to add your own code
    }

    public static void main(String[] args) {
        launch(args);
    }
}
