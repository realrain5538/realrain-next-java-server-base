package com.next.app.api.user.controller;

import com.next.app.api.user.entity.BusinessPerson;
import com.next.app.api.user.service.BusinessPersonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/test")
@Tag(name = "Test Controller", description = "Test API")
@CrossOrigin(origins = "http://localhost")
public class TestController {

    @GetMapping
    @Operation(summary = "test", description = "test")
    public void getAllBusinessPerson() {

    }
}
