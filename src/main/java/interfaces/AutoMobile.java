package interfaces;

public interface AutoMobile {

	void startEngine();
	
	void killEngine();
	
	void shiftGear(int gear);
	
	int increaseSpeed(int speedIncrement);
	
	int decreaseSpeed(int speedDecrement);
	
	int getCurrentSpeed();
}
