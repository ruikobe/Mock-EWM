package com.amr.erp.service.amrerpintegration.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class WarehouseOrder {

    @JsonProperty("Warehouse")
    public String warehouse;
    @JsonProperty("WarehouseOrder")
    public String warehouseOrder;
    @JsonProperty("WarehouseOrderStatus")
    public String warehouseOrderStatus;
    @JsonProperty("WarehouseOrderStatusName")
    public String warehouseOrderStatusName;
    @JsonProperty("CreationDateTime")
    public Date creationDateTime;
    @JsonProperty("WarehouseOrderStartDateTime")
    public Date warehouseOrderStartDateTime;
    @JsonProperty("WhseOrderConfirmedDateTime")
    public Date whseOrderConfirmedDateTime;
    @JsonProperty("LastChangeDateTime")
    public Date lastChangeDateTime;
    @JsonProperty("WhseOrderLatestStartDateTime")
    public Date whseOrderLatestStartDateTime;
    @JsonProperty("ExecutingResource")
    public String executingResource;

    private List<WarehouseTask> to_WarehouseTask;

    public WarehouseOrder() {
    }

    public Date getWarehouseOrderStartDateTime() {
        return this.warehouseOrderStartDateTime;
    }

    public List<WarehouseTask> getTo_WarehouseTask() {
        return this.to_WarehouseTask;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public void setWarehouseOrder(String warehouseOrder) {
        this.warehouseOrder = warehouseOrder;
    }

    public void setWarehouseOrderStatus(String warehouseOrderStatus) {
        this.warehouseOrderStatus = warehouseOrderStatus;
    }

    public void setWarehouseOrderStatusName(String warehouseOrderStatusName) {
        this.warehouseOrderStatusName = warehouseOrderStatusName;
    }

    public void setCreationDateTime(Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public void setWarehouseOrderStartDateTime(Date warehouseOrderStartDateTime) {
        this.warehouseOrderStartDateTime = warehouseOrderStartDateTime;
    }

    public void setWhseOrderConfirmedDateTime(Date whseOrderConfirmedDateTime) {
        this.whseOrderConfirmedDateTime = whseOrderConfirmedDateTime;
    }

    public void setLastChangeDateTime(Date lastChangeDateTime) {
        this.lastChangeDateTime = lastChangeDateTime;
    }

    public void setWhseOrderLatestStartDateTime(Date whseOrderLatestStartDateTime) {
        this.whseOrderLatestStartDateTime = whseOrderLatestStartDateTime;
    }

    public void setExecutingResource(String executingResource) {
        this.executingResource = executingResource;
    }

    public void setTo_WarehouseTask(List<WarehouseTask> to_WarehouseTask) {
        this.to_WarehouseTask = to_WarehouseTask;
    }

    @JsonIgnore
    public String getWarehouse() {
        return this.warehouse;
    }

    @JsonIgnore
    public String getWarehouseOrder() {
        return this.warehouseOrder;
    }

    @JsonIgnore
    public String getWarehouseOrderStatus() {
        return this.warehouseOrderStatus;
    }

    @JsonIgnore
    public String getWarehouseOrderStatusName() {
        return this.warehouseOrderStatusName;
    }

    @JsonIgnore
    public Date getCreationDateTime() {
        return this.creationDateTime;
    }

    @JsonIgnore
    public Date getWhseOrderConfirmedDateTime() {
        return this.whseOrderConfirmedDateTime;
    }

    @JsonIgnore
    public Date getLastChangeDateTime() {
        return this.lastChangeDateTime;
    }

    @JsonIgnore
    public Date getWhseOrderLatestStartDateTime() {
        return this.whseOrderLatestStartDateTime;
    }

    @JsonIgnore
    public String getExecutingResource() {
        return this.executingResource;
    }
}