import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class FindFileInDir{
     
    public void findFile(String name,File file)
    {
       File[] list = file.listFiles();
	
    	if(list!=null)
    	for (File fil : list)
    	{
        
        if (fil.isDirectory())
        {
            findFile(name,fil);
        }
        else if (fil.getName().contains(name))
        {
        	System.out.println(fil.getName());
        }
    }
    }
     
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
	FindFileInDir fd = new FindFileInDir();
	while(true){
		String entrptn= sc.nextLine();
		if(entrptn!=null &&!entrptn.equals("")){
			if(entrptn.equals("q") ||entrptn.equals("r")){
				System.exit(0);
			}
			else{
				String directory = System.getProperty("user.dir");
				fd.findFile(entrptn,new File(directory));
			}
		}	
	}
	}
}






