// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateFileIntegrationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证链路的统一Id，全局唯一
    @NameInMap("transaction_id")
    @Validation(required = true)
    public String transactionId;

    // 描述本条存证在存证事务中的阶段，用户可自行维护
    @NameInMap("phase")
    @Validation(required = true)
    public String phase;

    // 存证类型为文本哈希时的哈希算法，目前仅支持SHA256
    @NameInMap("hash_algorithm")
    public String hashAlgorithm;

    public static CreateFileIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileIntegrationRequest self = new CreateFileIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileIntegrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateFileIntegrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateFileIntegrationRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public CreateFileIntegrationRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public CreateFileIntegrationRequest setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }
    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

}
