package com.mysite.sbb.Reply.Service;

import com.mysite.sbb.Reply.Repository.ReplyRepository;
import com.mysite.sbb.Reply.domain.Reply;
import com.mysite.sbb.util.DataNotFoundException;
import org.springframework.stereotype.Service;

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
}
