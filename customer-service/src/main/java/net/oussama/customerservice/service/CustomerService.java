package net.oussama.customerservice.service;

import net.oussama.customerservice.entities.Customer;
import net.oussama.customerservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;
    private CustomerService(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }
    public List<Customer>  getAllCutomers(){
        return customerRepository.findAll();
    }
    public Customer findCustomerById(Long id){
        return customerRepository.findById(id).orElseThrow(()->new RuntimeException("Customer not found"));
    }
    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }
}
