// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PurchaseOrderInfoDetail extends TeaModel {
    // 租赁订单号
    // 
    @NameInMap("order_number")
    @Validation(required = true)
    public String orderNumber;

    // 收货人姓名
    // 
    @NameInMap("consignee_name")
    @Validation(required = true)
    public String consigneeName;

    // 收货人身份证号
    @NameInMap("consignee_id_number")
    @Validation(required = true)
    public String consigneeIdNumber;

    // 收货人手机号
    // 
    @NameInMap("consignee_phone")
    @Validation(required = true)
    public String consigneePhone;

    // 收货人地址
    @NameInMap("consignee_address")
    @Validation(required = true)
    public String consigneeAddress;

    // 供货商名称
    // 
    @NameInMap("supplier_name")
    @Validation(required = true)
    public String supplierName;

    // 供货商租户id
    // 
    @NameInMap("supplier_id")
    @Validation(required = true)
    public String supplierId;

    // 采购商id
    // 
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    // 商品id
    // 
    @NameInMap("goods_sku_id")
    @Validation(required = true)
    public Long goodsSkuId;

    // 商品采购数量 
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    public static PurchaseOrderInfoDetail build(java.util.Map<String, ?> map) throws Exception {
        PurchaseOrderInfoDetail self = new PurchaseOrderInfoDetail();
        return TeaModel.build(map, self);
    }

    public PurchaseOrderInfoDetail setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    public String getOrderNumber() {
        return this.orderNumber;
    }

    public PurchaseOrderInfoDetail setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
        return this;
    }
    public String getConsigneeName() {
        return this.consigneeName;
    }

    public PurchaseOrderInfoDetail setConsigneeIdNumber(String consigneeIdNumber) {
        this.consigneeIdNumber = consigneeIdNumber;
        return this;
    }
    public String getConsigneeIdNumber() {
        return this.consigneeIdNumber;
    }

    public PurchaseOrderInfoDetail setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone;
        return this;
    }
    public String getConsigneePhone() {
        return this.consigneePhone;
    }

    public PurchaseOrderInfoDetail setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
        return this;
    }
    public String getConsigneeAddress() {
        return this.consigneeAddress;
    }

    public PurchaseOrderInfoDetail setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public PurchaseOrderInfoDetail setSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public String getSupplierId() {
        return this.supplierId;
    }

    public PurchaseOrderInfoDetail setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public PurchaseOrderInfoDetail setGoodsSkuId(Long goodsSkuId) {
        this.goodsSkuId = goodsSkuId;
        return this;
    }
    public Long getGoodsSkuId() {
        return this.goodsSkuId;
    }

    public PurchaseOrderInfoDetail setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

}
