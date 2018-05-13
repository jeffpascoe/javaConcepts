package interfaces;

public class Sedan implements AutoMobile {
	
	private String engineState = "off";
	private int currentGear = 0;
	private int currentSpeed = 0;

	@Override
	public void startEngine() {
		this.engineState = "on";
	}

	@Override
	public void killEngine() {
		this.engineState = "off";
	}

	@Override
	public void shiftGear(int gear) {
		this.currentGear = gear;
	}

	@Override
	public int increaseSpeed(int speedIncrement) {
		this.currentSpeed += speedIncrement;
		return this.currentSpeed;
	}

	@Override
	public int decreaseSpeed(int speedDecrement) {
		this.currentSpeed -= speedDecrement;
		return this.currentSpeed;
	}

	@Override
	public int getCurrentSpeed() {
		return this.currentSpeed;
	}
}
