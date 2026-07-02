// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryThingsdidDidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询请求结构体，参考结构体定义
    @NameInMap("base_query_req")
    @Validation(required = true)
    public DidBaseQueryReq baseQueryReq;

    // 唯一交易ID
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    public static QueryThingsdidDidRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryThingsdidDidRequest self = new QueryThingsdidDidRequest();
        return TeaModel.build(map, self);
    }

    public QueryThingsdidDidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryThingsdidDidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryThingsdidDidRequest setBaseQueryReq(DidBaseQueryReq baseQueryReq) {
        this.baseQueryReq = baseQueryReq;
        return this;
    }
    public DidBaseQueryReq getBaseQueryReq() {
        return this.baseQueryReq;
    }

    public QueryThingsdidDidRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

}
