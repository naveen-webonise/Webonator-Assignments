import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class JacksonExample {
    public static void main(String[] args) {

        User user = new User();
       ObjectMapper mapper = new ObjectMapper();

        try {

            // convert user object to json string, and save to a file
            mapper.writeValue(new File("D:\\out.json"), user);



        } catch (JsonMappingException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}