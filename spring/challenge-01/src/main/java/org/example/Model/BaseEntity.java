package org.example.Model;

import lombok.Getter;
import lombok.Setter;

public sealed class BaseEntity permits Employee {


    private static long count = 0;
    @Getter
    @Setter
    private long Id;

    public BaseEntity() {
        Id = count;
        count++;
    }
}
