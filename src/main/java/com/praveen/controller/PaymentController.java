package com.praveen.controller;

import com.praveen.model.Card;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @PostMapping("process")
    public ResponseEntity<String> process(@Valid @RequestBody Card card)
    {
        return ResponseEntity.ok("payment successful.....");
    }


}
