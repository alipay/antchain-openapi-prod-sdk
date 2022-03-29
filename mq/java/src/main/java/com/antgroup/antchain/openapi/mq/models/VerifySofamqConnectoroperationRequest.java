// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class VerifySofamqConnectoroperationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务名称
    @NameInMap("job")
    @Validation(required = true)
    public String job;

    public static VerifySofamqConnectoroperationRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifySofamqConnectoroperationRequest self = new VerifySofamqConnectoroperationRequest();
        return TeaModel.build(map, self);
    }

    public VerifySofamqConnectoroperationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifySofamqConnectoroperationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifySofamqConnectoroperationRequest setJob(String job) {
        this.job = job;
        return this;
    }
    public String getJob() {
        return this.job;
    }

}
