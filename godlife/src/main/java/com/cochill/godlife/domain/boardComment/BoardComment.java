package com.cochill.godlife.domain.boardComment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class BoardComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long board_comment_no;
    @ManyToOne
    private Long board_no;
    @ManyToOne
    private Long user_no;
    private String content;
    private LocalDateTime created_at;
    private LocalDateTime last_updated_at;



}
