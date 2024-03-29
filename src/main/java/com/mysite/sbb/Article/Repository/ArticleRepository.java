package com.mysite.sbb.Article.Repository;

import com.mysite.sbb.Article.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
    Optional<Article> findById(Integer id);
}
