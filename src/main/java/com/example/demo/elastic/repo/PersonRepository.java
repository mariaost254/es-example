package com.example.demo.elastic.repo;

import com.example.demo.elastic.documents.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<Person, String> {
}
