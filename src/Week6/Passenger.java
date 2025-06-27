package Week6;

import java.time.LocalDateTime;
enum Berth{
	UPPER,
	MIDDLE,
	LOWER
}
public class Passenger {
private int pid;
private String passengerName;
private Berth PrefBerth;
private Berth AllocatedBerth;
private LocalDateTime bkdDt;
private int bkdwlLimit;
private int currentwlLimit;
public int getCurrentwlLimit() {
	return currentwlLimit;
}
public void setCurrentwlLimit(int currentwlLimit) {
	this.currentwlLimit = currentwlLimit;
}
public int getBkdwlLimit() {
	return bkdwlLimit;
}  
public void setBkdwlLimit(int bkdwlLimit) {
	this.bkdwlLimit = bkdwlLimit;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPassengerName() {
	return passengerName;
}
public void setPassengerName(String passengerName) {
	this.passengerName = passengerName;
}
public Berth getPrefBerth() {
	return PrefBerth;
}
public void setPrefBerth(Berth prefBerth) {
	PrefBerth = prefBerth;
}
public Berth getAllocatedBerth() {
	return AllocatedBerth;
}
public void setAllocatedBerth(Berth allocatedBerth) {
	AllocatedBerth = allocatedBerth;
}
public LocalDateTime getBkdDt() {
	return bkdDt;
}
public void setBkdDt(LocalDateTime bkdDt) {
	this.bkdDt = bkdDt;
}
@Override
public String toString() {
	return "Passenger [pid=" + pid + ", passengerName=" + passengerName + ", PrefBerth=" + PrefBerth
			+ ", AllocatedBerth=" + AllocatedBerth + ", bkdDt=" + bkdDt + ", bkdwlLimit=" + bkdwlLimit
			+ ", currentwlLimit=" + currentwlLimit + "]";
}
}
