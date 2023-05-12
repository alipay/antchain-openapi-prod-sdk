// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class GetTransactionsCorrectionsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 记录id
    @NameInMap("correction_id")
    @Validation(required = true)
    public Long correctionId;

    // 环境唯一标识
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static GetTransactionsCorrectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTransactionsCorrectionsRequest self = new GetTransactionsCorrectionsRequest();
        return TeaModel.build(map, self);
    }

    public GetTransactionsCorrectionsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTransactionsCorrectionsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetTransactionsCorrectionsRequest setCorrectionId(Long correctionId) {
        this.correctionId = correctionId;
        return this;
    }
    public Long getCorrectionId() {
        return this.correctionId;
    }

    public GetTransactionsCorrectionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
