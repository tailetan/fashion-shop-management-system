
package dp.tdtu.model;

import java.util.Date;

public class DirectBill extends Bill{

    public DirectBill(){
        
    }
    
    public DirectBill(long totalPrice, Date creationDate, User creator, boolean isPaid, Date paidDate) {
        super(totalPrice, creationDate, creator, isPaid, paidDate);
    }
    
    public DirectBill(long totalPrice, Date creationDate, User creator) {
        super(totalPrice, creationDate, creator, true, creationDate);
    }
    
    @Override
    public boolean isIsPaid() {
        return true;
    }

    @Override
    public void setIsPaid(boolean isPaid) {
        this.isPaid = true;
    }

    @Override
    public Date getPaidDate() {
        return this.getCreationDate();
    }

    @Override
    public void setPaidDate(Date paidDate) {
        this.paidDate = this.getCreationDate();
    }
    
 
}
