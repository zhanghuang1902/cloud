package com.zh.eurekaprovider.controller;

import org.springframework.web.bind.annotation.*;

/**
 * ClassName:ProviderController
 * Package:com.zh.eurekaprovider.controller
 * Description:
 *
 * @date:2021/2/25 17:54
 * @author:zh
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @GetMapping("/ask")
    public String ask(){
        return "ok,被你访问到了,我是provider";
    }
}
