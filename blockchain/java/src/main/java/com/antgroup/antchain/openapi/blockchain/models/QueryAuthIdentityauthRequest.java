// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthIdentityauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权宝生成的bizId 与 核身token 用 ; 拼接成的字符串
    @NameInMap("security_id")
    @Validation(required = true)
    public String securityId;

    // 核身的userid
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 核身对应的操作类型，目前只有0，代表创建did
    @NameInMap("operation_type")
    @Validation(required = true)
    public Long operationType;

    // 其它类型操作时的参数，json形式字符串
    @NameInMap("params")
    public String params;

    public static QueryAuthIdentityauthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthIdentityauthRequest self = new QueryAuthIdentityauthRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthIdentityauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAuthIdentityauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAuthIdentityauthRequest setSecurityId(String securityId) {
        this.securityId = securityId;
        return this;
    }
    public String getSecurityId() {
        return this.securityId;
    }

    public QueryAuthIdentityauthRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryAuthIdentityauthRequest setOperationType(Long operationType) {
        this.operationType = operationType;
        return this;
    }
    public Long getOperationType() {
        return this.operationType;
    }

    public QueryAuthIdentityauthRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
