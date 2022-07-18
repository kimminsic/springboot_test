package com.mysite.sbb.Article.Service;

import com.mysite.sbb.Article.Repository.ArticleRepository;
import com.mysite.sbb.Article.domain.Article;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    ArticleService(ArticleRepository articleRepository){
        this.articleRepository = articleRepository;
    }
    public List<Article> getList() {
    return articleRepository.findAll();
    }

    public Article getItem(Integer id) {
        return articleRepository.findById(id).get();
    }
}
