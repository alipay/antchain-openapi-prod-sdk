// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ApplySupplierOrderProductOutput extends TeaModel {
    // 订单id
    /**
     * <strong>example:</strong>
     * <p>2020223123</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 链上采购单id
    /**
     * <strong>example:</strong>
     * <p>23042340234234</p>
     */
    @NameInMap("pur_order_id")
    @Validation(required = true)
    public String purOrderId;

    // 待采购：READY_DELIVER
    // 已采购：DELIVERED
    // 已拒发：REJECTED
    // 已退货：RETURNED
    // 已取消：CANCELED
    /**
     * <strong>example:</strong>
     * <p>链上采购状态</p>
     */
    @NameInMap("pur_order_status")
    @Validation(required = true)
    public String purOrderStatus;

    // 供应商id
    /**
     * <strong>example:</strong>
     * <p>ABCDEFGH</p>
     */
    @NameInMap("supplier_id")
    public String supplierId;

    public static ApplySupplierOrderProductOutput build(java.util.Map<String, ?> map) throws Exception {
        ApplySupplierOrderProductOutput self = new ApplySupplierOrderProductOutput();
        return TeaModel.build(map, self);
    }

    public ApplySupplierOrderProductOutput setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ApplySupplierOrderProductOutput setPurOrderId(String purOrderId) {
        this.purOrderId = purOrderId;
        return this;
    }
    public String getPurOrderId() {
        return this.purOrderId;
    }

    public ApplySupplierOrderProductOutput setPurOrderStatus(String purOrderStatus) {
        this.purOrderStatus = purOrderStatus;
        return this;
    }
    public String getPurOrderStatus() {
        return this.purOrderStatus;
    }

    public ApplySupplierOrderProductOutput setSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public String getSupplierId() {
        return this.supplierId;
    }

}
