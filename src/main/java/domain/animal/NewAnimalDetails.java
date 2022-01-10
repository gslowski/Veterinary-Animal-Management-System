package domain.animal;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Value
@Getter
@Builder
public class NewAnimalDetails {
	String tattoo;
	String RFID;
    String DOB;	
}
