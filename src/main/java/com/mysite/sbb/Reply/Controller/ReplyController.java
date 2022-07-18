package com.mysite.sbb.Reply.Controller;

import com.mysite.sbb.Article.Service.ArticleService;
import com.mysite.sbb.Article.domain.Article;
import com.mysite.sbb.Reply.Service.ReplyService;
import com.mysite.sbb.Reply.domain.Reply;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("reply")
public class ReplyController {
    private final ReplyService replyService;
    private final ArticleService articleService;

    ReplyController(ArticleService articleService,ReplyService replyService){
        this.replyService = replyService;this.articleService=articleService;
    }

    @RequestMapping("list")
    @ResponseBody
    private List<Reply> getReply(Integer id){
        return replyService.getReplys();
    }

    @PostMapping("/create/{id}")
    private String createReply(Model model, @PathVariable("id") Integer id, @RequestParam String content){
        Article article = articleService.getItem(id);
        replyService.create(article,content);
        return String.format("redirect:/article/detail/%s",id);
    }
}
