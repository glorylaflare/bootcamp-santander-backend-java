package me.dio.santanderbackend2023.controller.dto;

import me.dio.santanderbackend2023.domain.model.News;

public record NewsDto(Long id, String icon, String description, String url) {

    public NewsDto(News model) {
        this(model.getId(), model.getIcon(), model.getDescription(), model.getUrl());
    }

    public News toModel() {
        News model = new News();
        model.setId(this.id);
        model.setIcon(this.icon);
        model.setDescription(this.description);
        model.setUrl(this.url);
        return model;
    }
}
