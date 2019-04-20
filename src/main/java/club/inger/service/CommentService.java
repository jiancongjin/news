package club.inger.service;

import club.inger.dto.ResultObject;
import club.inger.entity.Comment;

/**
 * Created by inger on 2019/4/14.
 */
public interface CommentService {
    public ResultObject updateComent(Comment comment);
    public ResultObject getComent(Comment comment);

}
