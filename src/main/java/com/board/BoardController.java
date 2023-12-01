package com.board;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(value="/friendlist")
public class BoardController {
    @Autowired
    BoardDAO boardDAO;

    @RequestMapping(value="/friendlist/list", method = RequestMethod.GET)
    public String boardlist(Model model){
        model.addAttribute("list",boardDAO.getBoardList());
        return "posts";
    }

    @RequestMapping(value="/friendlist/add", method = RequestMethod.GET)
    public String addPost(){
        return "addpostform";
    }

    @RequestMapping(value="/friendlist/addok", method= RequestMethod.POST)
    public String addPostOK(BoardVO vo){
        int i = boardDAO.insertBoard(vo);
        if(i ==0)
            System.out.println("데이터 추가 실패 ");
        else System.out.println("데이터 추가 성공! !");

        return "redirect:list";
    }
    @RequestMapping(value="/friendlist/editpost/{id}", method = RequestMethod.GET)
    public String editPost(@PathVariable("id") int id, Model model){
        BoardVO boardVO = boardDAO.getBoard(id);
        model.addAttribute("boardVO",boardVO);
        return "editform";
    }

    @RequestMapping(value = "friendlist/editok", method = RequestMethod.POST)
    public String editOK(BoardVO vo){
        int i = boardDAO.updateBoard(vo);
        if (i==0)
            System.out.println("데이터 수정 실패 ");
        else
            System.out.println("데이터 수정 성공! ! ");
        return "redirect:list";
    }

    @RequestMapping(value="friendlist/delete/{id}",method=RequestMethod.GET)
    public String deletePost(@PathVariable("id") int id){
        boardDAO.deleteBoard(id);
        return "redirect:../list";
    }


//
//
//@Autowired
//BoardServiceImpl boardService;
//    @RequestMapping(value="/friendlist/list",method= RequestMethod.GET)
//    public String boardList(Model model){
//        model.addAttribute("list",boardService.getBoardList());
//        return "posts";
//    }
//
//    @RequestMapping(value="/friendlist/add",method= RequestMethod.GET)
//    public String addPost(){
//        return "addpostform";
//    }
//
//
//    @RequestMapping(value = "/addok",method=RequestMethod.POST)
//    public String addPostOK(BoardVO vo){
//        if(boardService.insertBoard(vo)==0)
//            System.out.println("데이터 추가 실패");
//        else
//            System.out.println("데이터 추가 성공!!");
//
//        return "redirect:list";
//    }
//
////     아래 id? seq?
//    @RequestMapping(value="/editform/{id}",method= RequestMethod.GET)
//    public String editPost(@PathVariable("id") int id, Model model){
//        BoardVO boardVO = boardService.getBoard(id);
//        model.addAttribute("u",boardVO);
//        return "editform";
//    }
/////////****editok....
//    @RequestMapping(value = "/editok",method=RequestMethod.POST)
//    public String editPostOK(BoardVO vo){
//        if(boardService.updateBoard(vo)==0)
//            System.out.println("데이터 수정 실패");
//        else
//            System.out.println("데이터 수정 성공!!");
//
//        return "redirect:list";
//    }
//
//
//
//
//    @RequestMapping(value="/deleteok/{id}",method= RequestMethod.GET)
//    public String deletePostOk(@PathVariable("id") int id){
//        if(boardService.deleteBoard(id)==0)
//            System.out.println("데이터 삭제 실패");
//        else
//            System.out.println("데이터 삭제 성공!!");
//        return "redirect:../list";
//    }
}


