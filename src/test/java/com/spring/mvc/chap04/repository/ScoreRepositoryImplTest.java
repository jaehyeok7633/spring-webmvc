package com.spring.mvc.chap04.repository;

import com.spring.mvc.chap04.dto.ScoreRequestDTO;
import com.spring.mvc.chap04.entity.Grade;
import com.spring.mvc.chap04.entity.Score;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ScoreRepositoryImplTest {

    @Autowired
    ScoreRepositoryImpl repository;

    @Test
    @DisplayName("새로운 성적 정보를 save를 통해 추가한다. ")
    void saveTest() {
        ScoreRequestDTO dto = new ScoreRequestDTO("홍길동", 97, 64, 88);
        Score score = new Score(dto);

        boolean flag = repository.save(score);

        assertTrue(flag);
    }


}