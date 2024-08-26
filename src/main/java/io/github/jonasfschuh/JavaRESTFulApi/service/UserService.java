package io.github.jonasfschuh.JavaRESTFulApi.service;

import io.github.jonasfschuh.JavaRESTFulApi.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User createToCreate);
}
