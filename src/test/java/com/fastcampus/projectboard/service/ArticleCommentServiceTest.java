package com.fastcampus.projectboard.service;

import com.fastcampus.projectboard.domain.Article;
import com.fastcampus.projectboard.dto.ArticleCommentDto;
import com.fastcampus.projectboard.repository.ArticleCommentRepository;
import com.fastcampus.projectboard.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;

@DisplayName("비즈니스 로직 - 댓글")
@ExtendWith(MockitoExtension.class)
class ArticleCommentServiceTest {

    @InjectMocks
    private ArticleCommentService sut;

    @Mock
    private ArticleCommentRepository articleCommentRepository;

    @Mock
    private ArticleRepository articleRepository;

    @DisplayName("게시글 ID로 조회하면, 해당하는 댓글 리스트를 반환한다.")
    @Test
    void givenArticleId_whenSearchingComments_thenReturnsComments() {
        //given
        long articleId = 1L;
        Article article = Article.of("title", "content", "hashtag");

        given(articleRepository.findById(articleId)).willReturn(Optional.of(article));

        //when
        List<ArticleCommentDto> list = sut.searchArticleComment(articleId);

        //then
        assertThat(list).isNotNull();
        then(articleRepository).should().findById(articleId);
    }
}