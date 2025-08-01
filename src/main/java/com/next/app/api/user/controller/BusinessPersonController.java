package com.next.app.api.user.controller;

import com.next.app.api.user.entity.BusinessPerson;
import com.next.app.api.user.service.BusinessPersonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/businessPerson")
@Tag(name = "BusinessPerson Controller", description = "사업자 관리 API")
@CrossOrigin(origins = "http://localhost")
public class BusinessPersonController {

    private final BusinessPersonService businessPersonService;

    @Autowired
    public BusinessPersonController(BusinessPersonService businessPersonService){
        this.businessPersonService = businessPersonService;
    }
    @GetMapping
    @Operation(summary = "모든 사업자 조회", description = "등록된 모든 사업자 목록을 반환합니다.")
    public List<BusinessPerson> getAllBusinessPerson() {
        return businessPersonService.getAllBusinessPerson();
    }
    @GetMapping("/{id}")
    @Operation(summary = "사업자 조회", description = "ID로 특정 사업자를 조회합니다.")
    public BusinessPerson getProductById(@PathVariable Long id) {
        return businessPersonService.getBusinessPersonById(id);
    }
    @PostMapping
    @Operation(summary = "사업자 생성", description = "새로운 사업자를 생성합니다.")
    public BusinessPerson createProduct(@RequestBody BusinessPerson product) {
        return businessPersonService.createBusinessPerson(product);
    }
    @PutMapping("/{id}")
    @Operation(summary = "사업자 수정", description = "기존 사업자 정보를 수정합니다.")
    public BusinessPerson updateProduct(@PathVariable Long id, @RequestBody BusinessPerson businessPerson) {
        return businessPersonService.updateBusinessPerson(id, businessPerson);
    }
    @DeleteMapping("/{id}")
    @Operation(summary = "사업자 삭제", description = "사업자를 삭제합니다.")
    public void deleteProduct(@PathVariable Long id) {
        businessPersonService.deleteBusinessPerson(id);
    }
}
