public class TransactionRecord {
    private String buyerTIN;
    private String sellerTIN;
    private double invoiceAmount;
    private String timestamp;

    // Getter and Setter for buyerTIN
    public String getBuyerTIN() {
        return buyerTIN;
    }
    public void setBuyerTIN(String buyerTIN) {
        this.buyerTIN = buyerTIN;
    }

    // Getter and Setter for sellerTIN
    public String getSellerTIN() {
        return sellerTIN;
    }
    public void setSellerTIN(String sellerTIN) {
        this.sellerTIN = sellerTIN;
    }

    // Getter and Setter for invoiceAmount
    public double getInvoiceAmount() {
        return invoiceAmount;
    }
    public void setInvoiceAmount(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    // Getter and Setter for timestamp
    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
