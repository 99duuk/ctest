package org.zerock.mallapi.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.mallapi.entity.SampleEntity;
import org.zerock.mallapi.service.SampleService;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @GetMapping
    public SampleEntity getSample() {
        return sampleService.getSampleEntity();
    }
}
