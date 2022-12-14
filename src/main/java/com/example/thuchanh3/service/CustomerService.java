package com.example.thuchanh3.service;

import com.example.thuchanh3.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service(value = "customer")
public class CustomerService implements ICustomerService{
    private static final Map<Integer, Customer> customers;
    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1 , "Jonh" , "Jonh@codegum.hn1" , "HN"));
        customers.put(2, new Customer(2 , "Jonh2" , "Jonh@codegum.hn2" , "HN2"));
        customers.put(3, new Customer(3 , "Jonh3" , "Jonh@codegum.hn3" , "HN3"));
        customers.put(4, new Customer(4 , "Jonh4" , "Jonh@codegum.hn4" , "HN4"));
        customers.put(5, new Customer(5 , "Jonh5" , "Jonh@codegum.hn5" , "HN5"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    public void save(Customer customer) {
        customers.put(customer.getId(),customer);

    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);

    }

    @Override
    public void remove(int id) {
        customers.remove(id);

    }
}
