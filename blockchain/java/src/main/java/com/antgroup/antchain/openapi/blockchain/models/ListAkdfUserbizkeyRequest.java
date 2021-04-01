// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListAkdfUserbizkeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链id
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    public static ListAkdfUserbizkeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAkdfUserbizkeyRequest self = new ListAkdfUserbizkeyRequest();
        return TeaModel.build(map, self);
    }

    public ListAkdfUserbizkeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAkdfUserbizkeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListAkdfUserbizkeyRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
