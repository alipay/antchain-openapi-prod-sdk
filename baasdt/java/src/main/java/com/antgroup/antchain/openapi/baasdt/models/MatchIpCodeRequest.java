// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class MatchIpCodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 用户ID，logon_id、user_id必填一个
    @NameInMap("user_id")
    public String userId;

    // 支付宝登录ID，logon_id、user_id必填一个
    @NameInMap("logon_id")
    public String logonId;

    // uni码，支持unicode、原始码、加密码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    public static MatchIpCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        MatchIpCodeRequest self = new MatchIpCodeRequest();
        return TeaModel.build(map, self);
    }

    public MatchIpCodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public MatchIpCodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public MatchIpCodeRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public MatchIpCodeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public MatchIpCodeRequest setLogonId(String logonId) {
        this.logonId = logonId;
        return this;
    }
    public String getLogonId() {
        return this.logonId;
    }

    public MatchIpCodeRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
