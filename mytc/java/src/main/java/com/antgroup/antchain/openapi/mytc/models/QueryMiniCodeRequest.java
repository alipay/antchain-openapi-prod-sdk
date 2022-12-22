// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class QueryMiniCodeRequest extends TeaModel {
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

    public static QueryMiniCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMiniCodeRequest self = new QueryMiniCodeRequest();
        return TeaModel.build(map, self);
    }

    public QueryMiniCodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMiniCodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMiniCodeRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMiniCodeRequest setUserInfo(ScanUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ScanUserInfo getUserInfo() {
        return this.userInfo;
    }

}
