package task3;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class InvoiceJpaRepository implements InvoiceRepository {
    @Override
    @Cacheable
    public Invoice find(String invoiceNumber) {
        return null;
    }
}
