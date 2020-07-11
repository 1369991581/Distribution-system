package com.example.springboot1.respons;

import com.example.springboot1.entity.Sender;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ISenderRepository extends IBaseRepository<Sender, Integer>{
}
