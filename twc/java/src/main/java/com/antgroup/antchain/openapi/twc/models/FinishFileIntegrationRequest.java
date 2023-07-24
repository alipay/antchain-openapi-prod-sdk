// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class FinishFileIntegrationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件一体化存储id，全局唯一
    @NameInMap("object_name")
    @Validation(required = true)
    public String objectName;

    public static FinishFileIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishFileIntegrationRequest self = new FinishFileIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public FinishFileIntegrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FinishFileIntegrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FinishFileIntegrationRequest setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

}
