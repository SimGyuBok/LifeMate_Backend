package com.chaeum.lifemate.paper.mapper;

import com.chaeum.lifemate.paper.domain.Paper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ApprovalMapper {
    void insertPaper(Paper paper);
}
