// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ImportPurchaseorderThirdpartyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租赁订单号
    @NameInMap("order_number")
    @Validation(required = true)
    public String orderNumber;

    // 收货人姓名
    @NameInMap("consignee_name")
    @Validation(required = true)
    public String consigneeName;

    // 收货人身份证号
    @NameInMap("consignee_id_number")
    @Validation(required = true)
    public String consigneeIdNumber;

    // 收货人手机号
    @NameInMap("consignee_phone")
    @Validation(required = true)
    public String consigneePhone;

    // 收货人地址
    @NameInMap("consignee_address")
    @Validation(required = true)
    public String consigneeAddress;

    // 供货商名称
    @NameInMap("supplier_name")
    @Validation(required = true)
    public String supplierName;

    // 供货商租户id
    @NameInMap("supplier_id")
    @Validation(required = true)
    public String supplierId;

    // 采购商租户id
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    // 商品信息列表
    @NameInMap("goods_list")
    @Validation(required = true)
    public java.util.List<GoodsIdAndCount> goodsList;

    // 幂等号
    @NameInMap("idempot_id")
    @Validation(required = true)
    public String idempotId;

    public static ImportPurchaseorderThirdpartyRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportPurchaseorderThirdpartyRequest self = new ImportPurchaseorderThirdpartyRequest();
        return TeaModel.build(map, self);
    }

    public ImportPurchaseorderThirdpartyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportPurchaseorderThirdpartyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportPurchaseorderThirdpartyRequest setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    public String getOrderNumber() {
        return this.orderNumber;
    }

    public ImportPurchaseorderThirdpartyRequest setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
        return this;
    }
    public String getConsigneeName() {
        return this.consigneeName;
    }

    public ImportPurchaseorderThirdpartyRequest setConsigneeIdNumber(String consigneeIdNumber) {
        this.consigneeIdNumber = consigneeIdNumber;
        return this;
    }
    public String getConsigneeIdNumber() {
        return this.consigneeIdNumber;
    }

    public ImportPurchaseorderThirdpartyRequest setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone;
        return this;
    }
    public String getConsigneePhone() {
        return this.consigneePhone;
    }

    public ImportPurchaseorderThirdpartyRequest setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
        return this;
    }
    public String getConsigneeAddress() {
        return this.consigneeAddress;
    }

    public ImportPurchaseorderThirdpartyRequest setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public ImportPurchaseorderThirdpartyRequest setSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public String getSupplierId() {
        return this.supplierId;
    }

    public ImportPurchaseorderThirdpartyRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public ImportPurchaseorderThirdpartyRequest setGoodsList(java.util.List<GoodsIdAndCount> goodsList) {
        this.goodsList = goodsList;
        return this;
    }
    public java.util.List<GoodsIdAndCount> getGoodsList() {
        return this.goodsList;
    }

    public ImportPurchaseorderThirdpartyRequest setIdempotId(String idempotId) {
        this.idempotId = idempotId;
        return this;
    }
    public String getIdempotId() {
        return this.idempotId;
    }

}
