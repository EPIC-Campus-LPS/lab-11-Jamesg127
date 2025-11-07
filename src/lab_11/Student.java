package lab_11;

public class Student {
	private String smath;
	private String sscience;
	private String shistory;
	private String senglish;
	private String scomputerScience;
	private int msum = 0;
	private int ssum = 0;
	private int hsum = 0;
	private int esum = 0;
	private int cssum = 0;
	private double maverage;
	private double saverage;
	private double haverage;
	private double eaverage;
	private double csaverage;
	private String[] marr;
	private String[] sarr;
	private String[] harr;
	private String[] earr;
	private String[] csarr;
	private int math;
	private int science;
	private int history;
	private int english;
	private int computerScience;
	public Student(String m, String s, String h, String e, String cs) {
		smath = m;
		sscience = s;
		shistory = h;
		senglish = e;
		scomputerScience = cs;
	}
	public void average() {
		marr = smath.split(" ");
		sarr = sscience.split(" ");
		harr = shistory.split(" ");
		earr = senglish.split(" ");
		csarr = scomputerScience.split(" ");
		math = Integer.parseInt(marr[1]);
		science = Integer.parseInt(sarr[1]);
		history = Integer.parseInt(harr[1]);
		english = Integer.parseInt(earr[1]);
		computerScience = Integer.parseInt(csarr[2]);
	}
	
	public int getMath() {
		return math;
	}
	public int getScience() {
		return science;
	}
	public int getHistory() {
		return history;
	}
	public int getEnglish() {
		return english;
	}
	public int getComputerScience() {
		return computerScience;
	}
	
	
	
	
}
