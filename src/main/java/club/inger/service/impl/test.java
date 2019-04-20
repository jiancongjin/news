package club.inger.service.impl;

import club.inger.entity.Comment;
import club.inger.util.EncodeUtil;
import club.inger.util.SensitiveWord;

/**
 * Created by inger on 2019/4/18.
 */
public class test {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setContent("贱人单独的");
        SensitiveWord sw = new SensitiveWord("CensorWords.txt");
        System.out.println(EncodeUtil.getEncoding("贱人单独的"));
        sw.InitializationWork();
        System.out.println(sw.filterInfo(comment.getContent()));
    }
}
