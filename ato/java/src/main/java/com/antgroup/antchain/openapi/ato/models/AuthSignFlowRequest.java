// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class AuthSignFlowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签署的电子合同ID
    @NameInMap("sign_no")
    @Validation(required = true, maxLength = 64, minLength = 6)
    public String signNo;

    // 签署区域的tag，和发起签署流程的机构的tag对应。
    @NameInMap("tag")
    @Validation(maxLength = 32, minLength = 2)
    public String tag;

    // 电子合同签署服务返回的biz_flow_id
    @NameInMap("biz_flow_id")
    @Validation(maxLength = 64, minLength = 4)
    public String bizFlowId;

    // 电子合同签署服务的返回的account_id
    @NameInMap("account_id")
    @Validation(maxLength = 64, minLength = 4)
    public String accountId;

    public static AuthSignFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthSignFlowRequest self = new AuthSignFlowRequest();
        return TeaModel.build(map, self);
    }

    public AuthSignFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthSignFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthSignFlowRequest setSignNo(String signNo) {
        this.signNo = signNo;
        return this;
    }
    public String getSignNo() {
        return this.signNo;
    }

    public AuthSignFlowRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public AuthSignFlowRequest setBizFlowId(String bizFlowId) {
        this.bizFlowId = bizFlowId;
        return this;
    }
    public String getBizFlowId() {
        return this.bizFlowId;
    }

    public AuthSignFlowRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
