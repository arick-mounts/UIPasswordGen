import java.util.Random;
import java.lang.StringBuffer;
import javafx.event.EventHandler;
import javafx.concurrent.WorkerStateEvent;

public class Generator{
	private int length = 8;
	private boolean caps = false;
	private boolean spec = false;
	private boolean num = false;
	private String result;

	public void print(){
		System.out.println("Length: " + length +"\nCaps: " +caps +"\nSpecial: " + spec + "\nNumbers: "+ num);
	}

	public void flipCaps (){
		if (caps == true){
			caps = false;
		}else {
			caps =true;
		}
	}
	public void flipSpec(){
		if(spec == true){
			spec = false;
		}else{
			spec = true;
		}
	}
	public void flipNum(){
		if(num == true){
			num = false;
		}else{
			num = true;
		}
	}

	public String generate() {
		Random r = new Random();

    	StringBuffer alphabet = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
    	StringBuffer pass = new StringBuffer();
		if(caps == true){
			alphabet.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		}
		if(spec == true){
			alphabet.append("!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~");
		}
		if(num == true){
			alphabet.append("0123456789");
		}
    	for (int i = 0; i < length; i++) {
        	pass.append(alphabet.charAt(r.nextInt(alphabet.length())));
   		 }
   		 
   		 return pass.toString();

   		

	}
	public String getPass(){
		
		return result;
	} 

	public void setLength(int i){
		length = i;
	}

	public boolean getCaps(){
		return caps;
	}
	public boolean getSpec(){
		return spec;
	}
	public boolean getNum(){
		return num;
	}
	public int getLength(){
		return length;
	}
}