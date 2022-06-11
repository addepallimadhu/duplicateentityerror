package com.example.duplicateentityerror.AppDb;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "q_question")
public class Question {

    @Id
    @Column(name = "q_id")
    private String questionId;
    private String description;
    private String info;
    @Column(name = "q_type")
    private String questionType;
    @Column(name = "display_order")
    private Integer displayOrder;
    @Column(name = "hierarchy_level")
    private String hierarchyLevel;

    @OneToMany(fetch = FetchType.EAGER, targetEntity = AnswerMapping.class, mappedBy = "questionId")
    @OrderBy("answerId")
    private List<AnswerMapping> answerOptions;
}
