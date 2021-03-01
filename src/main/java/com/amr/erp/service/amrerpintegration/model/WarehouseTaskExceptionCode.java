package com.amr.erp.service.amrerpintegration.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class WarehouseTaskExceptionCode {
   @JsonProperty("Warehouse")
    public String warehouse;
    @JsonProperty("WarehouseTask")
    public String warehouseTask;
    @JsonProperty("WarehouseTaskItem")
    public String warehouseTaskItem;
    @JsonProperty("WarehouseTaskExceptionCode")
    public String warehouseTaskExceptionCode;
    @JsonProperty("BusinessContext")
    public String businessContext;
    @JsonProperty("BusinessContextExecutionStep")
    public String businessContextExecutionStep;

 public WarehouseTaskExceptionCode() {
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

 public String getWarehouseTaskExceptionCode() {
  return this.warehouseTaskExceptionCode;
 }

 public String getBusinessContext() {
  return this.businessContext;
 }

 public String getBusinessContextExecutionStep() {
  return this.businessContextExecutionStep;
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

 public void setWarehouseTaskExceptionCode(String warehouseTaskExceptionCode) {
  this.warehouseTaskExceptionCode = warehouseTaskExceptionCode;
 }

 public void setBusinessContext(String businessContext) {
  this.businessContext = businessContext;
 }

 public void setBusinessContextExecutionStep(String businessContextExecutionStep) {
  this.businessContextExecutionStep = businessContextExecutionStep;
 }
}
