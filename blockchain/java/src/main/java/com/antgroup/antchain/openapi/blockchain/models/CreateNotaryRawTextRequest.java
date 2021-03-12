// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateNotaryRawTextRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 如果已经在链上有账户，可以直接使用已有的账户进行存证。如果为空，服务端会在链上创建一个
    @NameInMap("account_id")
    public String accountId;

    // 链的唯一性标示，请联系baas平台获取
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 存证内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static CreateNotaryRawTextRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNotaryRawTextRequest self = new CreateNotaryRawTextRequest();
        return TeaModel.build(map, self);
    }

    public CreateNotaryRawTextRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateNotaryRawTextRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateNotaryRawTextRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateNotaryRawTextRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public CreateNotaryRawTextRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
