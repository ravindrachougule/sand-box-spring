package com.marcobehler.service;
import com.marcobehler.model.Invoice;
import com.marcobehler.model.User;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InvoiceService {

    final UserService userService;

    public InvoiceService(UserService userService) {
        this.userService = userService;
    }

    List<Invoice> invoices = new CopyOnWriteArrayList<>(); //


    public List<Invoice> findAll() {
        return invoices;
    }

    public Invoice create(String userId, Integer amount) {
        // TODO real pdf creation and storing it on network server
        User user = userService.findUser(userId);

        if (user == null){
            throw new IllegalStateException();
        }
        //todo creating real pdf and storing on network
        Invoice invoice = new Invoice(userId, amount, "http://www.africau.edu/images/default/sample.pdf");
        invoices.add(invoice);
        return invoice;
    }

}
