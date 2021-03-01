package com.amr.erp.service.amrerpintegration.controller;

import com.amr.erp.service.amrerpintegration.model.WarehouseOrder;
import com.amr.erp.service.amrerpintegration.model.WarehouseTask;
import com.amr.erp.service.amrerpintegration.service.WarehouseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class WarehouseOrderController {

    @Autowired
    WarehouseOrderService warehouseOrderService;

    public static int requestTime = 0;

    @GetMapping(value = "/warehouseOrder", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<WarehouseOrder>> getWarehouseOrder() {
        List<WarehouseOrder> warehouseOrders = warehouseOrderService.getNextWarehouseOrder(requestTime);
        requestTime++;
        return ResponseEntity.ok(warehouseOrders);
    }

    @GetMapping(value = "/warehouseOrderRepeated", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String,String> getRepeatedOrder() {
        return warehouseOrderService.getRepeatedOrder();
    }

   }
