package com.example.its.domain.issue;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IssueRepository {

    @Select("Select * from issues")
    List<IssueEntity> findAll();

    @Insert("Insert into issues (summary, description) values (#{summary}, #{description})")
    void insert(String summary, String description);

    @Select("Select * from issues where id = #{issueId}")
    IssueEntity find(long issueId);
}
