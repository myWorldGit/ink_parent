package com.ink.deidei.model.entity.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
public class User {
    private Long uid;
    private String username;
    private String password;
}
