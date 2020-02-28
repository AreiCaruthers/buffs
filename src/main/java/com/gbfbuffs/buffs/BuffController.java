package com.gbfbuffs.buffs;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BuffController {

    @GetMapping
    @ResponseBody
    public String HelloBuffs() {
        return "Hello, Buffs";
    }

}
