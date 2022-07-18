package com.mysite.sbb.Article.Service;

import com.mysite.sbb.Article.Repository.ArticleRepository;
import com.mysite.sbb.Article.domain.Article;
import com.mysite.sbb.util.DataNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.zip.DataFormatException;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;


    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository= articleRepository;
    }

    public List<Article> getList() { return articleRepository.findAll();    }

    public Article getItem(Integer id){
        Optional<Article> article = this.articleRepository.findById(id);
        if(article.isPresent()){
            return article.get();
        }
        else{
            throw new DataNotFoundException("article not found");
        }
    }
}
