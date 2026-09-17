import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus{

  public void rightMove(){
    setPaint(1000);
    while(canMove()){
      paint("SkyBlue");
      move();
    }
    paint("SkyBlue");
    turnRight();
    move();
    turnRight();
  }
  public void continuePainting () {
    while (canMove()){
    paint("SkyBlue"); 
    move(); 
    }
paint("SkyBlue"); 
    turnLeft();
    move();
    turnLeft();
    
  }
  public void lastLine() {
     while (canMove()){
    paint("SkyBlue"); 
    move(); 
    }
paint("SkyBlue"); 
    turnLeft();
  }
}
