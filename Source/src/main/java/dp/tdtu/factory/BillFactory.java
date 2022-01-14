package dp.tdtu.factory;

import dp.tdtu.model.Bill;
import dp.tdtu.model.BillType;
import dp.tdtu.model.CODBill;
import dp.tdtu.model.DirectBill;

public class BillFactory {

    public Bill getBill(BillType buildType){
        if(BillType.DIRECT.equals(buildType)){
            return new DirectBill();
        } else if (BillType.COD.equals(buildType)){
            Bill codBill = new CODBill();
            codBill.setIsPaid(false);
            codBill.setPaidDate(null);
            return codBill;
        }
        return null;
    }
}
