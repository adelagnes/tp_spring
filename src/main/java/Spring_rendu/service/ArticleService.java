package Spring_rendu.service;

import Spring_rendu.model.Article;



import java.util.List;
import java.util.Optional;

public interface ArticleService {
    List<Article> getAllArticles();
    Optional<Article> getArticleById(Long id);
    Article createArticle(Article article);
    Article updateArticle(Long id, Article updatedArticle);
    void deleteArticle(Long id);
}
