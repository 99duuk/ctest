package org.zerock.mallapi.service;

import org.springframework.stereotype.Service;
import org.zerock.mallapi.entity.SampleEntity;

@Service
public class SampleService {

    public SampleEntity getSampleEntity() {
        return new SampleEntity(1L, "Sample Name");
    }
}
