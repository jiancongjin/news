package club.inger.controller;

import club.inger.dto.ResultObject;
import club.inger.entity.Comment;
import club.inger.service.CommentService;
import club.inger.service.impl.CommentServiceImpl;
import club.inger.util.EncodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * Created by inger on 2019/4/14.
 */
@Controller
public class CommentController {
    CommentService commentService = new CommentServiceImpl();
    @RequestMapping(method = RequestMethod.POST,value = "/news/comment/update")
    @ResponseBody
    public ResultObject updateComment(Comment comment,HttpServletRequest request) {
        System.out.println("---------------------------comment/update");
        System.out.println(comment);
        System.out.println(EncodeUtil.getEncoding(comment.getContent()));
        ResultObject object = commentService.updateComent(comment);
        return object;
    }
    @RequestMapping(method = RequestMethod.GET,value = "/news/comment/get")
    @ResponseBody
    public ResultObject getComment(Comment comment) {
        System.out.println("-----------------------------comment/get");
        System.out.println(comment);
        ResultObject object = commentService.getComent(comment);
        return object;
    }
}
