// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAccountMappingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 要映射的链对应的唯一id
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 自有系统中该账户唯一标示
    @NameInMap("uid")
    @Validation(required = true)
    public String uid;

    public static QueryAccountMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountMappingRequest self = new QueryAccountMappingRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccountMappingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAccountMappingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAccountMappingRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public QueryAccountMappingRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
