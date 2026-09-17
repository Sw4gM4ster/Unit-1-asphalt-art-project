public class NeighborhoodRunner {
  public static void main(String[] args) {

  BackgroundPainter sky = new BackgroundPainter (); 
  sky.rightMove();
  sky.continuePainting(); 
      sky.rightMove();
  sky.continuePainting(); 
      sky.rightMove();
  sky.continuePainting(); 
     sky.rightMove();
  sky.continuePainting();  
    sky.rightMove();
  sky.continuePainting(); 
     sky.rightMove();
     sky.lastLine();

    TowerPainter lui = new TowerPainter();
    lui.paintTower();

    SunPainter sunny = new SunPainter();
    sunny.paintSun();


  }
}