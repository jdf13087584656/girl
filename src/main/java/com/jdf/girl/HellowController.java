package com.jdf.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class HellowController {

    @Autowired
    private GrirlProperties grirlProperties;
    @RequestMapping(value = {"hi"},method = RequestMethod.GET)
    public  String say(@RequestParam(value = "id",required = false,defaultValue = "333") int id){
//        return grirlProperties.getCupSize();
    return "id="+id;
    }
}
