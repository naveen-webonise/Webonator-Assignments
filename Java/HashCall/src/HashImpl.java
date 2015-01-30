import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;

interface Voice{
	void speak();
}

public class HashImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map methodCall = new HashMap();
		methodCall.put("human", new Voice(){
			public void speak(){
				System.out.println("hello");
			}
		});
		 
		methodCall.put("animal", new Voice(){
			public void speak(){
				System.out.println("arrrrggghhhh");
			}
		});
		String comm = "animal";
		((Voice) methodCall.get(comm)).speak();

	}

}
