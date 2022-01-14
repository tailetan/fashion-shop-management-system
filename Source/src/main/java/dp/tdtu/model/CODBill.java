package dp.tdtu.model;

import java.util.Date;

public class CODBill extends Bill{

    public CODBill(){
        
    }
    
    public CODBill(long totalPrice, Date creationDate, User creator, boolean isPaid, Date paidDate) {
        super(totalPrice, creationDate, creator, isPaid, paidDate);
    }
    
    public CODBill(long totalPrice, Date creationDate) {
        super(totalPrice, creationDate, null, false, null);
    }

    @Override
    public boolean isIsPaid() {
        return isPaid;
    }

    @Override
    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    @Override
    public Date getPaidDate() {
        return this.paidDate;
    }

    @Override
    public void setPaidDate(Date paidDate) {
        this.paidDate = paidDate;
    }
        
}
