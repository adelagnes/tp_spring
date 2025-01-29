// src/main/java/Spring_rendu/repository/ArticleRepository.java
package Spring_rendu.repository;

import Spring_rendu.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
