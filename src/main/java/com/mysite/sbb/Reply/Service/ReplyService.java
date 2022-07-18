package com.mysite.sbb.Reply.Service;

import com.mysite.sbb.Article.domain.Article;
import com.mysite.sbb.Reply.Repository.ReplyRepository;
import com.mysite.sbb.Reply.domain.Reply;
import com.mysite.sbb.util.DataNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ReplyService {

    private final ReplyRepository replyRepository;

    ReplyService(ReplyRepository replyRepository){
        this.replyRepository = replyRepository;
    }


    public List<Reply> getReplys() {
        return replyRepository.findAll();
    }

    public void create(Article article, String content){
        Reply reply = new Reply();
        reply.setContent(content);
        reply.setCreateDate(LocalDateTime.now());
        reply.setArticle(article);
        replyRepository.save(reply);
    }
}
