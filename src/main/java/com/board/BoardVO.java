package com.board;
import org.springframework.stereotype.Repository;

@Repository
public class BoardVO {
    private int seq;
    private String name;
    private String birthday;
    private String mbti;

    private String email;
    private String phonenum;
    private String studentid;
    private String major;
    private String rc;



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



    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhonenum() {
        return phonenum;
    }
    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }


    public String getStudentid() {
        return studentid;
    }
    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public String getRc() {
        return rc;
    }
    public void setRc(String rc) {
        this.rc = rc;
    }


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



