package hui;
import java.util.Scanner;
import java.util.Random;
import java.security.SecureRandom;
public class mainProgram {

	
	private enum Status{CLOSE, OPEN, WON};
	private Status _status;
	
	public Status getStatus() {
		return this._status;
	}
	
	public void setStatus(Status status) {
		this._status = status;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Program prog = new Program("0001" ,"EULA");
		print("Program is ruuning with name: " + prog.getName() + "\n" + "Account ID: " + prog.getAccountNumber() );
		//print("name for " + prog.getName() + ": ");
		// String name = input.nextLine();
		
		// prog.setName(name);
		//prog.print();
		//prog.print();
		double bal = 0;
		//input.nextDouble();
		input.close();
		double deposit = 12;
		double res = (deposit > 0) ? bal+= deposit : 0;
		print("\n"+res);
		
		int min = 1, max = 4;
		Random rand = new Random();
		int count = 1;
		
		
		print("\n" + "========================="+ "\n");

		Status gameStat;
		if(deposit == 12) {
			gameStat = Status.OPEN;
			print(gameStat);
			
			print("\n" + "========================="+ "\n");
			}
		
		print("NEWLINE");
				
		while(true) {
			int rand_int1 = rand.nextInt((max - min) + 1) + min;
			print("\ncount" + count + ": " + rand_int1 + "\n");
			count++;
			if(rand_int1 == 4) break;
		}
		
		
		if(true) {
			switch(rand.nextInt(((4 - 1) + 1) + 1)){
			
			case 0: print("Very GOOD");
			break;
		
			case 1: print("ONE");
			break;
		
			case 2: print("TWO");
			break;
		
			case 3: print("THREE");
			break;
		
			case 4: print("FOUR");
			break;
			default: print("NONE");
			}
		
		}
		print("\n");
		long data = 100000l;
		int test;
		test = (int) data;
		
		print(rollDice(2, 6, 2));
		
		String[] questions = new String[] {
				"What is? ",
				"What now? ",
				"What was?",
				"When was? ",
				"Who?"
		};
		
		String[] answers = new String[] {
				"a", "B", "c", "D", "e"
		};
		
		String userAnswer="A";
		int qIndex = 0;
		String correctAns = answers[qIndex];
		
		if(checkAnswer(correctAns, userAnswer)) print(praise()); 
		}
	
		public static boolean checkAnswer(String ans, String userAns) {
			return userAns.equalsIgnoreCase(ans);
		}
		public static int rollDice(int numDice, int numSides, int numRoll) {
			
			SecureRandom rand = new SecureRandom();
			StringBuilder sb = new StringBuilder();
			int result = 0;
			int[] dice = new int[numDice];
			for(int p=0; p<numRoll; p++) {
				sb.setLength(0);
				
				for(int k=0; k<numDice; k++) {
					
					dice[k] = rand.nextInt(numSides)+1;
					print(k);
					sb.append("die[").append(k).append("]: ").append(dice[k]).append("\n");
					result += dice[k];
				}
				print(sb);
				
			}
			
			return result;
		}
		
		public static String praise() {
			StringBuilder sb = new StringBuilder();
			SecureRandom rand = new SecureRandom();
			
			
			switch(rand.nextInt(5)) {
			
				case 0: sb.append("OK WOW");
				break;
					
				case 1: sb.append("Excelsior");
					break;
				case 2: sb.append("NICE");
				break;
				
				case 3: sb.append("EXcellente"); 
				break;
				
				case 4: sb.append("Good Job");
				break;
				
			}
			
			return sb.toString();
		}
	
	static void print(Object obj) {
		System.out.print(obj);
	}
	
}
