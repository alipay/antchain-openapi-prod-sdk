// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class VerifyContractTextsignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 注册的平台方用户id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 签名原文本
    @NameInMap("origin_text")
    @Validation(required = true)
    public String originText;

    // 文本签名值
    @NameInMap("sign_result")
    @Validation(required = true)
    public String signResult;

    public static VerifyContractTextsignRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyContractTextsignRequest self = new VerifyContractTextsignRequest();
        return TeaModel.build(map, self);
    }

    public VerifyContractTextsignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyContractTextsignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyContractTextsignRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public VerifyContractTextsignRequest setOriginText(String originText) {
        this.originText = originText;
        return this;
    }
    public String getOriginText() {
        return this.originText;
    }

    public VerifyContractTextsignRequest setSignResult(String signResult) {
        this.signResult = signResult;
        return this;
    }
    public String getSignResult() {
        return this.signResult;
    }

}
