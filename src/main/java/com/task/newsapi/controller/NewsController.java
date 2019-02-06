package com.task.newsapi.controller;

import com.task.newsapi.domain.News;
import com.task.newsapi.service.NewsService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsController {

    private NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/news")
    public List<News> allNews() {
        return newsService.allNews();
    }

    @GetMapping("/news/{id}")
    public News read(@PathVariable("id")  Long id) {
        return newsService.getById(id);
    }

    @Secured("")
    @PostMapping("/news")
    public News create(@RequestBody News news) {
        return newsService.create(news);
    }

    @Secured("")
    @PutMapping("/news/{id}")
    public News update(@RequestBody News news,@PathVariable("id") Long id) {
        return newsService.update(news, id);
    }

    @Secured("")
    @DeleteMapping("/news/{id}")
    public void delete(@PathVariable("id") Long id) {
        newsService.delete(id);
    }

}
