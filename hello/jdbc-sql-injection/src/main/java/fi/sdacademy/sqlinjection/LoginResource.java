package fi.sdacademy.sqlinjection;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;

@JsonDeserialize
@Value
@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "email", "password"
})
public class LoginResource {

    LoginResource( final String email, final String password ) {
        this.email = email;
        this.password = password;
    }

    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;
}
/*

{  "LoginResource":{
        "email":"setemail@mail.com",
        "password":"passw0rd"
        } }
*/

/*
public class LoginResource
{
    private String email;

    private String password;

    public void setEmal(String emal){
        this.emal = emal;
    }
    public String getEmal(){
        return this.emal;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }
}

*/

