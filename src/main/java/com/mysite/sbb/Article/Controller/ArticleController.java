package com.mysite.sbb.Article.Controller;

import com.mysite.sbb.Article.Service.ArticleService;
import com.mysite.sbb.Article.domain.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("article")
public class ArticleController {

    private final ArticleService articleService;

    ArticleController(ArticleService articleService){
        this.articleService = articleService;
    }

    @RequestMapping("list")
    @ResponseBody
    public List<Article> getArticles(){
    return articleService.getList();
    }

    @RequestMapping("detail/")
    @ResponseBody
    public Article getArticle(Integer id){
        return articleService.getItem(id);
    }

}
