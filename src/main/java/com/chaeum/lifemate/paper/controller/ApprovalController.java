package com.chaeum.lifemate.paper.controller;

import com.chaeum.lifemate.common.responsedto.CommonSuccessResponseDto;
import com.chaeum.lifemate.paper.domain.Paper;
import com.chaeum.lifemate.paper.service.ApprovalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/paper")
public class ApprovalController {

    @Autowired
    ApprovalService approvalService;
    @RequestMapping(value="/approval", method = {RequestMethod.POST})
    public ResponseEntity<?> createPaper(HttpServletRequest request, @RequestBody Paper paper) {
        approvalService.createPaper(paper);
        return ResponseEntity.status(200).body(new CommonSuccessResponseDto("200", "결재 상신", "success"));
    }
}
