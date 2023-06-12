package com.fastcampus.projectboard.service;

import com.fastcampus.projectboard.domain.enums.SearchType;
import com.fastcampus.projectboard.dto.ArticleDto;
import com.fastcampus.projectboard.dto.ArticleUpdateDto;
import com.fastcampus.projectboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;


    public Page<ArticleDto> searchArticles(SearchType type, String keyword) {
        return Page.empty();
    }

    public ArticleDto searchArticle(long articleId) {
        return null;
    }

    @Transactional
    public void saveArticle(ArticleDto dto) {

    }

    public void updateArticle(long articleId, ArticleUpdateDto dto) {
    }

    public void deleteArticle(long articleId) {

    }
}
