package Basic;

public class Notcounter {
	public static void main(String[] args) {
		int monny = 6960;
		int[] notes = {500, 200, 100, 50, 10};
		for (int note : notes) {
			int count = monny / note ;
			System.out.println(note + " = " + count);
			monny = monny % note;
		}
	}

}
