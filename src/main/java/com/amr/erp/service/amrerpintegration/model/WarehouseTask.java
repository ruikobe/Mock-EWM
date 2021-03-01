package com.amr.erp.service.amrerpintegration.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class WarehouseTask {

    @JsonProperty("Warehouse")
    private String warehouse;

    @JsonProperty("WarehouseTask")
    private String warehouseTask;

    @JsonProperty("WarehouseTaskItem")
    private String warehouseTaskItem;

    @JsonProperty("WarehouseOrder")
    private String warehouseOrder;

    @JsonProperty("CreationDateTime")
    private String creationDateTime;

    @JsonProperty("LastChangeDateTime")
    private Date lastChangeDateTime;

    @JsonProperty("ConfirmationUTCDateTime")
    private Date confirmationUTCDateTime;

    @JsonProperty("WhseTaskPlannedClosingDateTime")
    private Date whseTaskPlannedClosingDateTime;

    @JsonProperty("WhseTaskGoodsReceiptDateTime")
    private Date whseTaskGoodsReceiptDateTime;

    @JsonProperty("WarehouseTaskStatus")
    private String warehouseTaskStatus;
    @JsonProperty("WarehouseTaskStatusName")
    private String warehouseTaskStatusName;
    @JsonProperty("WarehouseProcessType")
    private String warehouseProcessType;
    @JsonProperty("WarehouseProcessTypeName")
    private String warehouseProcessTypeName;
    @JsonProperty("IsHandlingUnitWarehouseTask")
    private boolean isHandlingUnitWarehouseTask;
    @JsonProperty("ProductName")
    private String productName;
    @JsonProperty("ProductDescription")
    private String productDescription;
    @JsonProperty("Batch")
    private String batch;
    @JsonProperty("BatchChangeIsNotAllowed")
    private boolean batchChangeIsNotAllowed;
    @JsonProperty("StockType")
    private String stockType;
    @JsonProperty("StockTypeName")

    private String stockTypeName;
    @JsonProperty("StockOwner")

    private String stockOwner;

    @JsonProperty("EntitledToDisposeParty")
    private String entitledToDisposeParty;

    @JsonProperty("StockDocumentCategory")
    private String stockDocumentCategory;

    @JsonProperty("StockDocumentNumber")
    private String stockDocumentNumber;

    @JsonProperty("StockItemNumber")
    private String stockItemNumber;

    @JsonProperty("WBSElementInternalID")
    private String wBSElementInternalID;
    @JsonProperty("WBSElementExternalID")

    private String wBSElementExternalID;

    @JsonProperty("SpecialStockIdfgSalesOrder")
    private String specialStockIdfgSalesOrder;

    @JsonProperty("SpecialStockIdfgSalesOrderItem")
    private String specialStockIdfgSalesOrderItem;

    @JsonProperty("ExecutingResource")
    private String executingResource;

    @JsonProperty("ProductionOrder")
    private String productionOrder;
    @JsonProperty("ProductionSupplyArea")

    private String productionSupplyArea;
    @JsonProperty("Delivery")

    private String delivery;
    @JsonProperty("DeliveryItem")

    private String deliveryItem;
    @JsonProperty("PurchasingDocument")

    private String purchasingDocument;
    @JsonProperty("PurchasingDocumentItem")

    private String purchasingDocumentItem;
    @JsonProperty("SalesDocument")

    private String salesDocument;
    @JsonProperty("SalesDocumentItem")

    private String salesDocumentItem;
    @JsonProperty("BaseUnit")

    private String baseUnit;
    @JsonProperty("EWMBaseUnitISOCode")

    private String eWMBaseUnitISOCode;
    @JsonProperty("AlternativeUnit")

    private String alternativeUnit;
    @JsonProperty("EWMAlternativeUnitISOCode")

    private String eWMAlternativeUnitISOCode;
    @JsonProperty("TargetQuantityInBaseUnit")

    private String targetQuantityInBaseUnit;
    @JsonProperty("TargetQuantityInAltvUnit")

    private String targetQuantityInAltvUnit;
    @JsonProperty("ActualQuantityInBaseUnit")
    private String actualQuantityInBaseUnit;
    @JsonProperty("ActualQuantityInAltvUnit")

    private String actualQuantityInAltvUnit;
    @JsonProperty("DifferenceQuantityInBaseUnit")

    private String differenceQuantityInBaseUnit;
    @JsonProperty("DifferenceQuantityInAltvUnit")

    private String differenceQuantityInAltvUnit;
    @JsonProperty("WhseTaskNetWeightUnitOfMeasure")

    private String whseTaskNetWeightUnitOfMeasure;
    @JsonProperty("NetWeight")
    private String netWeight;
    @JsonProperty("WhseTaskNetVolumeUnitOfMeasure")
    private String whseTaskNetVolumeUnitOfMeasure;
    @JsonProperty("WhseTaskNetVolume")
    private String whseTaskNetVolume;
    @JsonProperty("SourceStorageType")
    private String sourceStorageType;
    @JsonProperty("SourceStorageTypeName")
    private String sourceStorageTypeName;
    @JsonProperty("SourceStorageSection")
    private String sourceStorageSection;
    @JsonProperty("SourceStorageBin")
    private String sourceStorageBin;

    @JsonProperty("WareHouseOrderNumber")
    private int wareHouseOrderNumber;


    @JsonProperty("DestinationStorageType")
    private String destinationStorageType;
    @JsonProperty("DestinationStorageTypeName")

    private String destinationStorageTypeName;
    @JsonProperty("DestinationStorageSection")

    private String destinationStorageSection;
    @JsonProperty("DestinationStorageBin")
    private String destinationStorageBin;
    @JsonProperty("DestinationResource")

    private String destinationResource;
    @JsonProperty("ActivityArea")

    private String activityArea;
    @JsonProperty("ActivityAreaName")

    private String activityAreaName;
    @JsonProperty("SourceHandlingUnit")
    private String sourceHandlingUnit;
    @JsonProperty("DestinationHandlingUnit")

    private String destinationHandlingUnit;
    @JsonProperty("WarehouseTaskExceptionCode")

    private String warehouseTaskExceptionCode;
    private List<WarehouseTaskExceptionCode> to_WarehouseTaskExceptionCode;

    public WarehouseTask() {
    }

    public String getProductName() {
        return this.productName;
    }

    public String getProductDescription() {
        return this.productDescription;
    }

    public String getStockTypeName() {
        return this.stockTypeName;
    }

    public String getStockOwner() {
        return this.stockOwner;
    }

    public String getEntitledToDisposeParty() {
        return this.entitledToDisposeParty;
    }

    public String getStockDocumentCategory() {
        return this.stockDocumentCategory;
    }

    public String getStockDocumentNumber() {
        return this.stockDocumentNumber;
    }

    public String getStockItemNumber() {
        return this.stockItemNumber;
    }

    public String getWBSElementInternalID() {
        return this.wBSElementInternalID;
    }

    public String getWBSElementExternalID() {
        return this.wBSElementExternalID;
    }

    public String getSpecialStockIdfgSalesOrder() {
        return this.specialStockIdfgSalesOrder;
    }

    public String getSpecialStockIdfgSalesOrderItem() {
        return this.specialStockIdfgSalesOrderItem;
    }

    public String getExecutingResource() {
        return this.executingResource;
    }

    public String getProductionOrder() {
        return this.productionOrder;
    }

    public String getProductionSupplyArea() {
        return this.productionSupplyArea;
    }

    public String getDelivery() {
        return this.delivery;
    }

    public String getDeliveryItem() {
        return this.deliveryItem;
    }

    public String getPurchasingDocument() {
        return this.purchasingDocument;
    }

    public String getPurchasingDocumentItem() {
        return this.purchasingDocumentItem;
    }

    public String getSalesDocument() {
        return this.salesDocument;
    }

    public String getSalesDocumentItem() {
        return this.salesDocumentItem;
    }

    public String getBaseUnit() {
        return this.baseUnit;
    }

    public String getEWMBaseUnitISOCode() {
        return this.eWMBaseUnitISOCode;
    }

    public String getAlternativeUnit() {
        return this.alternativeUnit;
    }

    public String getEWMAlternativeUnitISOCode() {
        return this.eWMAlternativeUnitISOCode;
    }

    public String getSourceStorageBin() {
        return this.sourceStorageBin;
    }

    public String getDestinationStorageBin() {
        return this.destinationStorageBin;
    }

    public List<WarehouseTaskExceptionCode> getTo_WarehouseTaskExceptionCode() {
        return this.to_WarehouseTaskExceptionCode;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public void setWarehouseTask(String warehouseTask) {
        this.warehouseTask = warehouseTask;
    }

    public void setWarehouseTaskItem(String warehouseTaskItem) {
        this.warehouseTaskItem = warehouseTaskItem;
    }

    public void setWarehouseOrder(String warehouseOrder) {
        this.warehouseOrder = warehouseOrder;
    }

    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public void setLastChangeDateTime(Date lastChangeDateTime) {
        this.lastChangeDateTime = lastChangeDateTime;
    }

    public void setConfirmationUTCDateTime(Date confirmationUTCDateTime) {
        this.confirmationUTCDateTime = confirmationUTCDateTime;
    }

    public void setWhseTaskPlannedClosingDateTime(Date whseTaskPlannedClosingDateTime) {
        this.whseTaskPlannedClosingDateTime = whseTaskPlannedClosingDateTime;
    }

    public void setWhseTaskGoodsReceiptDateTime(Date whseTaskGoodsReceiptDateTime) {
        this.whseTaskGoodsReceiptDateTime = whseTaskGoodsReceiptDateTime;
    }

    public void setWarehouseTaskStatus(String warehouseTaskStatus) {
        this.warehouseTaskStatus = warehouseTaskStatus;
    }

    public void setWarehouseTaskStatusName(String warehouseTaskStatusName) {
        this.warehouseTaskStatusName = warehouseTaskStatusName;
    }

    public void setWarehouseProcessType(String warehouseProcessType) {
        this.warehouseProcessType = warehouseProcessType;
    }

    public void setWarehouseProcessTypeName(String warehouseProcessTypeName) {
        this.warehouseProcessTypeName = warehouseProcessTypeName;
    }

    public void setHandlingUnitWarehouseTask(boolean isHandlingUnitWarehouseTask) {
        this.isHandlingUnitWarehouseTask = isHandlingUnitWarehouseTask;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setBatchChangeIsNotAllowed(boolean batchChangeIsNotAllowed) {
        this.batchChangeIsNotAllowed = batchChangeIsNotAllowed;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType;
    }

    public void setStockTypeName(String stockTypeName) {
        this.stockTypeName = stockTypeName;
    }

    public void setStockOwner(String stockOwner) {
        this.stockOwner = stockOwner;
    }

    public void setEntitledToDisposeParty(String entitledToDisposeParty) {
        this.entitledToDisposeParty = entitledToDisposeParty;
    }

    public void setStockDocumentCategory(String stockDocumentCategory) {
        this.stockDocumentCategory = stockDocumentCategory;
    }

    public void setStockDocumentNumber(String stockDocumentNumber) {
        this.stockDocumentNumber = stockDocumentNumber;
    }

    public void setStockItemNumber(String stockItemNumber) {
        this.stockItemNumber = stockItemNumber;
    }

    public void setWBSElementInternalID(String wBSElementInternalID) {
        this.wBSElementInternalID = wBSElementInternalID;
    }

    public void setWBSElementExternalID(String wBSElementExternalID) {
        this.wBSElementExternalID = wBSElementExternalID;
    }

    public void setSpecialStockIdfgSalesOrder(String specialStockIdfgSalesOrder) {
        this.specialStockIdfgSalesOrder = specialStockIdfgSalesOrder;
    }

    public void setSpecialStockIdfgSalesOrderItem(String specialStockIdfgSalesOrderItem) {
        this.specialStockIdfgSalesOrderItem = specialStockIdfgSalesOrderItem;
    }

    public void setExecutingResource(String executingResource) {
        this.executingResource = executingResource;
    }

    public void setProductionOrder(String productionOrder) {
        this.productionOrder = productionOrder;
    }

    public void setProductionSupplyArea(String productionSupplyArea) {
        this.productionSupplyArea = productionSupplyArea;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public void setDeliveryItem(String deliveryItem) {
        this.deliveryItem = deliveryItem;
    }

    public void setPurchasingDocument(String purchasingDocument) {
        this.purchasingDocument = purchasingDocument;
    }

    public void setPurchasingDocumentItem(String purchasingDocumentItem) {
        this.purchasingDocumentItem = purchasingDocumentItem;
    }

    public void setSalesDocument(String salesDocument) {
        this.salesDocument = salesDocument;
    }

    public void setSalesDocumentItem(String salesDocumentItem) {
        this.salesDocumentItem = salesDocumentItem;
    }

    public void setBaseUnit(String baseUnit) {
        this.baseUnit = baseUnit;
    }

    public void setEWMBaseUnitISOCode(String eWMBaseUnitISOCode) {
        this.eWMBaseUnitISOCode = eWMBaseUnitISOCode;
    }

    public void setAlternativeUnit(String alternativeUnit) {
        this.alternativeUnit = alternativeUnit;
    }

    public void setEWMAlternativeUnitISOCode(String eWMAlternativeUnitISOCode) {
        this.eWMAlternativeUnitISOCode = eWMAlternativeUnitISOCode;
    }

    public void setTargetQuantityInBaseUnit(String targetQuantityInBaseUnit) {
        this.targetQuantityInBaseUnit = targetQuantityInBaseUnit;
    }

    public void setTargetQuantityInAltvUnit(String targetQuantityInAltvUnit) {
        this.targetQuantityInAltvUnit = targetQuantityInAltvUnit;
    }

    public void setActualQuantityInBaseUnit(String actualQuantityInBaseUnit) {
        this.actualQuantityInBaseUnit = actualQuantityInBaseUnit;
    }

    public void setActualQuantityInAltvUnit(String actualQuantityInAltvUnit) {
        this.actualQuantityInAltvUnit = actualQuantityInAltvUnit;
    }

    public void setDifferenceQuantityInBaseUnit(String differenceQuantityInBaseUnit) {
        this.differenceQuantityInBaseUnit = differenceQuantityInBaseUnit;
    }

    public void setDifferenceQuantityInAltvUnit(String differenceQuantityInAltvUnit) {
        this.differenceQuantityInAltvUnit = differenceQuantityInAltvUnit;
    }

    public void setWhseTaskNetWeightUnitOfMeasure(String whseTaskNetWeightUnitOfMeasure) {
        this.whseTaskNetWeightUnitOfMeasure = whseTaskNetWeightUnitOfMeasure;
    }

    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    public void setWareHouseOrderNumber(int wareHouseOrderNumber) {
        this.wareHouseOrderNumber = wareHouseOrderNumber;
    }

    public void setWhseTaskNetVolumeUnitOfMeasure(String whseTaskNetVolumeUnitOfMeasure) {
        this.whseTaskNetVolumeUnitOfMeasure = whseTaskNetVolumeUnitOfMeasure;
    }

    public void setWhseTaskNetVolume(String whseTaskNetVolume) {
        this.whseTaskNetVolume = whseTaskNetVolume;
    }

    public void setSourceStorageType(String sourceStorageType) {
        this.sourceStorageType = sourceStorageType;
    }

    public void setSourceStorageTypeName(String sourceStorageTypeName) {
        this.sourceStorageTypeName = sourceStorageTypeName;
    }

    public void setSourceStorageSection(String sourceStorageSection) {
        this.sourceStorageSection = sourceStorageSection;
    }

    public void setSourceStorageBin(String sourceStorageBin) {
        this.sourceStorageBin = sourceStorageBin;
    }

    public void setDestinationStorageType(String destinationStorageType) {
        this.destinationStorageType = destinationStorageType;
    }

    public void setDestinationStorageTypeName(String destinationStorageTypeName) {
        this.destinationStorageTypeName = destinationStorageTypeName;
    }

    public void setDestinationStorageSection(String destinationStorageSection) {
        this.destinationStorageSection = destinationStorageSection;
    }

    public void setDestinationStorageBin(String destinationStorageBin) {
        this.destinationStorageBin = destinationStorageBin;
    }

    public void setDestinationResource(String destinationResource) {
        this.destinationResource = destinationResource;
    }

    public void setActivityArea(String activityArea) {
        this.activityArea = activityArea;
    }

    public void setActivityAreaName(String activityAreaName) {
        this.activityAreaName = activityAreaName;
    }

    public void setSourceHandlingUnit(String sourceHandlingUnit) {
        this.sourceHandlingUnit = sourceHandlingUnit;
    }

    public void setDestinationHandlingUnit(String destinationHandlingUnit) {
        this.destinationHandlingUnit = destinationHandlingUnit;
    }

    public void setWarehouseTaskExceptionCode(String warehouseTaskExceptionCode) {
        this.warehouseTaskExceptionCode = warehouseTaskExceptionCode;
    }

    public void setTo_WarehouseTaskExceptionCode(List<WarehouseTaskExceptionCode> to_WarehouseTaskExceptionCode) {
        this.to_WarehouseTaskExceptionCode = to_WarehouseTaskExceptionCode;
    }


    public String getWarehouse() {
        return this.warehouse;
    }

    public String getWarehouseTask() {
        return this.warehouseTask;
    }

    public String getWarehouseTaskItem() {
        return this.warehouseTaskItem;
    }

    public int getWareHouseOrderNumber() {
        return wareHouseOrderNumber;
    }



    public String getWarehouseOrder() {
        return this.warehouseOrder;
    }

    public String getCreationDateTime() {
        return this.creationDateTime;
    }

    public Date getLastChangeDateTime() {
        return this.lastChangeDateTime;
    }

    public Date getConfirmationUTCDateTime() {
        return this.confirmationUTCDateTime;
    }

    public Date getWhseTaskPlannedClosingDateTime() {
        return this.whseTaskPlannedClosingDateTime;
    }

    public Date getWhseTaskGoodsReceiptDateTime() {
        return this.whseTaskGoodsReceiptDateTime;
    }

    public String getWarehouseTaskStatus() {
        return this.warehouseTaskStatus;
    }

    public String getWarehouseTaskStatusName() {
        return this.warehouseTaskStatusName;
    }

    public String getWarehouseProcessType() {
        return this.warehouseProcessType;
    }

    public String getWarehouseProcessTypeName() {
        return this.warehouseProcessTypeName;
    }

    public boolean isHandlingUnitWarehouseTask() {
        return this.isHandlingUnitWarehouseTask;
    }

    public String getBatch() {
        return this.batch;
    }

    public boolean isBatchChangeIsNotAllowed() {
        return this.batchChangeIsNotAllowed;
    }

    public String getStockType() {
        return this.stockType;
    }

    public String getTargetQuantityInBaseUnit() {
        return this.targetQuantityInBaseUnit;
    }

    public String getTargetQuantityInAltvUnit() {
        return this.targetQuantityInAltvUnit;
    }

    public String getActualQuantityInBaseUnit() {
        return this.actualQuantityInBaseUnit;
    }

    public String getActualQuantityInAltvUnit() {
        return this.actualQuantityInAltvUnit;
    }

    public String getDifferenceQuantityInBaseUnit() {
        return this.differenceQuantityInBaseUnit;
    }

    public String getDifferenceQuantityInAltvUnit() {
        return this.differenceQuantityInAltvUnit;
    }

    public String getWhseTaskNetWeightUnitOfMeasure() {
        return this.whseTaskNetWeightUnitOfMeasure;
    }

    public String getNetWeight() {
        return this.netWeight;
    }

    public String getWhseTaskNetVolumeUnitOfMeasure() {
        return this.whseTaskNetVolumeUnitOfMeasure;
    }

    public String getWhseTaskNetVolume() {
        return this.whseTaskNetVolume;
    }

    public String getSourceStorageType() {
        return this.sourceStorageType;
    }

    /*
    public String getSourceStorageTypeName() {
        return this.sourceStorageTypeName;
    }*/

    public String getSourceStorageSection() {
        return this.sourceStorageSection;
    }

    public String getDestinationStorageType() {
        return this.destinationStorageType;
    }

    public String getDestinationStorageTypeName() {
        return this.destinationStorageTypeName;
    }

    public String getDestinationStorageSection() {
        return this.destinationStorageSection;
    }

    public String getDestinationResource() {
        return this.destinationResource;
    }

    public String getActivityArea() {
        return this.activityArea;
    }

    public String getActivityAreaName() {
        return this.activityAreaName;
    }

    public String getSourceHandlingUnit() {
        return this.sourceHandlingUnit;
    }

    public String getDestinationHandlingUnit() {
        return this.destinationHandlingUnit;
    }

    public String getWarehouseTaskExceptionCode() {
        return this.warehouseTaskExceptionCode;
    }
}
