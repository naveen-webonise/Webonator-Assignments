import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Admin on 13-02-2015.
 */

public class MyResponse {
    @JsonProperty("success")
    private boolean success;
    @JsonProperty("status")
    private int status;
    @JsonProperty("auth_token")
    private String authToken;
    @JsonProperty("message")
    private String message;


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString(){
        return success+" : "+status+" : "+message;
    }
}
