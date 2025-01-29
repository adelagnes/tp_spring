package Spring_rendu.service;

import Spring_rendu.model.Article;
import Spring_rendu.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public Optional<Article> getArticleById(Long id) {
        return articleRepository.findById(id);
    }

    @Override
    public Article createArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article updateArticle(Long id, Article updatedArticle) {
        return articleRepository.findById(id)
                .map(article -> {
                    article.setTitle(updatedArticle.getTitle());
                    article.setContent(updatedArticle.getContent());
                    article.setAuthor(updatedArticle.getAuthor());
                    article.setPublicationDate(updatedArticle.getPublicationDate());
                    return articleRepository.save(article);
                })
                .orElseThrow(() -> new RuntimeException("Article pas trouve: " + id));
    }

    @Override
    public void deleteArticle(Long id) {
        articleRepository.deleteById(id);
    }
}