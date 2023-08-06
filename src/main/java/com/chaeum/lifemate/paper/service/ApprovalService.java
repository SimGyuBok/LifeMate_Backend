package com.chaeum.lifemate.paper.service;

import com.chaeum.lifemate.paper.domain.Paper;
import com.chaeum.lifemate.paper.mapper.ApprovalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApprovalService {

    @Autowired
    ApprovalMapper approvalMapper;

    public void createPaper(Paper paper){
        approvalMapper.insertPaper(paper);
    }
}
