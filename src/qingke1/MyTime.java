package qingke1;

import java.text.DecimalFormat;

/**
 * 定义一个时间类（h:m:s）,用方法返回前一秒，后一秒。
 * 
 * @author qingke04
 *
 */
public class MyTime {
	private int hour = 0;
	private int minute = 0;
	private int second = 0;

	public MyTime(int hour, int minute, int second) {
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}

	public MyTime() {

	}

	public void setTime(int hour, int minute, int second) {
		if (minute <= 59 && minute >= 0 && hour <= 23 && hour >= 0 && second <= 59 && second >= 0) {
			this.setHour(hour);
			this.setMinute(minute);
			this.setSecond(second);
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute <= 59 && minute >= 0) {
			this.minute = minute;
		}
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour <= 23 && hour >= 0) {
			this.hour = hour;
		}

	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second <= 59 && second >= 0) {
			this.second = second;
		}
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("##00");
		String h = df.format(hour);
		String m = df.format(minute);
		String s = df.format(second);
		return h + ":" + m + ":" + s;
	}

	public MyTime nextSecond() {
		this.second++;
		if (second == 60) {
			second = 0;
			minute++;
		}
		if (minute == 60) {
			minute = 0;
			hour++;
		}
		if (hour == 24) {
			hour = 0;

		}

		return this;
	}

	public MyTime nextMinute() {
		minute++;
		if (minute == 60) {
			minute = 0;
			hour++;
		}
		if (hour == 24) {
			hour = 0;

		}
		return this;
	}

	public MyTime nextHour() {
		hour++;
		if (hour == 24) {
			hour = 0;
		}
		return this;

	}

	public MyTime previousSecond() {
		second--;
		if (second == -1) {
			second = 59;
			minute--;

		}
		if (minute == -1) {
			minute = 59;
			hour--;
		}
		if (hour == -1) {
			hour = 23;

		}
		return this;
	}

}
