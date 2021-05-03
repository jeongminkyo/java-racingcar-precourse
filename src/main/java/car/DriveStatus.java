package car;

public enum DriveStatus {
	GO,
	STOP;

	public boolean isGo() {
		return this == GO;
	}
}
