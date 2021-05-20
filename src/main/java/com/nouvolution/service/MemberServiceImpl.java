package com.nouvolution.service;

import java.util.List;

import javax.inject.Inject;
 
import org.springframework.stereotype.Service;
 
import com.nouvolution.dao.MemberDAO;
import com.nouvolution.dto.MemberVO;
 
@Service
public class MemberServiceImpl implements MemberService {
 
    @Inject
    private MemberDAO dao;
    
    @Override
    public List<MemberVO> selectMember() throws Exception {
 
        return dao.selectMember();
    }

	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dao.login(vo);
	}
 
}

