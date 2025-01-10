
public class PenDivide {
    public static void main(String[] args) {
	
	int totalPens= 14;
	
	int totalStudent=3;
	
	int penperStudent=totalPens/totalStudent;
	
	int remainingpens= totalPens % totalStudent;
	
        System.out.println(" The Pen Per Student is ___ "+ penperStudent + "\n"+" The remaining pen not distributed is ___" + remainingpens );
    }
}