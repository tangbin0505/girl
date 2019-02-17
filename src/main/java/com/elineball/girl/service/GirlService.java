package com.elineball.girl.service;

import com.elineball.girl.repository.GirlRepository;
import com.elineball.girl.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){

        Girl girlA=new Girl();
        girlA.setAge(17);
        girlA.setCupSize("AA");
        girlRepository.save(girlA);

        Girl girlB=new Girl();
        girlB.setAge(17);
        girlB.setCupSize("BBBBBBbbbbbbbb");
        girlRepository.save(girlB);
    }
}
