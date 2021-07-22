package com.greenmuhly.todo.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
public class Todo {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String content;
    private Boolean checked;
    private LocalDateTime createDate;
    private LocalDateTime uploadDate;

    public Todo(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Builder
    public Todo(Long id, String title, String content, Boolean checked, LocalDateTime createDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.checked = checked;
        this.createDate = createDate;
    }
}
