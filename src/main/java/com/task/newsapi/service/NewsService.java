package com.task.newsapi.service;

import com.task.newsapi.domain.News;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NewsService {
    List<News> allNews();

    News create(News news);

    News update(News news, Long id);

    void delete(Long id);

    News getById(Long id);
}
