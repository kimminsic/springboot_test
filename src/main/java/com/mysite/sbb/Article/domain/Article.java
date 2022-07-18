package com.mysite.sbb.Article.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String subject;

    @Column(columnDefinition = "TYPE")
    private String content;

    private LocalDateTime create_date;

    private Integer view;

    @ManyToOne()
    private String ReplyList;
}
