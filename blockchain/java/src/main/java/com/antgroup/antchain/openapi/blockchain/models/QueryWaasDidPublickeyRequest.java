// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryWaasDidPublickeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户数字身份ID
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 公钥id
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    public static QueryWaasDidPublickeyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWaasDidPublickeyRequest self = new QueryWaasDidPublickeyRequest();
        return TeaModel.build(map, self);
    }

    public QueryWaasDidPublickeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWaasDidPublickeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryWaasDidPublickeyRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryWaasDidPublickeyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

}
