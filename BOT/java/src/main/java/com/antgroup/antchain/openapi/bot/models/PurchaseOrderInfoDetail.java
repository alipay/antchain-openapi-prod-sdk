// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PurchaseOrderInfoDetail extends TeaModel {
    // 租赁订单号
    // 
    /**
     * <strong>example:</strong>
     * <p>dadadasda</p>
     */
    @NameInMap("order_number")
    @Validation(required = true)
    public String orderNumber;

    // 收货人姓名
    // 
    /**
     * <strong>example:</strong>
     * <p>立敢</p>
     */
    @NameInMap("consignee_name")
    @Validation(required = true)
    public String consigneeName;

    // 收货人身份证号
    /**
     * <strong>example:</strong>
     * <p>424234324324234</p>
     */
    @NameInMap("consignee_id_number")
    @Validation(required = true)
    public String consigneeIdNumber;

    // 收货人手机号
    // 
    /**
     * <strong>example:</strong>
     * <p>13400113344</p>
     */
    @NameInMap("consignee_phone")
    @Validation(required = true)
    public String consigneePhone;

    // 收货人地址
    /**
     * <strong>example:</strong>
     * <p>北京市海淀区XXXXXXXX</p>
     */
    @NameInMap("consignee_address")
    @Validation(required = true)
    public String consigneeAddress;

    // 供货商名称
    // 
    /**
     * <strong>example:</strong>
     * <p>fsafsafaf</p>
     */
    @NameInMap("supplier_name")
    @Validation(required = true)
    public String supplierName;

    // 供货商租户id
    // 
    /**
     * <strong>example:</strong>
     * <p>fsffafaf</p>
     */
    @NameInMap("supplier_id")
    @Validation(required = true)
    public String supplierId;

    // 采购商id
    // 
    /**
     * <strong>example:</strong>
     * <p>fafsafaf</p>
     */
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    // 商品信息列表
    @NameInMap("goods_id_and_count")
    @Validation(required = true)
    public java.util.List<GoodsIdAndCount> goodsIdAndCount;

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

    public PurchaseOrderInfoDetail setGoodsIdAndCount(java.util.List<GoodsIdAndCount> goodsIdAndCount) {
        this.goodsIdAndCount = goodsIdAndCount;
        return this;
    }
    public java.util.List<GoodsIdAndCount> getGoodsIdAndCount() {
        return this.goodsIdAndCount;
    }

}
