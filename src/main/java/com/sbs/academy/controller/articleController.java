package com.sbs.academy.controller;

import com.sbs.academy.dto.ArticleForm;
import com.sbs.academy.entity.Article;
import com.sbs.academy.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
@Slf4j
public class articleController {
    @Autowired
    private ArticleRepository articleRepository;

    //DTO로 데이터 넘겨주기위한 폼 작성 페이지
    @GetMapping("articles/new")
    public String newDtoForm() {
        return "articles/new";
    }

    // 저장하기 버튼을 누르면 폼에서 작성된 데이터를 입력하고 저장
//    @PostMapping("/articles/create")
//    public String createArticle(ArticleForm form) {
//        Article article = form.toEntity();
//        log.info(form.toString());
////        System.out.println(form.toString());
//        Article saved = articleRepository.save(article);
//        log.info(saved.toString());
//        return "redirect:/articles";
//    }


    // 저장하기 버튼 클릭시 폼에서 작성된 데이터를 id값 추출해서 작성한 해당 id값을 가진 글로 redirect
    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        Article article = form.toEntity();
        log.info(form.toString());
        Article saved = articleRepository.save(article);
        log.info(saved.toString());
        Long articleId = saved.getId();
        return "redirect:/articles/" + articleId;
    }



    // LIST 전체 조회
    // (파라미터에 모델을 담아서 보내줌)
    @GetMapping("/articles")
    public String index(Model model) {
        Iterable<Article> articleEntityList = articleRepository.findAll();
        model.addAttribute("articleList", articleEntityList);
        return "/articles/index";
    }


    // 항목별 조회
    // ID값으로 매핑하여 페이지를 조회 한다.
    @GetMapping("/articles/{id}")
    public String show(@PathVariable Long id, Model model) {
        log.info("아이디 값 = " + id);

        //findById 메소드를 이용해서 ID값 받아 오면 된다.
        Article articleEntity = articleRepository.findById(id).orElse(null);
        model.addAttribute("article", articleEntity);
        return "articles/show";
    }


    // 수정페이지 GET
    @GetMapping("/articles/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        log.info("아이디 값 = " + id);

        Article articleEntity = articleRepository.findById(id).orElse(null);
        model.addAttribute("article", articleEntity);
        return "/articles/edit";
    }

    // 데이터 수정 POST
    @PostMapping("/articles/update")
    public String update(ArticleForm form) {
        Article updatedArticle = form.toEntity(); // ArticleForm이 Article 엔티티로 변환하는 메서드를 가지고 있다고 가정합니다

        Long articleId = updatedArticle.getId();
        Article existingArticle = articleRepository.findById(articleId).orElse(null);

        if (existingArticle != null) {
            // 새 데이터로 기존 게시물 업데이트
            existingArticle.setTitle(updatedArticle.getTitle());
            existingArticle.setContent(updatedArticle.getContent());
            // ... 필요한 경우 다른 필드 업데이트

            // 업데이트된 게시물 저장
            articleRepository.save(existingArticle);
        }

        return "redirect:/articles/" + updatedArticle.getId();
    }

}
