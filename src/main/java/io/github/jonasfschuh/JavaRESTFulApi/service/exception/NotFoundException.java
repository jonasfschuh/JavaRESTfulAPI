package io.github.jonasfschuh.JavaRESTFulApi.service.exception;

import org.springframework.data.crossstore.ChangeSetPersister;

public class NotFoundException extends BusinessException {

    private static final long serialVersionUID = 1L;

    public NotFoundException() {
        super("Resource not found.");
    }
}
