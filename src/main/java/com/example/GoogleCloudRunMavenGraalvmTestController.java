package com.example;

import io.micronaut.http.annotation.*;

@Controller("/googleCloudRunMavenGraalvmTest")
public class GoogleCloudRunMavenGraalvmTestController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}