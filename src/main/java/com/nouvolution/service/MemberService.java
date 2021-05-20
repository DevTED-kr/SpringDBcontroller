package com.nouvolution.service;

import java.util.List;

import com.nouvolution.dto.MemberVO;
 
public interface MemberService {
    
    public List<MemberVO> selectMember() throws Exception;
    
    public MemberVO login(MemberVO vo) throws Exception;
}