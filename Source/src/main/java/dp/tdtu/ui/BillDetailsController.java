/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.tdtu.ui;

import dp.tdtu.model.Bill;

/**
 *
 * @author Netbean <2021>
 */
public class BillDetailsController {
    
    private Bill model;
    private BillDetailsJFrame view;

    public BillDetailsController(Bill bill, BillDetailsJFrame billDetailsView) {
        this.model = bill;
        this.view = billDetailsView;
    }

    public Bill getModel() {
        return model;
    }

    public void setModel(Bill model) {
        this.model = model;
    }

    public BillDetailsJFrame getView() {
        return view;
    }

    public void setView(BillDetailsJFrame view) {
        this.view = view;
    }
    
    public void showView(){
        view.setLblBillCreator(model.getCreator().getUsername() + " - " + model.getCreator().getFullName());
        view.setLblBillDate(model.getCreationDate().toString());
        view.setLblBillId(String.valueOf(model.getId()));
        view.setLblBillPaid(model.isIsPaid() ? "Paid" : "Unpaid");
        view.setLblBillTotalPrice(String.valueOf(model.getTotalPrice()));
        view.setVisible(true);
        
    }
    
    public void closeView(){
        view.dispose();
    }
}
