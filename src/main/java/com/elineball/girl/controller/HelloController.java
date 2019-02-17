package com.elineball.girl.controller;

import com.elineball.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hello",method = RequestMethod.GET)
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @GetMapping(value = "/say/{id}")
    public  String say(@PathVariable("id") Integer myid){
      //  return girlProperties.getCupSize();
        return "id : " + myid;
    }
    @GetMapping(value = "/age")
    public  String age(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        //return girlProperties.getAge();
        return "id : " + id;
    }
}
