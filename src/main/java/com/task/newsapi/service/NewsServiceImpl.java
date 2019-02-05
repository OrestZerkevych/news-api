package com.task.newsapi.service;

import com.task.newsapi.domain.News;
import com.task.newsapi.exception.NewsNotFoundException;
import com.task.newsapi.repository.NewsRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class NewsServiceImpl implements NewsService {

    private NewsRepository newsRepository;

    public NewsServiceImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public List<News> allNews() {
        return newsRepository.findAll();
    }

    @Override
    public News create(News news) {
        return newsRepository.save(news);
    }

    @Override
    public News update(News news, Long id) throws NewsNotFoundException {
        News newsToUpdate = getById(id);
        newsToUpdate.setTitle(news.getTitle());
        newsToUpdate.setText(news.getText());
        newsToUpdate.setDate(news.getDate());
        return newsRepository.save(newsToUpdate);
    }

    @Override
    public void delete(Long id) {
        newsRepository.delete(getById(id));
    }

    @Override
    public News getById(Long id) throws NewsNotFoundException {
        Optional<News> news = newsRepository.findById(id);
        if (news.isPresent()) {
            return news.get();
        }else {
            throw new NewsNotFoundException();
        }
    }
}
