enum SingletonWithOutStatic {
    INSTANCE;
    int id;
    String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
	return name;
	}
    public void setName(String name){
	this.name = name;
	}
}

public class TestSingleTone{
	public static void main(String[] args) {
        SingletonWithOutStatic singleton = SingletonWithOutStatic.INSTANCE;
	SingletonWithOutStatic singleton2 = SingletonWithOutStatic.INSTANCE;
        singleton.setId(1);
	singleton.setName("Test");
	singleton2.setId(2);
        System.out.println(singleton.getId());
	System.out.println(singleton.getName());
	// Even if we set the value to two different objects of SingletonWithOutStatic it is refering to single Object 
	System.out.println(singleton2.getId());
	System.out.println(singleton.getId());
    }
}

