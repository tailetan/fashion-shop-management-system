package dp.tdtu.model;

import java.util.Date;


public abstract class Bill {
    private int id;
    private long totalPrice;
    private Date creationDate = new Date(System.currentTimeMillis());;
    private User creator;
    protected boolean isPaid;
    protected Date paidDate;

    public Bill(){
    }
    
    public Bill(long totalPrice, Date creationDate, User creator, boolean isPaid, Date paidDate) {
        this.totalPrice = totalPrice;
        this.creationDate = new Date(System.currentTimeMillis());
        this.creator = creator;
        this.isPaid = isPaid;
        this.paidDate = paidDate;
    }
    
    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public abstract boolean isIsPaid();

    public abstract void setIsPaid(boolean isPaid);

    public abstract Date getPaidDate();

    public abstract void setPaidDate(Date paidDate);
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

}
