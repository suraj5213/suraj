package sangu;


public class sangu {
	int id; 
	String name;
	
	sangu(int i,String n){
		
		id=i;
		name=n;
	}
	sangu(sangu e){
		
		id=e.id;
		name=e.name;
	}
	
	void display() {
		
		System.out.println(id+""+name);
	}
	

	public static void main(String[] args) {
		sangu s1=new sangu(100,"hari");
		sangu s2=new sangu(s1);
		s1.display();
		s2.display();
		
	}

}
