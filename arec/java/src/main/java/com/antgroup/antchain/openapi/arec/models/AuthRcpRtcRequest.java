// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class AuthRcpRtcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 申办业务号
    @NameInMap("apply_biz_id")
    @Validation(required = true)
    public String applyBizId;

    // 签署任务描述
    @NameInMap("sign_task_profile")
    @Validation(required = true)
    public SignTaskProfile signTaskProfile;

    public static AuthRcpRtcRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthRcpRtcRequest self = new AuthRcpRtcRequest();
        return TeaModel.build(map, self);
    }

    public AuthRcpRtcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthRcpRtcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthRcpRtcRequest setApplyBizId(String applyBizId) {
        this.applyBizId = applyBizId;
        return this;
    }
    public String getApplyBizId() {
        return this.applyBizId;
    }

    public AuthRcpRtcRequest setSignTaskProfile(SignTaskProfile signTaskProfile) {
        this.signTaskProfile = signTaskProfile;
        return this;
    }
    public SignTaskProfile getSignTaskProfile() {
        return this.signTaskProfile;
    }

}
