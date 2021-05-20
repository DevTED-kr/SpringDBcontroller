package com.nouvolution.dao;

import java.util.List;

import com.nouvolution.dto.MemberVO;
 
public interface MemberDAO {
    
    public List<MemberVO> selectMember() throws Exception;
    
    //Login
    public MemberVO login(MemberVO vo) throws Exception;
}
