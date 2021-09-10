package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.entity.Phone;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NotEmpty
    //@Size(min=2,max = 100)
    private String firstName;

    //@NotEmpty
    //@Size(min=2,max = 100)
    private String lastName;

    //@NotEmpty
    //@CPF
    private String cpf;

    private LocalDate birthDate;

    //@Valid
    //@NotEmpty
    private List<PhoneDTO> phones;
}
