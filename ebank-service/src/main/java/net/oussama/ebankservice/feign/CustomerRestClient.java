package net.oussama.ebankservice.feign;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import net.oussama.ebankservice.model.Customer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="customer-service")
public interface CustomerRestClient {
    @CircuitBreaker(name ="customerService",fallbackMethod = "getDefaultCustomer")
    @GetMapping("/customers/{id}")
    Customer getCustomerById(@PathVariable Long id);
    default Customer getDefaultCustomer(Long id,Exception e){
        return new Customer(id,"Not available","Not available");
    }
}
