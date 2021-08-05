package com.example.demo.elastic.search;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PagedRequestDTO {
    private static final int DEFAULT_SIZE = 100;
    private int page;
    private int size;
}
