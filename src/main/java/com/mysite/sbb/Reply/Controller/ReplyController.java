package com.mysite.sbb.Reply.Controller;

import com.mysite.sbb.Reply.Service.ReplyService;
import com.mysite.sbb.Reply.domain.Reply;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("Reply")
public class ReplyController {
    private final ReplyService replyService;

    ReplyController(ReplyService replyService){
        this.replyService = replyService;
    }

    @RequestMapping("list")
    @ResponseBody
    private List<Reply> getReply(Integer id){
        return replyService.getReplys();
    }
}
