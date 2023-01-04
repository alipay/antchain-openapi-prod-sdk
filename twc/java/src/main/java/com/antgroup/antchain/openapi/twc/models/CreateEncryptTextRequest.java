// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateEncryptTextRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户本地加密后的存证内容
    @NameInMap("notary_content")
    @Validation(required = true)
    public String notaryContent;

    // 存证阶段
    @NameInMap("phase")
    @Validation(required = true)
    public String phase;

    // 存证事务id
    @NameInMap("transaction_id")
    @Validation(required = true)
    public String transactionId;

    // 存证拓展信息
    @NameInMap("properties")
    public String properties;

    // 存证类型，支持
    // ● TEXT_HASH：文本哈希
    // ● TEXT_RAW：源文本（默认）
    @NameInMap("text_notary_type")
    public String textNotaryType;

    // 哈希算法，当存证类型为TEXT_HASH时必填，目前支持两种
    // ● SHA256
    // ● SM3
    @NameInMap("hash_algorithm")
    public String hashAlgorithm;

    public static CreateEncryptTextRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEncryptTextRequest self = new CreateEncryptTextRequest();
        return TeaModel.build(map, self);
    }

    public CreateEncryptTextRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateEncryptTextRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateEncryptTextRequest setNotaryContent(String notaryContent) {
        this.notaryContent = notaryContent;
        return this;
    }
    public String getNotaryContent() {
        return this.notaryContent;
    }

    public CreateEncryptTextRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public CreateEncryptTextRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public CreateEncryptTextRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public CreateEncryptTextRequest setTextNotaryType(String textNotaryType) {
        this.textNotaryType = textNotaryType;
        return this;
    }
    public String getTextNotaryType() {
        return this.textNotaryType;
    }

    public CreateEncryptTextRequest setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }
    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

}
