package com.destinyhospicecare.spring5webapp.repositories;

import com.destinyhospicecare.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
    
}
