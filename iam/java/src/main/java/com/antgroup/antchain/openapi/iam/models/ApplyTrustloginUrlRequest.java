// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class ApplyTrustloginUrlRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 	跳转地址
    @NameInMap("goto_url")
    @Validation(required = true)
    public String gotoUrl;

    // 	操作员id
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    public static ApplyTrustloginUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyTrustloginUrlRequest self = new ApplyTrustloginUrlRequest();
        return TeaModel.build(map, self);
    }

    public ApplyTrustloginUrlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyTrustloginUrlRequest setGotoUrl(String gotoUrl) {
        this.gotoUrl = gotoUrl;
        return this;
    }
    public String getGotoUrl() {
        return this.gotoUrl;
    }

    public ApplyTrustloginUrlRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

}
