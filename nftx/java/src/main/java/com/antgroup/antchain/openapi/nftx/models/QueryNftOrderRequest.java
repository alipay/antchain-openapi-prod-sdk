// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class QueryNftOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝的2088账号
    @NameInMap("id_no")
    @Validation(required = true)
    public String idNo;

    // 支付账号类型，该版本仅支持支付宝账号
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    // 租户的唯一映射订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    public static QueryNftOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNftOrderRequest self = new QueryNftOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryNftOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryNftOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryNftOrderRequest setIdNo(String idNo) {
        this.idNo = idNo;
        return this;
    }
    public String getIdNo() {
        return this.idNo;
    }

    public QueryNftOrderRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public QueryNftOrderRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

}
