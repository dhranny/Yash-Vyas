package com.example.Report;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class TwilioCl {
    public static final String ACCOUNT_SID = "AC5d16c9a2a50f57a873963eec84beedb9";
    public static final String AUTH_TOKEN = "457e79de9e534b72efb873b4d80c912e";

    @PostConstruct
    public static void init(){
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    }

    public static void main(String messagep){
        init();
        Message message = Message
                .creator(
                        new PhoneNumber("14313387322"),
                        new PhoneNumber("12164555375"),
                        "This is a test text message for the twilio app"
                )
                .create();

    }
}
