package com.driver.services;


import java.util.List;

import com.driver.model.Customer;
import com.driver.model.Driver;
import com.driver.model.TripBooking;
import com.driver.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface CustomerService {

//	CustomerRepository customerRepository = new CustomerRepository;

	public void register(Customer customer);

	public void deleteCustomer(Integer customerId);

	public TripBooking bookTrip(int customerId, String fromLocation, String toLocation, int distanceInKm) throws Exception;

	public void cancelTrip(Integer tripId);

	public void completeTrip(Integer tripId);

}