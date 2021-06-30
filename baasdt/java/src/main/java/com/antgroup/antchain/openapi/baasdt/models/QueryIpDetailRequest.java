// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpDetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础字段
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // ip的链上id列表
    @NameInMap("ip_ids")
    @Validation(required = true)
    public java.util.List<String> ipIds;

    // 查找不到的ip是否报错，默认false，会报错
    @NameInMap("skip_not_found_ip")
    public Boolean skipNotFoundIp;

    public static QueryIpDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIpDetailRequest self = new QueryIpDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryIpDetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIpDetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIpDetailRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public QueryIpDetailRequest setIpIds(java.util.List<String> ipIds) {
        this.ipIds = ipIds;
        return this;
    }
    public java.util.List<String> getIpIds() {
        return this.ipIds;
    }

    public QueryIpDetailRequest setSkipNotFoundIp(Boolean skipNotFoundIp) {
        this.skipNotFoundIp = skipNotFoundIp;
        return this;
    }
    public Boolean getSkipNotFoundIp() {
        return this.skipNotFoundIp;
    }

}
