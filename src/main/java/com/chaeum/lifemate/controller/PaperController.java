package com.chaeum.lifemate.controller;

import com.chaeum.lifemate.service.PaperService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paper")
public class PaperController {
    private final PaperService paperService;

    public PaperController(PaperService paperService) {
        this.paperService = paperService;
    }

    @GetMapping("/approval")
    ResponseEntity<?> getPaperApproval(@RequestParam(required = false) String name) {
        return new ResponseEntity<>(paperService.myName(name), HttpStatus.OK);
    }
}
