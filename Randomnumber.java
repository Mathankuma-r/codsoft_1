import java.util.*;
class Randomnumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		playgame(sc);
	}
	private static void playgame(Scanner sc){
		int tot_chances=5;
		Random r=new Random();
		int rand=r.nextInt(100)+1;
		System.out.println("Enter a number between 1 and 100");
		for(int c=0;c<tot_chances;c++){
			System.out.println("You have only "+(tot_chances-c) +" chances left ");
			System.out.printf("Guess "+(c+1)+":");
			int num=sc.nextInt();
			if(num==rand){
				System.out.println("Congratulations:Your guess is correct\nTotal number of guesses:"+(c+1));
				break;
			}
			else if(num>rand){
				if(num-rand<=5){
					System.out.println("You are close but somewhat high");
				}
				else{
					System.out.println("Your guess is too high");
				}
			}
			else if(num<rand){
				if(rand-num<=5){
					System.out.println("You are too close but somewhat low");
				}
				else{
					System.out.println("Your guess is too low");
				}
			}
			if(c==tot_chances-1){
				System.out.println("Game is over!");
				if(retry(sc)){
					c=-1;
					rand=r.nextInt(100)+1;
					System.out.println("Enter a number between 1 and 100");
				}
				else{
					System.out.println("Exit");
					sc.close();
				}
			}
		}
	}
	private static boolean retry(Scanner sc){
		System.out.println("Do you want to retry");
		System.out.println("Yes: Enter 1 \nNo: Enter 0 ");
		System.out.print("Your input:");
		int x=sc.nextInt();
		return x==1;
		
	}
}