// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SyncLeaseSupplierorderstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 订单采购状态，已取消[CANCEL，已拒收REFUSE_DELIVER，待发货TOBE_DELIVER，已退货RETURN_BACK]
    @NameInMap("supplier_status")
    @Validation(required = true)
    public String supplierStatus;

    // 租赁商家金融科技租户id
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    public static SyncLeaseSupplierorderstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncLeaseSupplierorderstatusRequest self = new SyncLeaseSupplierorderstatusRequest();
        return TeaModel.build(map, self);
    }

    public SyncLeaseSupplierorderstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncLeaseSupplierorderstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncLeaseSupplierorderstatusRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncLeaseSupplierorderstatusRequest setSupplierStatus(String supplierStatus) {
        this.supplierStatus = supplierStatus;
        return this;
    }
    public String getSupplierStatus() {
        return this.supplierStatus;
    }

    public SyncLeaseSupplierorderstatusRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

}
