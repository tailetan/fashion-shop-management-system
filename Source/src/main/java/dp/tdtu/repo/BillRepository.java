
package dp.tdtu.repo;

import dp.tdtu.model.Bill;
import dp.tdtu.model.DirectBill;
import dp.tdtu.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class BillRepository {
    public static final List<Bill> bills = new ArrayList<>();
    
    static {
        User admin = new UserRepository().findUserByUsername("518H0114");
        bills.add(new DirectBill(1000000, new Date(System.currentTimeMillis()), admin));
        bills.add(new DirectBill(2500000, new Date(System.currentTimeMillis()), admin));
        int i = 0;
        for (Bill bill : bills) {
            bill.setId(++i);
        }
    }
    
    public List<Bill> findAllBills(){
        return bills;
    }
    
    public Bill findBillById(int id){
        
        for (Bill bill : bills) {
            if(bill.getId() == id){
                return bill;
            }
        }
        return null;
    }
    
    public void delete(int id){
        int tobeDelete = -1;
        for (int i = 0; i < bills.size(); i++) {
            if(bills.get(i).getId() == id){
                tobeDelete = i;
                break;
            }
        }
        bills.remove(tobeDelete);
    }
    
    public void save(Bill bill){
        int id = bills.size() + 1;
        bill.setId(id);
        bills.add(bill);
    }
}
