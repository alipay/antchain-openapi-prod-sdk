// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class FinishLeaseSupplierstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 采购订单id，由采购平台生成
    @NameInMap("supplier_order_no")
    @Validation(required = true)
    public String supplierOrderNo;

    // 租赁订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 租赁方id，非采购平台
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    // 当前的采购状态
    @NameInMap("supplier_order_status")
    @Validation(required = true)
    public String supplierOrderStatus;

    // 物流订单id
    @NameInMap("supplier_logistic_info")
    @Validation(required = true)
    public SupplierLogisticInfo supplierLogisticInfo;

    // 采购平台回传的商品订单信息
    @NameInMap("supplier_order_product_infos")
    @Validation(required = true)
    public java.util.List<SupplierOrderProductInfo> supplierOrderProductInfos;

    // 供应商id
    @NameInMap("supplier_id")
    @Validation(required = true)
    public String supplierId;

    public static FinishLeaseSupplierstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishLeaseSupplierstatusRequest self = new FinishLeaseSupplierstatusRequest();
        return TeaModel.build(map, self);
    }

    public FinishLeaseSupplierstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FinishLeaseSupplierstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FinishLeaseSupplierstatusRequest setSupplierOrderNo(String supplierOrderNo) {
        this.supplierOrderNo = supplierOrderNo;
        return this;
    }
    public String getSupplierOrderNo() {
        return this.supplierOrderNo;
    }

    public FinishLeaseSupplierstatusRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public FinishLeaseSupplierstatusRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public FinishLeaseSupplierstatusRequest setSupplierOrderStatus(String supplierOrderStatus) {
        this.supplierOrderStatus = supplierOrderStatus;
        return this;
    }
    public String getSupplierOrderStatus() {
        return this.supplierOrderStatus;
    }

    public FinishLeaseSupplierstatusRequest setSupplierLogisticInfo(SupplierLogisticInfo supplierLogisticInfo) {
        this.supplierLogisticInfo = supplierLogisticInfo;
        return this;
    }
    public SupplierLogisticInfo getSupplierLogisticInfo() {
        return this.supplierLogisticInfo;
    }

    public FinishLeaseSupplierstatusRequest setSupplierOrderProductInfos(java.util.List<SupplierOrderProductInfo> supplierOrderProductInfos) {
        this.supplierOrderProductInfos = supplierOrderProductInfos;
        return this;
    }
    public java.util.List<SupplierOrderProductInfo> getSupplierOrderProductInfos() {
        return this.supplierOrderProductInfos;
    }

    public FinishLeaseSupplierstatusRequest setSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public String getSupplierId() {
        return this.supplierId;
    }

}
