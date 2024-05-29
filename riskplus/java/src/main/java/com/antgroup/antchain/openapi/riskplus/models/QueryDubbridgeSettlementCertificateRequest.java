// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeSettlementCertificateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 授信/用信申请订单号
    @NameInMap("original_order_no")
    @Validation(required = true)
    public String originalOrderNo;

    // 开具类型，授信：01，提现：02
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    public static QueryDubbridgeSettlementCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeSettlementCertificateRequest self = new QueryDubbridgeSettlementCertificateRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeSettlementCertificateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeSettlementCertificateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeSettlementCertificateRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryDubbridgeSettlementCertificateRequest setOriginalOrderNo(String originalOrderNo) {
        this.originalOrderNo = originalOrderNo;
        return this;
    }
    public String getOriginalOrderNo() {
        return this.originalOrderNo;
    }

    public QueryDubbridgeSettlementCertificateRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
