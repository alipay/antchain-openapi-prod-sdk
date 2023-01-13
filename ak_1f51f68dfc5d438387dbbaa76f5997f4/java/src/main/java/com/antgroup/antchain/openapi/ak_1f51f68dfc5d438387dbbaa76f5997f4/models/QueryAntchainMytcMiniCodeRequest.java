// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_1f51f68dfc5d438387dbbaa76f5997f4.models;

import com.aliyun.tea.*;

public class QueryAntchainMytcMiniCodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 溯源码
    @NameInMap("code")
    @Validation(required = true, maxLength = 160)
    public String code;

    // 用户信息
    @NameInMap("user_info")
    public ScanUserInfo userInfo;

    public static QueryAntchainMytcMiniCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainMytcMiniCodeRequest self = new QueryAntchainMytcMiniCodeRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainMytcMiniCodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainMytcMiniCodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainMytcMiniCodeRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAntchainMytcMiniCodeRequest setUserInfo(ScanUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ScanUserInfo getUserInfo() {
        return this.userInfo;
    }

}
