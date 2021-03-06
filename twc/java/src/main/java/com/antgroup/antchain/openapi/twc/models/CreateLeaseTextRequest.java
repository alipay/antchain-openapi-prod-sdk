// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseTextRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 哈希算法，目前仅支持 SHA256
    @NameInMap("hash_algorithm")
    public String hashAlgorithm;

    // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
    @NameInMap("location")
    public Location location;

    // 存证内容
    @NameInMap("notary_content")
    @Validation(required = true)
    public String notaryContent;

    // 描述本条存证在存证事务中的阶段，用户可自行维护
    @NameInMap("phase")
    @Validation(required = true)
    public String phase;

    // 扩展属性
    @NameInMap("properties")
    public String properties;

    // 文本存证类型，支持源文本/文本哈希
    @NameInMap("text_notary_type")
    public String textNotaryType;

    // 存证事务id
    @NameInMap("transaction_id")
    @Validation(required = true)
    public String transactionId;

    public static CreateLeaseTextRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseTextRequest self = new CreateLeaseTextRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseTextRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseTextRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseTextRequest setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }
    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public CreateLeaseTextRequest setLocation(Location location) {
        this.location = location;
        return this;
    }
    public Location getLocation() {
        return this.location;
    }

    public CreateLeaseTextRequest setNotaryContent(String notaryContent) {
        this.notaryContent = notaryContent;
        return this;
    }
    public String getNotaryContent() {
        return this.notaryContent;
    }

    public CreateLeaseTextRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public CreateLeaseTextRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public CreateLeaseTextRequest setTextNotaryType(String textNotaryType) {
        this.textNotaryType = textNotaryType;
        return this;
    }
    public String getTextNotaryType() {
        return this.textNotaryType;
    }

    public CreateLeaseTextRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
