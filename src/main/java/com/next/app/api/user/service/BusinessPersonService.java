package com.next.app.api.user.service;

import com.next.app.api.user.entity.BusinessPerson;
import com.next.app.api.user.entity.Product;
import com.next.app.api.user.repository.BusinessPersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BusinessPersonService {

    @Autowired
    private BusinessPersonRepository businessPersonRepository;

    // 상품 전체 조회
    public List<BusinessPerson> getAllBusinessPerson() {
        return businessPersonRepository.findAll();
    }

    // 상품 단건 조회
    public BusinessPerson getBusinessPersonById(Long id) {
        return businessPersonRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }

    // 상품 생성
    public BusinessPerson createBusinessPerson(BusinessPerson businessPerson) {
        return businessPersonRepository.save(businessPerson);
    }

    // 상품 수정
    public BusinessPerson updateBusinessPerson(Long id, BusinessPerson updatedBusinessPerson) {
        BusinessPerson businessPerson = businessPersonRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
        businessPerson.setBusinessNumber(updatedBusinessPerson.getBusinessNumber());
        businessPerson.setCompanyName(updatedBusinessPerson.getCompanyName());
        businessPerson.setRepresentativeName(updatedBusinessPerson.getRepresentativeName());
        businessPerson.setContactEmail(updatedBusinessPerson.getContactEmail());
        businessPerson.setContactPhone(updatedBusinessPerson.getContactPhone());
        businessPerson.setAddress(updatedBusinessPerson.getAddress());
        return businessPersonRepository.save(businessPerson);
    }

    // 상품 삭제
    public void deleteBusinessPerson(Long id) {
        businessPersonRepository.deleteById(id);

    }
}
