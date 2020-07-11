package com.example.springboot1.respons;

import com.example.springboot1.entity.Member;
import com.example.springboot1.entity.Sender;
import org.springframework.stereotype.Repository;

@Repository
public interface IMemberRepository extends IBaseRepository<Member, Integer>{
}
