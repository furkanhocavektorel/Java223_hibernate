package org.example.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public abstract class BaseEntity {
    String createDate;
    String updateDate;
    int State;
}
