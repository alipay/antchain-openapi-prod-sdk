// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SendCollectorBychainidmulRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 上传数据
    // 
    // 
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<CollectContent> content;

    // 随机业务号，防重放
    // 
    // 
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    public static SendCollectorBychainidmulRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCollectorBychainidmulRequest self = new SendCollectorBychainidmulRequest();
        return TeaModel.build(map, self);
    }

    public SendCollectorBychainidmulRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendCollectorBychainidmulRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendCollectorBychainidmulRequest setContent(java.util.List<CollectContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<CollectContent> getContent() {
        return this.content;
    }

    public SendCollectorBychainidmulRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

}
