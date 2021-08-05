package com.example.demo.elastic.search;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.elasticsearch.search.sort.SortOrder;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchRequestDTO  extends PagedRequestDTO{
    private List<String> fields;
    private String searchTerm;
    private String sortBy;
    private SortOrder order;
}
