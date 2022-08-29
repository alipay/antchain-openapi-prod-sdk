// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetContractTextsignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 平台方注册的用户ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 待签名的原文本
    @NameInMap("origin_text")
    @Validation(required = true)
    public String originText;

    public static GetContractTextsignRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContractTextsignRequest self = new GetContractTextsignRequest();
        return TeaModel.build(map, self);
    }

    public GetContractTextsignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetContractTextsignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetContractTextsignRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetContractTextsignRequest setOriginText(String originText) {
        this.originText = originText;
        return this;
    }
    public String getOriginText() {
        return this.originText;
    }

}
