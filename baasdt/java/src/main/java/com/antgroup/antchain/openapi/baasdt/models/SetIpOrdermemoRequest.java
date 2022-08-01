// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SetIpOrdermemoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 订单ID
    @NameInMap("ip_order_id")
    @Validation(required = true)
    public String ipOrderId;

    // 备注信息
    @NameInMap("memo")
    @Validation(required = true)
    public String memo;

    // 更新订单功能 0 基础功能，1 领用收藏，2持有流转等
    @NameInMap("features")
    public java.util.List<Long> features;

    // 订单ID列表-更新订单功能使用
    @NameInMap("order_ids")
    public java.util.List<String> orderIds;

    public static SetIpOrdermemoRequest build(java.util.Map<String, ?> map) throws Exception {
        SetIpOrdermemoRequest self = new SetIpOrdermemoRequest();
        return TeaModel.build(map, self);
    }

    public SetIpOrdermemoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetIpOrdermemoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetIpOrdermemoRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public SetIpOrdermemoRequest setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public SetIpOrdermemoRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public SetIpOrdermemoRequest setFeatures(java.util.List<Long> features) {
        this.features = features;
        return this;
    }
    public java.util.List<Long> getFeatures() {
        return this.features;
    }

    public SetIpOrdermemoRequest setOrderIds(java.util.List<String> orderIds) {
        this.orderIds = orderIds;
        return this;
    }
    public java.util.List<String> getOrderIds() {
        return this.orderIds;
    }

}
