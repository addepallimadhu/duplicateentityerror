package com.example.duplicateentityerror.AppDb;


import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Accessors(chain = true)
@Entity(name = "q_option_mapping")
@IdClass(AnswerMappingKey.class)
public class AnswerMapping {

    @Id
    @Column(name = "q_id")
    private String questionId;
    @Id
    @Column(name = "ans_id")
    private String answerId;
    @Column(name = "risk_level")
    private Integer riskLevel;
    @Column(name = "maximum_risk")
    private Integer maximumRisk;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinTable(name = "q_option_mapping",
            joinColumns =  {@JoinColumn(name = "ans_id"), @JoinColumn(name = "q_id")},
            inverseJoinColumns = @JoinColumn(name = "followup_q_id"))
    private Question followupQuestion;
}
