package task3;

import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository {
    public Invoice find(final String invoiceNumber);
}
