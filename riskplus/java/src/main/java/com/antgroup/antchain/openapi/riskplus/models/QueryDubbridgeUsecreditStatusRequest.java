// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeUsecreditStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求网络流水号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 1：现金贷（默认）
    // 2：分期付
    @NameInMap("prod_type")
    public String prodType;

    // 天枢系统用信申请的订单号
    @NameInMap("original_order_no")
    public String originalOrderNo;

    // 购物订单号，如二轮车/摩托车订单号
    @NameInMap("biz_order_no")
    public String bizOrderNo;

    public static QueryDubbridgeUsecreditStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeUsecreditStatusRequest self = new QueryDubbridgeUsecreditStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeUsecreditStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeUsecreditStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeUsecreditStatusRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryDubbridgeUsecreditStatusRequest setProdType(String prodType) {
        this.prodType = prodType;
        return this;
    }
    public String getProdType() {
        return this.prodType;
    }

    public QueryDubbridgeUsecreditStatusRequest setOriginalOrderNo(String originalOrderNo) {
        this.originalOrderNo = originalOrderNo;
        return this;
    }
    public String getOriginalOrderNo() {
        return this.originalOrderNo;
    }

    public QueryDubbridgeUsecreditStatusRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

}
