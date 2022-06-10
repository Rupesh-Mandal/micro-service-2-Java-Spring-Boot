package com.rupesh_mandal.api_gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiGatewayController {

    @GetMapping("/userServiceFallBackMethod")
    public String userServiceFallBackMethod(){
        return "User service is taking longer than expected Please try again later";
    }

    @GetMapping("/departmentServiceFallBackMethod")
    public String departmentServiceFallBackMethod(){
        return "Department service is taking longer than expected Please try again later";
    }

}
