package com.ldkspringbase.entity;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class BoardEntity {
    int id;
    String userName;
    String title;
    String content;
    LocalDate nowDay;
    int viewCount;
}
