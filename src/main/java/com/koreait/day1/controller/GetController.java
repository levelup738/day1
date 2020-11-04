package com.koreait.day1.controller;

import com.koreait.day1.model.MultiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GetController {
    //localhost:9090/api/getMethod
    @RequestMapping(method= RequestMethod.GET, path="/getMethod")
    public String getRequest(){
        return "getMethod 호출";
    }
    //localhost:9090/api/getParameter?id=apple&pass=1234
    @GetMapping("/getParameter")
    public String getPara(@RequestParam String id, @RequestParam String pass){
        System.out.println("id: "+id+", password: "+pass);
        return "getPara() 호출";
    }

    /*
    * id, name, email, age
    * */
    //localhost:9090/api/getMultiParameter?id=apple&name=김사과&email=apple@apple.com&age=20
    @GetMapping("/getMultiParameter")
//    public String getMultiPara(
//            @RequestParam String id,
//            @RequestParam String name,
//            @RequestParam String email,
//            @RequestParam int age
//    ){
//        System.out.println("id: "+id+", name: "+name+", email: "+email+", age: "+age);
//        return "ok";
//    }
    // 스프링 부트에서는 Json으로 자동으로 출력해줌 프로퍼티이름 맞춰주면 알아서 set해줌
    public MultiParam getMultiPara(MultiParam multiParam){
        System.out.println("id: "+multiParam.getId()+", name: "+multiParam.getName()
                +", email: "+multiParam.getEmail()+", age: "+multiParam.getAge());
        return multiParam;
    }
}
