package task3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Invoice {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String invoiceNumber;
    @Transient
    private Object invoiceData;

    public Invoice() {}

    public Invoice(String invoiceNumber, Object invoiceData) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceData = invoiceData;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public Object getInvoiceData() {
        return invoiceData;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setInvoiceData(Object invoiceData) {
        this.invoiceData = invoiceData;
    }
}
