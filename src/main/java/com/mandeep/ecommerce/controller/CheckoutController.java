package com.mandeep.ecommerce.controller;

import com.mandeep.ecommerce.dto.Purchase;
import com.mandeep.ecommerce.dto.PurchaseResponse;
import com.mandeep.ecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}