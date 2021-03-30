// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class RegisterWhReceiptSummary extends TeaModel {
    // 注册仓单申请单ID
    @NameInMap("register_wh_receipt_id")
    public String registerWhReceiptId;

    // 仓单ID
    @NameInMap("warehouse_receipt_id")
    public String warehouseReceiptId;

    // 注册仓单申请单状态【 NONE：无效状态，WAITING：待审核，AGREED：审核同意，REJECTED：审核拒绝，CANCELED：已取消，WAITING_PRE_ALLOC_POSITION：待预分配仓位，WAITING_TRANSACTION_IN：待入库，TRANSACTION_IN：入库中，FINISHED_TRANSACTION_IN：已入库/待确认，CONFIRMED_TRANSACTION_IN：完成入库，INTERRUPTION：已中断，ALL：所有状态】
    @NameInMap("status")
    public String status;

    // 申请时间，单位：ms
    @NameInMap("apply_time")
    public Long applyTime;

    // 货物品类
    @NameInMap("commodity_category")
    public String commodityCategory;

    // 数量 + 单位
    @NameInMap("quantity")
    public String quantity;

    // 重量 + 单位
    @NameInMap("weight")
    public String weight;

    // 存货人名称
    @NameInMap("customer_name")
    public String customerName;

    // 保管人名称
    @NameInMap("custodian_name")
    public String custodianName;

    public static RegisterWhReceiptSummary build(java.util.Map<String, ?> map) throws Exception {
        RegisterWhReceiptSummary self = new RegisterWhReceiptSummary();
        return TeaModel.build(map, self);
    }

    public RegisterWhReceiptSummary setRegisterWhReceiptId(String registerWhReceiptId) {
        this.registerWhReceiptId = registerWhReceiptId;
        return this;
    }
    public String getRegisterWhReceiptId() {
        return this.registerWhReceiptId;
    }

    public RegisterWhReceiptSummary setWarehouseReceiptId(String warehouseReceiptId) {
        this.warehouseReceiptId = warehouseReceiptId;
        return this;
    }
    public String getWarehouseReceiptId() {
        return this.warehouseReceiptId;
    }

    public RegisterWhReceiptSummary setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RegisterWhReceiptSummary setApplyTime(Long applyTime) {
        this.applyTime = applyTime;
        return this;
    }
    public Long getApplyTime() {
        return this.applyTime;
    }

    public RegisterWhReceiptSummary setCommodityCategory(String commodityCategory) {
        this.commodityCategory = commodityCategory;
        return this;
    }
    public String getCommodityCategory() {
        return this.commodityCategory;
    }

    public RegisterWhReceiptSummary setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }
    public String getQuantity() {
        return this.quantity;
    }

    public RegisterWhReceiptSummary setWeight(String weight) {
        this.weight = weight;
        return this;
    }
    public String getWeight() {
        return this.weight;
    }

    public RegisterWhReceiptSummary setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public RegisterWhReceiptSummary setCustodianName(String custodianName) {
        this.custodianName = custodianName;
        return this;
    }
    public String getCustodianName() {
        return this.custodianName;
    }

}
