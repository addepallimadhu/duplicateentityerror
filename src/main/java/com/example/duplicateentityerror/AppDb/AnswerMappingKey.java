package com.example.duplicateentityerror.AppDb;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import java.io.Serializable;

@Data
@EqualsAndHashCode
public class AnswerMappingKey implements Serializable {

    @Column(name = "q_id")
    private String questionId;
    @Column(name = "ans_id")
    private String answerId;
}