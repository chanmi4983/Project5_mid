package com.board;
import org.springframework.stereotype.Repository;

@Repository
public class BoardVO {
    private int seq;
    private String name;
    private String birthday;
    private String mbti;
//    private String writer;
//    private String content;
//    private Date regdate;
    private int cnt;

    public int getSeq() {
        return seq;
    }
    public void setSeq(int seq) {
        this.seq = seq;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getMbti() {
        return mbti;
    }
    public void setMbti(String mbti) {
        this.mbti = mbti;
    }
//    public String getTitle() {
//        return title;
//    }
//    public void setTitle(String title) {
//        this.title = title;
//    }
//    public String getCategory() {
//        return category;
//    }
//    public void setCategory(String category) {
//        this.category = category;
//    }
//    public String getWriter() {
//        return writer;
//    }
//    public void setWriter(String writer) {
//        this.writer = writer;
//    }
//    public String getContent() {
//        return content;
//    }
//    public void setContent(String content) {
//        this.content = content;
//    }
//    public Date getRegdate() {
//        return regdate;
//    }
//    public void setRegdate(Date regdate) {
//        this.regdate = regdate;
//    }
    public int getCnt() {
        return cnt;
    }
    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}



