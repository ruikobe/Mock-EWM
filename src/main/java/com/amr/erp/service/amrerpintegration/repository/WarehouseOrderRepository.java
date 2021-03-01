package com.amr.erp.service.amrerpintegration.repository;

import com.amr.erp.service.amrerpintegration.model.WarehouseOrder;
import com.amr.erp.service.amrerpintegration.model.WarehouseTask;
import com.amr.erp.service.amrerpintegration.model.WarehouseTaskExceptionCode;
import org.springframework.stereotype.Repository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Repository
public class WarehouseOrderRepository {


    public static CircularBuffer<WarehouseOrder> warehouseOrderCircularBuffer = new CircularBuffer<>(100);

    public static List<WarehouseOrder> warehouseOrderList = new ArrayList<>(2);

    static {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        WarehouseOrder warehouseOrder = new WarehouseOrder();
        WarehouseTask warehouseTask = new WarehouseTask();
        warehouseTask.setProductDescription("Blue Widget");
        warehouseTask.setNetWeight("1.5 lb");
        warehouseTask.setSourceStorageBin("SB-1 ");
        warehouseTask.setWareHouseOrderNumber(1);
        warehouseTask.setDestinationStorageBin("DB-1");
        warehouseTask.setCreationDateTime(dateTimeFormatter.format(LocalDateTime.now()));


        WarehouseTaskExceptionCode warehouseTaskExceptionCode = new WarehouseTaskExceptionCode();
        List<WarehouseTaskExceptionCode> warehouseTaskExceptionCodeList = new ArrayList<>();
        warehouseTaskExceptionCodeList.add(warehouseTaskExceptionCode);
        warehouseTask.setTo_WarehouseTaskExceptionCode(warehouseTaskExceptionCodeList);
        List<WarehouseTask> warehouseTaskList = new ArrayList<>();
        warehouseTaskList.add(warehouseTask);
        warehouseOrder.setTo_WarehouseTask(warehouseTaskList);

        WarehouseOrder warehouseOrder1 = new WarehouseOrder();
        WarehouseTask warehouseTask1 = new WarehouseTask();
        warehouseTask1.setProductDescription("Red Widget");
        warehouseTask1.setNetWeight("0.75 lb");
        warehouseTask1.setSourceStorageBin("SB-2 ");
        warehouseTask1.setWareHouseOrderNumber(2);
        warehouseTask1.setDestinationStorageBin("DB-1");
        warehouseTask1.setCreationDateTime(dateTimeFormatter.format(LocalDateTime.now()));


        WarehouseTaskExceptionCode warehouseTaskExceptionCode1 = new WarehouseTaskExceptionCode();
        List<WarehouseTaskExceptionCode> warehouseTaskExceptionCodeList1 = new ArrayList<>();
        warehouseTaskExceptionCodeList1.add(warehouseTaskExceptionCode1);
        warehouseTask.setTo_WarehouseTaskExceptionCode(warehouseTaskExceptionCodeList1);
        List<WarehouseTask> warehouseTaskList1 = new ArrayList<>();
        warehouseTaskList1.add(warehouseTask1);
        warehouseOrder1.setTo_WarehouseTask(warehouseTaskList1);

        WarehouseOrder warehouseOrder2 = new WarehouseOrder();
        WarehouseTask warehouseTask2 = new WarehouseTask();
        warehouseTask2.setProductDescription("Yellow Widget");
        warehouseTask2.setNetWeight("0.35 lb");
        warehouseTask2.setSourceStorageBin("SB-3");
        warehouseTask2.setWareHouseOrderNumber(3);
        warehouseTask2.setDestinationStorageBin("DB-3");
        warehouseTask2.setCreationDateTime(dateTimeFormatter.format(LocalDateTime.now()));

        WarehouseTaskExceptionCode warehouseTaskExceptionCode2 = new WarehouseTaskExceptionCode();
        List<WarehouseTaskExceptionCode> warehouseTaskExceptionCodeList2 = new ArrayList<>();
        warehouseTaskExceptionCodeList2.add(warehouseTaskExceptionCode2);
        warehouseTask.setTo_WarehouseTaskExceptionCode(warehouseTaskExceptionCodeList2);
        List<WarehouseTask> warehouseTaskList2 = new ArrayList<>();
        warehouseTaskList2.add(warehouseTask2);
        warehouseOrder2.setTo_WarehouseTask(warehouseTaskList2);

        WarehouseOrder warehouseOrder3 = new WarehouseOrder();
        WarehouseTask warehouseTask3 = new WarehouseTask();
        warehouseTask3.setProductDescription("Blue widget");
        warehouseTask3.setNetWeight("1.5 lb");
        warehouseTask3.setSourceStorageBin("SB-1");
        warehouseTask3.setWareHouseOrderNumber(4);
        warehouseTask3.setDestinationStorageBin("DB-4");
        warehouseTask3.setCreationDateTime(dateTimeFormatter.format(LocalDateTime.now()));

        WarehouseTaskExceptionCode warehouseTaskExceptionCode3 = new WarehouseTaskExceptionCode();
        List<WarehouseTaskExceptionCode> warehouseTaskExceptionCodeList3 = new ArrayList<>();
        warehouseTaskExceptionCodeList3.add(warehouseTaskExceptionCode3);
        warehouseTask.setTo_WarehouseTaskExceptionCode(warehouseTaskExceptionCodeList3);
        List<WarehouseTask> warehouseTaskList3 = new ArrayList<>();
        warehouseTaskList3.add(warehouseTask3);
        warehouseOrder3.setTo_WarehouseTask(warehouseTaskList3);

        WarehouseOrder warehouseOrder4 = new WarehouseOrder();
        WarehouseTask warehouseTask4 = new WarehouseTask();
        warehouseTask4.setProductDescription("Red Widget");
        warehouseTask4.setNetWeight("0.75 lb");
        warehouseTask4.setSourceStorageBin("SB-2");
        warehouseTask4.setWareHouseOrderNumber(5);
        warehouseTask4.setDestinationStorageBin("DB-5");
        warehouseTask4.setCreationDateTime(dateTimeFormatter.format(LocalDateTime.now()));

        WarehouseTaskExceptionCode warehouseTaskExceptionCode4 = new WarehouseTaskExceptionCode();
        List<WarehouseTaskExceptionCode> warehouseTaskExceptionCodeList4 = new ArrayList<>();
        warehouseTaskExceptionCodeList4.add(warehouseTaskExceptionCode4);
        warehouseTask.setTo_WarehouseTaskExceptionCode(warehouseTaskExceptionCodeList4);
        List<WarehouseTask> warehouseTaskList4 = new ArrayList<>();
        warehouseTaskList4.add(warehouseTask4);
        warehouseOrder4.setTo_WarehouseTask(warehouseTaskList4);

        WarehouseOrder warehouseOrder5 = new WarehouseOrder();
        WarehouseTask warehouseTask5 = new WarehouseTask();
        warehouseTask5.setProductDescription("Yellow Widget");
        warehouseTask5.setNetWeight("0.35 lb");
        warehouseTask5.setSourceStorageBin("SB-3");
        warehouseTask5.setWareHouseOrderNumber(6);
        warehouseTask5.setDestinationStorageBin("DB-6");
        warehouseTask5.setCreationDateTime(dateTimeFormatter.format(LocalDateTime.now()));

        WarehouseTaskExceptionCode warehouseTaskExceptionCode5 = new WarehouseTaskExceptionCode();
        List<WarehouseTaskExceptionCode> warehouseTaskExceptionCodeList5 = new ArrayList<>();
        warehouseTaskExceptionCodeList5.add(warehouseTaskExceptionCode5);
        warehouseTask.setTo_WarehouseTaskExceptionCode(warehouseTaskExceptionCodeList5);
        List<WarehouseTask> warehouseTaskList5 = new ArrayList<>();
        warehouseTaskList5.add(warehouseTask5);
        warehouseOrder5.setTo_WarehouseTask(warehouseTaskList5);

        WarehouseOrder warehouseOrder6 = new WarehouseOrder();
        WarehouseTask warehouseTask6 = new WarehouseTask();
        warehouseTask6.setProductDescription("Blue Widget");
        warehouseTask6.setNetWeight("1.5 lb");
        warehouseTask6.setSourceStorageBin("SB-1");
        warehouseTask6.setWareHouseOrderNumber(7);
        warehouseTask6.setDestinationStorageBin("DB-7");
        warehouseTask6.setCreationDateTime(dateTimeFormatter.format(LocalDateTime.now()));

        WarehouseTaskExceptionCode warehouseTaskExceptionCode6 = new WarehouseTaskExceptionCode();
        List<WarehouseTaskExceptionCode> warehouseTaskExceptionCodeList6 = new ArrayList<>();
        warehouseTaskExceptionCodeList6.add(warehouseTaskExceptionCode6);
        warehouseTask.setTo_WarehouseTaskExceptionCode(warehouseTaskExceptionCodeList6);
        List<WarehouseTask> warehouseTaskList6 = new ArrayList<>();
        warehouseTaskList6.add(warehouseTask6);
        warehouseOrder6.setTo_WarehouseTask(warehouseTaskList6);


        warehouseOrderCircularBuffer.offer(warehouseOrder);
        warehouseOrderCircularBuffer.offer(warehouseOrder1);
        warehouseOrderCircularBuffer.offer(warehouseOrder2);
        warehouseOrderCircularBuffer.offer(warehouseOrder3);
        warehouseOrderCircularBuffer.offer(warehouseOrder4);
        warehouseOrderCircularBuffer.offer(warehouseOrder5);
        warehouseOrderCircularBuffer.offer(warehouseOrder6);

        warehouseOrderList.add(warehouseOrder);
        warehouseOrderList.add(warehouseOrder1);

    }


    public WarehouseOrder getNextOrder() {
        return warehouseOrderCircularBuffer.poll();
    }

    public List<WarehouseOrder> getWarehouseOrderList() {
        return warehouseOrderList;
    }

    public HashMap<String,String> getRepeatedOrder() {
        HashMap<String,String> hMap = new HashMap<>();
        WarehouseTask wtask = getNextOrder().getTo_WarehouseTask().get(0);
        int warehouseOrderNumber = wtask.getWareHouseOrderNumber();
        String netWeight = wtask.getNetWeight();
        String sourceStorageBin = wtask.getSourceStorageBin();
        String description = wtask.getProductDescription();
        String destinationStorageBin= wtask.getDestinationStorageBin();
        hMap.put("WareHouseOrderNumber",String.valueOf(warehouseOrderNumber));
        hMap.put("Net weight",netWeight);
        hMap.put("Source Storage Bin",sourceStorageBin);
        hMap.put("Destination Storage Bin",destinationStorageBin);
        hMap.put("Item Description",description);


        return hMap;
    }
}
