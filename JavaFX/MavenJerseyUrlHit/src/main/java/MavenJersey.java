import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.codehaus.jackson.map.ObjectMapper;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;



public class MavenJersey {
    public static void main(String[] args) {
        Client client = Client.create();
        WebResource webResource = client.resource(URI.create("https://www.datamapper.com/api/v1/accounts/sign_in"));
        HashMap formData = new HashMap();
        formData.put("username","admin");
        formData.put("password","hawk!@#velocity");
        ObjectMapper mapper = new ObjectMapper();
        String jsonObject;
        try {
            jsonObject = mapper.writeValueAsString(formData);



            ClientResponse response = webResource.header("auth_token", null)
                    .type(MediaType.APPLICATION_FORM_URLENCODED)
                    .accept(MediaType.APPLICATION_JSON)
                    .post(ClientResponse.class, jsonObject.toString());
            String jsonData = response.getEntity(String.class);
            MyResponse myResponse = mapper.readValue(jsonData,MyResponse.class);
            System.out.println("MyResponse class contents: "+myResponse);

        int status = response.getStatus();

        Response.StatusType msg = response.getStatusInfo();
        System.out.println(status);
        System.out.println(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
