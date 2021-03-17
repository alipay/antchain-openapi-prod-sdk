// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseSupplierinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租赁方及资方定义的合约id
    @NameInMap("application_id")
    @Validation(required = true)
    public String applicationId;

    // 额外字段定义
    @NameInMap("extra_info")
    public String extraInfo;

    // 供应商发货的物流单号
    @NameInMap("logistics_order_id")
    @Validation(required = true)
    public String logisticsOrderId;

    // 用户的租赁订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 额外字段定义对应的阶段，请咨询对应的资方
    @NameInMap("phase")
    @Validation(required = true)
    public String phase;

    // 采购订单id
    @NameInMap("purchase_order_id")
    @Validation(required = true)
    public String purchaseOrderId;

    // 产品详细信息
    @NameInMap("supplier_product_list")
    @Validation(required = true)
    public java.util.List<SupplierProductInfo> supplierProductList;

    // 1自有物流 2顺丰
    @NameInMap("maintained_by_supplier")
    @Validation(required = true)
    public Long maintainedBySupplier;

    // 发货时间
    @NameInMap("deliver_time")
    @Validation(required = true)
    public String deliverTime;

    public static CreateLeaseSupplierinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseSupplierinfoRequest self = new CreateLeaseSupplierinfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseSupplierinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseSupplierinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseSupplierinfoRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateLeaseSupplierinfoRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CreateLeaseSupplierinfoRequest setLogisticsOrderId(String logisticsOrderId) {
        this.logisticsOrderId = logisticsOrderId;
        return this;
    }
    public String getLogisticsOrderId() {
        return this.logisticsOrderId;
    }

    public CreateLeaseSupplierinfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateLeaseSupplierinfoRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public CreateLeaseSupplierinfoRequest setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
        return this;
    }
    public String getPurchaseOrderId() {
        return this.purchaseOrderId;
    }

    public CreateLeaseSupplierinfoRequest setSupplierProductList(java.util.List<SupplierProductInfo> supplierProductList) {
        this.supplierProductList = supplierProductList;
        return this;
    }
    public java.util.List<SupplierProductInfo> getSupplierProductList() {
        return this.supplierProductList;
    }

    public CreateLeaseSupplierinfoRequest setMaintainedBySupplier(Long maintainedBySupplier) {
        this.maintainedBySupplier = maintainedBySupplier;
        return this;
    }
    public Long getMaintainedBySupplier() {
        return this.maintainedBySupplier;
    }

    public CreateLeaseSupplierinfoRequest setDeliverTime(String deliverTime) {
        this.deliverTime = deliverTime;
        return this;
    }
    public String getDeliverTime() {
        return this.deliverTime;
    }

}
