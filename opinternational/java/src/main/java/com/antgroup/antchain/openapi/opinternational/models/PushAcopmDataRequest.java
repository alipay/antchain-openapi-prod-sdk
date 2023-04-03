// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.opinternational.models;

import com.aliyun.tea.*;

public class PushAcopmDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // executor type
    @NameInMap("executor_type")
    @Validation(required = true)
    public String executorType;

    // 数据类型
    @NameInMap("method_type")
    @Validation(required = true)
    public String methodType;

    // data content
    @NameInMap("data_content")
    @Validation(required = true)
    public String dataContent;

    public static PushAcopmDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PushAcopmDataRequest self = new PushAcopmDataRequest();
        return TeaModel.build(map, self);
    }

    public PushAcopmDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushAcopmDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushAcopmDataRequest setExecutorType(String executorType) {
        this.executorType = executorType;
        return this;
    }
    public String getExecutorType() {
        return this.executorType;
    }

    public PushAcopmDataRequest setMethodType(String methodType) {
        this.methodType = methodType;
        return this;
    }
    public String getMethodType() {
        return this.methodType;
    }

    public PushAcopmDataRequest setDataContent(String dataContent) {
        this.dataContent = dataContent;
        return this;
    }
    public String getDataContent() {
        return this.dataContent;
    }

}
