package com.example.springboot1.respons;

import com.example.springboot1.entity.Good;
import com.example.springboot1.entity.Sender;
import org.springframework.stereotype.Repository;

@Repository
public interface IGoodRepository extends IBaseRepository<Good, Integer>{
}
