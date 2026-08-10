package com.algaworks.algashop.ordering.domain.exception;

import static com.algaworks.algashop.ordering.domain.exception.ErrorMessages.ERRO_CUSTOMER_ARCHIVED;

public class CustomerArchivedException extends DomainException {
    public CustomerArchivedException() {
        super(ERRO_CUSTOMER_ARCHIVED);
    }

    public CustomerArchivedException(Throwable cause) {
        super(ERRO_CUSTOMER_ARCHIVED, cause);
    }
}
