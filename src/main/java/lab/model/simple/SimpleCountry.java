package lab.model.simple;

import lab.model.Country;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component("country")
@Value
@EqualsAndHashCode(exclude = "id")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SimpleCountry implements Country, Serializable {
	private long id;
    private String name;
    private String codeName;
}