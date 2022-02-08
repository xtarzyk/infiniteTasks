package task3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
    private InvoiceRepository repository;

    public InvoiceService(@Qualifier("invoiceRepository") InvoiceRepository repository) {
        this.repository = repository;
    }

    public Invoice getInvoice(String invoiceNumber) {
        return repository.find(invoiceNumber);
    }
}
