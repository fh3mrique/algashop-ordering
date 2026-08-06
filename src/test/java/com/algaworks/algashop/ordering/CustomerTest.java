package com.algaworks.algashop.ordering;

import com.algaworks.algashop.ordering.domain.entity.Customer;
import org.junit.jupiter.api.Test;

public class CustomerTest {
    @Test
    public void testingCustomer(){
        // Construtor vazio permite nascer um objeto em estado inválido:
        // não existe cliente no domínio sem nome e sem documento
        Customer customer = new Customer();

        customer.setId(null);
        customer.setFullName("Filipe lima");
        // Setter público aceita qualquer String: nenhuma regra de negócio
        // é aplicada e o objeto fica sempre mutável e sem invariantes
        customer.setDocument("11332");
    }

}
