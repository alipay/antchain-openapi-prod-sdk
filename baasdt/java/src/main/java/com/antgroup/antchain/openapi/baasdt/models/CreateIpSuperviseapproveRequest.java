// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateIpSuperviseapproveRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础字段
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 监修报审内容，业务相关字段自行组织成json，统一存储
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    public static CreateIpSuperviseapproveRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpSuperviseapproveRequest self = new CreateIpSuperviseapproveRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpSuperviseapproveRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateIpSuperviseapproveRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateIpSuperviseapproveRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public CreateIpSuperviseapproveRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateIpSuperviseapproveRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
