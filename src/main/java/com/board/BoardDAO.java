//com.example/dao 에 있음
package com.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//import com.example.utli.JDBCUtil;

@Repository
public class BoardDAO{

@Autowired
BoardDAO boardDAO;
@Autowired
private JdbcTemplate template;

public void setTemplate(JdbcTemplate template){
    this.template = template;
}


    private final String BOARD_INSERT = "insert into FriendBOARD (name,birthday, mbti) values (?,?,?)";

    private final String BOARD_UPDATE = "update FriendBOARD set name=?, birthday=?, mbti=?, email=?, phonenum=?, studentid=?,major=?, rc=? where seq=?";
    private final String BOARD_DELETE = "delete from FriendBOARD  where seq=?";
    private final String BOARD_GET = "select * from FriendBOARD  where seq=?"; // 하나만 가져오는거
    private final String BOARD_LIST = "select * from FriendBOARD order by seq desc"; // 리스트 전부 가져오는 것

public BoardVO getBoard(int seq){

    return template.queryForObject(BOARD_GET,
            new Object[]{seq},
            new BeanPropertyRowMapper<BoardVO>(BoardVO.class));
}


public List<BoardVO> getBoardList(){
    System.out.println("==> list 불러오기 성공");
    return template.query(BOARD_LIST, new RowMapper<BoardVO>() {
        @Override
        public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//            set name=?, birthday=?, mbti=?, email=?, phonenum=?, studentid=?,major=?, rc=?
         BoardVO data = new BoardVO();
         data.setSeq(rs.getInt("seq"));
         data.setName(rs.getString("name"));
         data.setBirthday(rs.getString("birthday"));
         data.setMbti(rs.getString("mbti"));
         data.setEmail(rs.getString("email")); /// ??
        data.setPhonenum(rs.getString("phonenum"));
        data.setStudentid(rs.getString("studentid"));
        data.setMajor(rs.getString("major"));
        data.setRc(rs.getString("rc"));

               return data;
        }
    });
}



public int insertBoard(BoardVO vo){
    System.out.println("===> JDBC로 insertBoard()했음! ");


//            set name=?, birthday=?, mbti=?, email=?, phonenum=?, studentid=?,major=?, rc=?
String sql ="insert into FriendBOARD (seq, name, birthday, mbti, email, phonenum, studentid, major,rc) values ("
      + "'"+vo.getSeq()+"',"
        + "'"+ vo.getName()+"',"
        + "'"+ vo.getBirthday()+"',"
        + "'"+ vo.getMbti()+"',"
        + "'"+ vo.getEmail()+"',"
        + "'"+ vo.getPhonenum()+"',"
        + "'"+ vo.getStudentid()+"',"
        + "'"+ vo.getMajor()+"',"
        + "'"+ vo.getRc()+"')";
return template.update(sql);
}


public int deleteBoard(int id){
    System.out.println("===> JDBC로 deleteBoard() 기능 처리");
    return template.update(BOARD_DELETE, new Object[]{id});
}

public int updateBoard(BoardVO vo){
    System.out.println("===> JDBC로 updateBoard() 기능 처리");
    return template.update(BOARD_UPDATE,
            new Object[]{vo.getName(),vo.getBirthday(), vo.getMbti(), vo.getEmail(), vo.getPhonenum(),
            vo.getStudentid(),vo.getMajor(),vo.getRc(), vo.getSeq()}
    );
}

    class BoardRowMapper implements RowMapper<BoardVO>{
        @Override
        public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException{
            BoardVO vo = new BoardVO();
//            vo.setSeq(rs.getInt("seq"));
            vo.setName(rs.getString("name"));
            vo.setBirthday(rs.getString("birthday"));
            vo.setMbti(rs.getString("mbti"));
            vo.setCnt((rs.getInt("cnt")));
            vo.setEmail(rs.getString("email"));
            vo.setPhonenum(rs.getString("phonenum"));
            vo.setStudentid(rs.getString("studentid"));
            vo.setMajor(rs.getString("major"));
            vo.setRc(rs.getString("rc"));
            return vo;

        }
    }
//
//public BoardVO getBoard(int seq){
//        String sql="select * from FriendBOARD where seq=" +seq;
//        return template.queryForObject(sql,new BoardRowMapper());
//}
//
//public List<BoardVO> getBoardList(){
//        String sql="select * from FriendBOARD order by seq desc";
//        return template.query(sql,new BoardRowMapper());
//}


}





























