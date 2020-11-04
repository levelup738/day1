package com.koreait.day1.controller;

import com.koreait.day1.model.MultiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {
    // post는 insert할때 put, petch는 update할때 많이씀
    //localhost:9090/api/postMethod
    @PostMapping(value = "/postMethod")
    public MultiParam postMethod(@RequestBody MultiParam multiParam){
        return multiParam;
    }
    @PutMapping("/putMethod")
    public void put(){
        System.out.println("putMethod 호출");
    }
    @PatchMapping("/patchMethod")
    public void patch(){
        System.out.println("patchMethod 호출");
    }
    @DeleteMapping("/deleteMethod")
    public void delete(){
        System.out.println("deleteMethod 호출");
    }
}
