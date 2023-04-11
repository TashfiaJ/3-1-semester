public class FacadeGame {
    public GameEngine CarGameEngine, BikeGameEngine;
    public GameJump CarGameJump, BikeGameJump;

    public FacadeGame(){
        CarGameEngine = new CarGameEngine();
        BikeGameEngine = new BikeGameEngine();
        CarGameJump = new CarGameJump();
        BikeGameJump = new BikeGameJump();
    }

    public void carGame(){
        CarGameEngine.start();
        CarGameJump.jump();
    }

    public void bikeGame(){
       BikeGameEngine.start();
       BikeGameJump.jump();
    }
}
