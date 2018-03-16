import java.util.*;
class Players{
	String name;
	int age;
	void display(){
		
	}
}
class Cricket_Players extends Players{
	int runs=10000;
	void display(){
		System.out.println(name+age+runs);
	}
}
class Football_Players extends Players{
	int goals=50;
	void display(){
		System.out.println(name+age+goals);
	}
}
class Basketball_Players extends Players{
	int baskets=20;
	void display(){
		System.out.println(name+age+baskets);
	}
}
class PlayersDetails{
	public static void main(String args[]){
		Players b = new Basketball_Players();
		Players f = new Football_Players();
		Players c = new Cricket_Players();
		
		c.name="Virat";
		c.age=30;
		b.name="Jordan";
		b.age=30;
		f.name="Bichang";
		f.age=32;
		
		b.display();
		f.display();
		c.display();
	}
}