public class Time {
private int hour;
private int minute;
private int second;
public Time(int hour, int minute, int second){
	this.hour=hour;
	this.minute=minute;
	this.second=second;
}
public int getHour(){
	return hour;
}
public int getMinute(){
	return minute;
}
public int getSecond(){
	return second;
}
public void setHour(int hour){
	this.hour=hour;
}
public void setMinute(int minute){
	this.minute=minute;
}
public void setSecond(int second){
	this.second=second;
}
public void setTime(int hour, int minute, int second){
	Time time=new Time(hour,minute,second);
}
public String toString(){
return hour+":"+minute+":"+second;
}

public Time previousSecond(){
int previoussecond;
	if(second==00){
 previoussecond=59;
}
else{
	previoussecond=second-1;
}
	Time watch= new Time(hour,minute,previoussecond);
return watch;	
}
public Time nextSecond(){
	int nextsecond;
if(minute!=59){
	if(second!=59){
	nextsecond=second+1;
	Time newtime= new Time(hour,minute,nextsecond);
	return newtime;
	}
	else if(second==59){
		minute=minute+1;
		nextsecond=00;
		Time newtime= new Time(hour,minute,nextsecond);
		return newtime;
	}
}
else if(minute==59){
	hour=hour+1;
	minute=00;
	nextsecond=00;
	Time newtime= new Time(hour,minute,nextsecond);
	return newtime;
}
return null;

}
}
