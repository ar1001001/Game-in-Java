import java.util.Random;
import java.util.Scanner;
public class DestroyTheMonster {
	public static void main(String args[]){
		Random rand = new Random();
		int monsterRoom = 3;
		int userRoom = rand.nextInt(4);
		int gunRoom = rand.nextInt(4);
		boolean userIsArmed = false;
		int countdown = 5;
		System.out.println("You are standing in an abandoned building.");
		System.out.println("You have " + countdown + " minutes before monster wakes up...");
		if(countdown==0){
			System.out.println("“OH MY GOD THE MONSTER! IT GOT YOU!!!!");
			System.out.println("Game over.");
			System.exit(0);
		}
		if(userRoom==monsterRoom){
			System.out.println("There is the monster! It's starting to wake up!");
		}
		if(userIsArmed==true && userRoom==gunRoom){
			System.out.println("There is a gun in front of you.");
		}
		System.out.println("Here are your available actions. Type one of the following:");
		System.out.println("Move left or right? (l or r)");
		if(userIsArmed==true){
			System.out.println("Fire weapon? (f)");
		}
		if(userIsArmed==false && userRoom==gunRoom){
			System.out.println("Pick up the gun? (p)");
		}
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		if(in.equals("r")){
			userRoom += 1;
			if(userRoom==3){
				userRoom = 0;
			}
			System.out.println("You moved right.");
		}
		else if(in.equals("l")){
			userRoom -= 1;
			if(userRoom==0){
				userRoom = 3;
			}
			System.out.println("You moved left.");
		}
		else if(in.equals("p") && userIsArmed==false && userRoom==gunRoom){
			userIsArmed = true;
			System.out.println("You picked up the gun.");
		}
		else if(in.equals("f") && userIsArmed==true){
			System.out.println("You fired the gun!");
			if(userRoom==monsterRoom){
				System.out.println("YOU GOT HIM! YOU KILLED THE MONSTER!\nCongratulations! You have won the game!");
				System.exit(0);
			}
			else{
				System.out.println("You fired in the wrong room!\nOh god, the monster is waking up...");
			}
		}
		else{
			System.out.println("I don't understand.\nOh god, the monster is getting closer...");
		}
		countdown -= 1;
		
		System.out.println("You are standing in an abandoned building.");
		System.out.println("You have " + countdown + " minutes before monster wakes up...");
		if(countdown==0){
			System.out.println("“OH MY GOD THE MONSTER! IT GOT YOU!!!!");
			System.out.println("Game over.");
			System.exit(0);
		}
		if(userRoom==monsterRoom){
			System.out.println("There is the monster! It's starting to wake up!");
		}
		if(userIsArmed==true && userRoom==gunRoom){
			System.out.println("There is a gun in front of you.");
		}
		System.out.println("Here are your available actions. Type one of the following:");
		System.out.println("Move left or right? (l or r)");
		if(userIsArmed==true){
			System.out.println("Fire weapon? (f)");
		}
		if(userIsArmed==false && userRoom==gunRoom){
			System.out.println("Pick up the gun? (p)");
		}
		String in2 = scan.nextLine();
		if(in2.equals("r")){
			userRoom += 1;
			if(userRoom==3){
				userRoom = 0;
			}
			System.out.println("You moved right.");
		}
		else if(in2.equals("l")){
			userRoom -= 1;
			if(userRoom==0){
				userRoom = 3;
			}
			System.out.println("You moved left.");
		}
		else if(in2.equals("p") && userIsArmed==false && userRoom==gunRoom){
			userIsArmed = true;
			System.out.println("You picked up the gun.");
		}
		else if(in2.equals("f") && userIsArmed==true){
			System.out.println("You fired the gun!");
			if(userRoom==monsterRoom){
				System.out.println("YOU GOT HIM! YOU KILLED THE MONSTER!\nCongratulations! You have won the game!");
				System.exit(0);
			}
			else{
				System.out.println("You fired in the wrong room!\nOh god, the monster is waking up...");
			}
		}
		else{
			System.out.println("I don't understand.\nOh god, the monster is getting closer...");
		}
		countdown -= 1;
		
		System.out.println("You are standing in an abandoned building.");
		System.out.println("You have " + countdown + " minutes before monster wakes up...");
		if(countdown==0){
			System.out.println("“OH MY GOD THE MONSTER! IT GOT YOU!!!!");
			System.out.println("Game over.");
			System.exit(0);
		}
		if(userRoom==monsterRoom){
			System.out.println("There is the monster! It's starting to wake up!");
		}
		if(userIsArmed==true && userRoom==gunRoom){
			System.out.println("There is a gun in front of you.");
		}
		System.out.println("Here are your available actions. Type one of the following:");
		System.out.println("Move left or right? (l or r)");
		if(userIsArmed==true){
			System.out.println("Fire weapon? (f)");
		}
		if(userIsArmed==false && userRoom==gunRoom){
			System.out.println("Pick up the gun? (p)");
		}
		String in3 = scan.nextLine();
		if(in.equals("r")){
			userRoom += 1;
			if(userRoom==3){
				userRoom = 0;
			}
			System.out.println("You moved right.");
		}
		else if(in3.equals("l")){
			userRoom -= 1;
			if(userRoom==0){
				userRoom = 3;
			}
			System.out.println("You moved left.");
		}
		else if(in3.equals("p") && userIsArmed==false && userRoom==gunRoom){
			userIsArmed = true;
			System.out.println("You picked up the gun.");
		}
		else if(in3.equals("f") && userIsArmed==true){
			System.out.println("You fired the gun!");
			if(userRoom==monsterRoom){
				System.out.println("YOU GOT HIM! YOU KILLED THE MONSTER!\nCongratulations! You have won the game!");
				System.exit(0);
			}
			else{
				System.out.println("You fired in the wrong room!\nOh god, the monster is waking up...");
			}
		}
		else{
			System.out.println("I don't understand.\nOh god, the monster is getting closer...");
		}
		countdown -= 1;
		
		System.out.println("You are standing in an abandoned building.");
		System.out.println("You have " + countdown + " minutes before monster wakes up...");
		if(countdown==0){
			System.out.println("“OH MY GOD THE MONSTER! IT GOT YOU!!!!");
			System.out.println("Game over.");
			System.exit(0);
		}
		if(userRoom==monsterRoom){
			System.out.println("There is the monster! It's starting to wake up!");
		}
		if(userIsArmed==true && userRoom==gunRoom){
			System.out.println("There is a gun in front of you.");
		}
		System.out.println("Here are your available actions. Type one of the following:");
		System.out.println("Move left or right? (l or r)");
		if(userIsArmed==true){
			System.out.println("Fire weapon? (f)");
		}
		if(userIsArmed==false && userRoom==gunRoom){
			System.out.println("Pick up the gun? (p)");
		}
		String in4 = scan.nextLine();
		if(in4.equals("r")){
			userRoom += 1;
			if(userRoom==3){
				userRoom = 0;
			}
			System.out.println("You moved right.");
		}
		else if(in4.equals("l")){
			userRoom -= 1;
			if(userRoom==0){
				userRoom = 3;
			}
			System.out.println("You moved left.");
		}
		else if(in4.equals("p") && userIsArmed==false && userRoom==gunRoom){
			userIsArmed = true;
			System.out.println("You picked up the gun.");
		}
		else if(in4.equals("f") && userIsArmed==true){
			System.out.println("You fired the gun!");
			if(userRoom==monsterRoom){
				System.out.println("YOU GOT HIM! YOU KILLED THE MONSTER!\nCongratulations! You have won the game!");
				System.exit(0);
			}
			else{
				System.out.println("You fired in the wrong room!\nOh god, the monster is waking up...");
			}
		}
		else{
			System.out.println("I don't understand.\nOh god, the monster is getting closer...");
		}
		countdown -= 1;
		
		System.out.println("You are standing in an abandoned building.");
		System.out.println("You have " + countdown + " minutes before monster wakes up...");
		if(countdown==0){
			System.out.println("“OH MY GOD THE MONSTER! IT GOT YOU!!!!");
			System.out.println("Game over.");
			System.exit(0);
		}
		if(userRoom==monsterRoom){
			System.out.println("There is the monster! It's starting to wake up!");
		}
		if(userIsArmed==true && userRoom==gunRoom){
			System.out.println("There is a gun in front of you.");
		}
		System.out.println("Here are your available actions. Type one of the following:");
		System.out.println("Move left or right? (l or r)");
		if(userIsArmed==true){
			System.out.println("Fire weapon? (f)");
		}
		if(userIsArmed==false && userRoom==gunRoom){
			System.out.println("Pick up the gun? (p)");
		}
		String in5 = scan.nextLine();
		if(in5.equals("r")){
			userRoom += 1;
			if(userRoom==3){
				userRoom = 0;
			}
			System.out.println("You moved right.");
		}
		else if(in5.equals("l")){
			userRoom -= 1;
			if(userRoom==0){
				userRoom = 3;
			}
			System.out.println("You moved left.");
		}
		else if(in.equals("p") && userIsArmed==false && userRoom==gunRoom){
			userIsArmed = true;
			System.out.println("You picked up the gun.");
		}
		else if(in.equals("f") && userIsArmed==true){
			System.out.println("You fired the gun!");
			if(userRoom==monsterRoom){
				System.out.println("YOU GOT HIM! YOU KILLED THE MONSTER!\nCongratulations! You have won the game!");
				System.exit(0);
			}
			else{
				System.out.println("You fired in the wrong room!\nOh god, the monster is waking up...");
			}
		}
		else{
			System.out.println("I don't understand.\nOh god, the monster is getting closer...");
		}
		countdown -= 1;
		
		System.out.println("You are standing in an abandoned building.");
		System.out.println("You have " + countdown + " minutes before monster wakes up...");
		if(countdown==0){
			System.out.println("“OH MY GOD THE MONSTER! IT GOT YOU!!!!");
			System.out.println("Game over.");
			System.exit(0);
		}
		if(userRoom==monsterRoom){
			System.out.println("There is the monster! It's starting to wake up!");
		}
		if(userIsArmed==true && userRoom==gunRoom){
			System.out.println("There is a gun in front of you.");
		}
		System.out.println("Here are your available actions. Type one of the following:");
		System.out.println("Move left or right? (l or r)");
		if(userIsArmed==true){
			System.out.println("Fire weapon? (f)");
		}
		if(userIsArmed==false && userRoom==gunRoom){
			System.out.println("Pick up the gun? (p)");
		}

	}
}
