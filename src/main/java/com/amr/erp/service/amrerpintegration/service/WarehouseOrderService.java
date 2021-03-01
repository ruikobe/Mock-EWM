package com.amr.erp.service.amrerpintegration.service;

import com.amr.erp.service.amrerpintegration.model.WarehouseOrder;
import com.amr.erp.service.amrerpintegration.model.WarehouseTask;
import com.amr.erp.service.amrerpintegration.repository.WarehouseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class WarehouseOrderService {
    @Autowired
    private WarehouseOrderRepository warehouseOrdersRepository;

    public List<WarehouseOrder> getNextWarehouseOrder(int requestNumber) {
        List<WarehouseOrder> warehouseOrders = new ArrayList<>(2);
        if (requestNumber == 0) {
            warehouseOrders.addAll(warehouseOrdersRepository.getWarehouseOrderList());
        } else if (requestNumber == 1) {
            warehouseOrders.addAll(warehouseOrdersRepository.getWarehouseOrderList());
        } else{
            warehouseOrders.add(warehouseOrdersRepository.getNextOrder());
//            warehouseOrders.add(warehouseOrdersRepository.getNextOrder());
        }
        return  warehouseOrders;
    }



    public HashMap<String, String> getRepeatedOrder() {
        return  warehouseOrdersRepository.getRepeatedOrder();
    }

    }
