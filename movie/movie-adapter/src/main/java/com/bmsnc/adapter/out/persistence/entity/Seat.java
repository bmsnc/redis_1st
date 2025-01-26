package com.bmsnc.adapter.out.persistence.entity;

import com.bmsnc.adapter.out.BaseEntity;
import com.bmsnc.adapter.out.persistence.entity.Schedule;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Seat extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seatInfoId;

    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;
    private String seatPosition;
}
