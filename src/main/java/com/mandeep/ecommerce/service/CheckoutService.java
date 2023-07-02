package com.mandeep.ecommerce.service;

import com.mandeep.ecommerce.dto.Purchase;
import com.mandeep.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
