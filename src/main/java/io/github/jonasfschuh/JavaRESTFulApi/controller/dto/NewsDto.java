package io.github.jonasfschuh.JavaRESTFulApi.controller.dto;

import io.github.jonasfschuh.JavaRESTFulApi.domain.model.News;

public record NewsDto(Long id, String icon, String description) {

    public NewsDto(News model) {
        this(model.getId(), model.getIcon(), model.getDescription());
    }

    public News toModel() {
        News model = new News();
        model.setId(this.id);
        model.setIcon(this.icon);
        model.setDescription(this.description);
        return model;
    }
}
