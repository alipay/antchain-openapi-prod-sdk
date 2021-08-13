// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpCopyrightRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 版权登记id
    @NameInMap("copyright_register_id")
    @Validation(required = true)
    public String copyrightRegisterId;

    public static QueryIpCopyrightRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIpCopyrightRequest self = new QueryIpCopyrightRequest();
        return TeaModel.build(map, self);
    }

    public QueryIpCopyrightRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIpCopyrightRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIpCopyrightRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public QueryIpCopyrightRequest setCopyrightRegisterId(String copyrightRegisterId) {
        this.copyrightRegisterId = copyrightRegisterId;
        return this;
    }
    public String getCopyrightRegisterId() {
        return this.copyrightRegisterId;
    }

}
