// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class SwitchSwitchFirmidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 账号id
    @NameInMap("user_id")
    @Validation(required = true)
    public Long userId;

    // 企业id
    @NameInMap("firm_id")
    @Validation(required = true)
    public Long firmId;

    // 登录sessionId
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    public static SwitchSwitchFirmidRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchSwitchFirmidRequest self = new SwitchSwitchFirmidRequest();
        return TeaModel.build(map, self);
    }

    public SwitchSwitchFirmidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SwitchSwitchFirmidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SwitchSwitchFirmidRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public SwitchSwitchFirmidRequest setFirmId(Long firmId) {
        this.firmId = firmId;
        return this;
    }
    public Long getFirmId() {
        return this.firmId;
    }

    public SwitchSwitchFirmidRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
