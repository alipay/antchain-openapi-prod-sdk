// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryThingsdidAsyncprocessRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要查询的实体Did，可为空
    @NameInMap("thing_did")
    public String thingDid;

    // 随机数唯一ID, 用以标识智能合约执行的索引交易ID，需要等于需要轮询的API的nonce
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    public static QueryThingsdidAsyncprocessRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryThingsdidAsyncprocessRequest self = new QueryThingsdidAsyncprocessRequest();
        return TeaModel.build(map, self);
    }

    public QueryThingsdidAsyncprocessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryThingsdidAsyncprocessRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryThingsdidAsyncprocessRequest setThingDid(String thingDid) {
        this.thingDid = thingDid;
        return this;
    }
    public String getThingDid() {
        return this.thingDid;
    }

    public QueryThingsdidAsyncprocessRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

}
