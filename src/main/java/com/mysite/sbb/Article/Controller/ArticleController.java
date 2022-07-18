package com.mysite.sbb.Article.Controller;

import com.mysite.sbb.Article.Service.ArticleService;
import com.mysite.sbb.Article.domain.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;
import java.util.zip.DataFormatException;

@Controller
@RequestMapping("article")
public class ArticleController {

    private final ArticleService articleService;

    ArticleController(ArticleService articleService){
        this.articleService = articleService;
    }

    @RequestMapping("list")
    public String getArticles(Model model){
        List<Article> articleList = articleService.getList();
        model.addAttribute("articleList",articleList);
        return "article_list";
    }

    @RequestMapping("detail/{id}")
    public String getArticle(Model model, @PathVariable("id") Integer id){
        Article article = articleService.getItem(id);
        model.addAttribute("article",article);
        return "article_detail";
    }

}
