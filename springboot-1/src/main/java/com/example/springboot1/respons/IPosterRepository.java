package com.example.springboot1.respons;

import com.example.springboot1.entity.Poster;
import com.example.springboot1.entity.Sender;
import org.springframework.stereotype.Repository;

@Repository
public interface IPosterRepository extends IBaseRepository<Poster, Integer>{
}
