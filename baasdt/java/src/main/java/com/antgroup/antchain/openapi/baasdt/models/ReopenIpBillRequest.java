// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ReopenIpBillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 账单ID
    @NameInMap("ip_bill_id")
    @Validation(required = true)
    public String ipBillId;

    public static ReopenIpBillRequest build(java.util.Map<String, ?> map) throws Exception {
        ReopenIpBillRequest self = new ReopenIpBillRequest();
        return TeaModel.build(map, self);
    }

    public ReopenIpBillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReopenIpBillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReopenIpBillRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public ReopenIpBillRequest setIpBillId(String ipBillId) {
        this.ipBillId = ipBillId;
        return this;
    }
    public String getIpBillId() {
        return this.ipBillId;
    }

}
