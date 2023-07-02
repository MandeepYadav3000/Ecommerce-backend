package com.mandeep.ecommerce.dto;


import com.mandeep.ecommerce.entity.Address;
import com.mandeep.ecommerce.entity.Customer;
import com.mandeep.ecommerce.entity.Order;
import com.mandeep.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
