package com.elineball.girl.repository;

import com.elineball.girl.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl,Integer> {

    //通过年龄查女生
    public List<Girl> findByAge(Integer age);
}
