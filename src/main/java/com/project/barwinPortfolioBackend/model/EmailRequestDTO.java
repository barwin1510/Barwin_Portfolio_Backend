package com.project.barwinPortfolioBackend.model;

import lombok.Data;

@Data
public class EmailRequestDTO {
    private String name;
    private String email;
    private String subject;
    private String message;
}


