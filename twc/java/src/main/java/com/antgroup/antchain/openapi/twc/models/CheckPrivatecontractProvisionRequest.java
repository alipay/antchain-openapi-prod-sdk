// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CheckPrivatecontractProvisionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 私有云合同服务实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static CheckPrivatecontractProvisionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckPrivatecontractProvisionRequest self = new CheckPrivatecontractProvisionRequest();
        return TeaModel.build(map, self);
    }

    public CheckPrivatecontractProvisionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckPrivatecontractProvisionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckPrivatecontractProvisionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
