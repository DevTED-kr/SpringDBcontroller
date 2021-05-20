package com.nouvolution.dao;
import java.util.List;
 
import javax.inject.Inject;
 
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
 
import com.nouvolution.dto.MemberVO;
 
@Repository
public class MemberDAOImpl implements MemberDAO {
 
    @Inject
    private SqlSession sqlSession;
    
    private static final String Namespace = "com.nouvolution.mappers.memberMapper";
    
    @Override
    public List<MemberVO> selectMember() throws Exception {
 
        return sqlSession.selectList(Namespace+".selectMember");
    }

	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(Namespace+".login", vo);
	}
    
 
}