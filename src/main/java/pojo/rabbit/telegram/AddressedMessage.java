package pojo.rabbit.telegram;

import com.google.gson.Gson;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressedMessage {
    private String to;
    private String body;

    public static String serialize(AddressedMessage addressedMessage) {
        return new Gson().toJson(addressedMessage);
    }

    public static AddressedMessage deserialize(String addressedMessage) {
        return new Gson().fromJson(addressedMessage, AddressedMessage.class);
    }
}
