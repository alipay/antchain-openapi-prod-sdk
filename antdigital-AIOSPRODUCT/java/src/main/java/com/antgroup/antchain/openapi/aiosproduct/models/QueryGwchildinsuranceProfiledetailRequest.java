// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiosproduct.models;

import com.aliyun.tea.*;

public class QueryGwchildinsuranceProfiledetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当前联调租户；必须精确命中 finaigateway 发布白名单
    @NameInMap("tenanat_id")
    @Validation(required = true)
    public String tenanatId;

    // 当前用户，最大 64 字符
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 当前会话，最大 64 字符
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    public static QueryGwchildinsuranceProfiledetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGwchildinsuranceProfiledetailRequest self = new QueryGwchildinsuranceProfiledetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryGwchildinsuranceProfiledetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGwchildinsuranceProfiledetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGwchildinsuranceProfiledetailRequest setTenanatId(String tenanatId) {
        this.tenanatId = tenanatId;
        return this;
    }
    public String getTenanatId() {
        return this.tenanatId;
    }

    public QueryGwchildinsuranceProfiledetailRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryGwchildinsuranceProfiledetailRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
