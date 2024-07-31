package me.naerim.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.naerim.springbootdeveloper.domain.Article;
import me.naerim.springbootdeveloper.dto.AddArticleRequest;
import me.naerim.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor // final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service // 빈으로 등록
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) { // 블로그 글 추가
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    public Article findById(long id) {
        return blogRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    }
}
