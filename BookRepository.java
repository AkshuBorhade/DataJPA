package com.akshay.repo;

import org.springframework.data.repository.CrudRepository;

import com.akshay.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
