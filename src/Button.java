import java.util.ArrayList;

public class Button {
	ArrayList<Integer> al1;
	ArrayList<Integer> al2;
	ArrayList<Integer> al3;
	
	Button() {
		al1 = new ArrayList<Integer>();
		al2 = new ArrayList<Integer>();
		al3 = new ArrayList<Integer>();
		
		for(int i=1;i<=5;i++){
			al1.add(i);
		}
	}	
}
