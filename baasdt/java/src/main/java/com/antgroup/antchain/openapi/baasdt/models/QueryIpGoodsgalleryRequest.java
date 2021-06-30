// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpGoodsgalleryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 账户链上ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // IP链上ID，只有版权方可以根据IPID查询图库信息
    @NameInMap("ip_id")
    public String ipId;

    // IP授权订单ID，版权方和商家均可根据订单ID查询图库信息
    @NameInMap("ip_order_id")
    public String ipOrderId;

    public static QueryIpGoodsgalleryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIpGoodsgalleryRequest self = new QueryIpGoodsgalleryRequest();
        return TeaModel.build(map, self);
    }

    public QueryIpGoodsgalleryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIpGoodsgalleryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIpGoodsgalleryRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public QueryIpGoodsgalleryRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public QueryIpGoodsgalleryRequest setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public QueryIpGoodsgalleryRequest setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

}
