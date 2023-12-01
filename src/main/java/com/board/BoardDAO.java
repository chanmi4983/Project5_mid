//com.example/dao 에 있음
package com.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
//import com.example.utli.JDBCUtil;

@Repository
public class BoardDAO{

@Autowired
    private JdbcTemplate template;

public void setTemplate(JdbcTemplate template){
    this.template = template;
}

    // // ///
//    private final String BOARD_INSERT = "insert into FriendBOARD (category,title, writer, content) values (?,?,?,?)";
//    private final String BOARD_UPDATE = "update FriendBOARD set category=?, title=?, writer=?, content=? where seq=?";
//    private final String BOARD_DELETE = "delete from FriendBOARD  where seq=?";
//    private final String BOARD_GET = "select * from FriendBOARD  where seq=?";
//    private final String BOARD_LIST = "select * from FriendBOARD order by seq desc";
//
//public BoardVO getBoard(int seq){
//    return template.queryForObject(BOARD_GET,
//            new Object[]{seq},
//            new BeanPropertyRowMapper<BoardVO>(BoardVO.class));
//}
//
//public List<BoardVO> getBoardList(){
//    return template.query(BOARD_LIST, new RowMapper<BoardVO>() {
//        @Override
//        public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//         BoardVO data = new BoardVO();
//         data.setSeq(rs.getInt("seq"));
//         data.setName(rs.getString("name"));
//         data.setBirthday(rs.getString("birthday"));
//         data.setMbti(rs.getString("mbti"));
//               return data;
//        }
//    });
//}
//
//public int insertBoard(BoardVO vo){
//return template.update(BOARD_INSERT, new Object[]{vo.getName(),vo.getBirthday(), vo.getMbti()});
//}
//
//public int deleteBoard(int id){
//    return template.update(BOARD_DELETE, new Object[]{id});
//}
//
//public int updateBoard(BoardVO vo){
//    return template.update(BOARD_UPDATE,
//            new Object[]{vo.getName(),vo.getBirthday(), vo.getMbti()});
//}



    // // ///
    public int insertBoard(BoardVO vo){
        String sql ="insert into FriendBOARD (name, birthday, mbti) values ("
                + "'"+ vo.getName()+"',"
                + "'"+ vo.getBirthday()+"',"
                + "'"+ vo.getMbti()+"')";
        return template.update(sql);
    }

    public int deleteBoard(int seq){
        String sql ="delete from FriendBOARD where seq ="+seq;
        return template.update(sql);
    }

    public int updateBoard(BoardVO vo){
        String sql ="update FriendBOARD (name, birthday, mbti) values ("
                + "'"+ vo.getName()+"',"
                + "'"+ vo.getBirthday()+"',"
                + "'"+ vo.getMbti()+"')";
        return template.update(sql);
    }


    class BoardRowMapper implements RowMapper<BoardVO>{
        @Override
        public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException{
            BoardVO vo = new BoardVO();
            vo.setSeq(rs.getInt("seq"));
            vo.setName(rs.getString("name"));
            vo.setBirthday(rs.getString("birthday"));
            vo.setMbti(rs.getString("mbti"));

            return vo;

        }
    }

public BoardVO getBoard(int seq){
        String sql="select * from FriendBOARD where seq=" +seq;
        return template.queryForObject(sql,new BoardRowMapper());
}

//public List<BoardVO> getBoardList(){
//        String sql="select * from FriendBOARD order by seq desc";
//        return template.queryf(sql,new BoardRowMapper());
//}


}





























