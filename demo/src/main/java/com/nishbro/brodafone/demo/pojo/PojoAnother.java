package com.nishbro.brodafone.demo.pojo;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PojoAnother {

    @Email(message="its not a proper email!!!")
    private String email;
}
