// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ApplyLeaseSupplierorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 供应商id
    @NameInMap("supplier_id")
    @Validation(required = true)
    public String supplierId;

    // 商品信息
    @NameInMap("product_infos")
    @Validation(required = true)
    public java.util.List<ApplySupplierOrderProductInput> productInfos;

    public static ApplyLeaseSupplierorderRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyLeaseSupplierorderRequest self = new ApplyLeaseSupplierorderRequest();
        return TeaModel.build(map, self);
    }

    public ApplyLeaseSupplierorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyLeaseSupplierorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyLeaseSupplierorderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ApplyLeaseSupplierorderRequest setSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public String getSupplierId() {
        return this.supplierId;
    }

    public ApplyLeaseSupplierorderRequest setProductInfos(java.util.List<ApplySupplierOrderProductInput> productInfos) {
        this.productInfos = productInfos;
        return this;
    }
    public java.util.List<ApplySupplierOrderProductInput> getProductInfos() {
        return this.productInfos;
    }

}
