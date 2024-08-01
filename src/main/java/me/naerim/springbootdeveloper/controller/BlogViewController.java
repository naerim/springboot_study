package me.naerim.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.naerim.springbootdeveloper.dto.ArticleListViewResponse;
import me.naerim.springbootdeveloper.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class BlogViewController {
    private final BlogService blogService;

    @GetMapping("/articles")
    public String getArticles(Model model) {
        List<ArticleListViewResponse> articles = blogService.findAll().stream().map(ArticleListViewResponse::new).toList();
        model.addAttribute("articles", articles);
        return "articleList"; // articleList.html 조회
    }
}
