package com.blogrestapijava.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping("/startTask")
    public String startLongRunningTask() {
        // Perform your long-running task here
        // This method will be invoked when you send an HTTP GET request to /startTask
        return "Long-running task started";
    }
}
