// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class SetSgCircuitbreakerrulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 服务id
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 规则id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 租户id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 运行模式
    @NameInMap("mode")
    @Validation(required = true)
    public String mode;

    public static SetSgCircuitbreakerrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSgCircuitbreakerrulesRequest self = new SetSgCircuitbreakerrulesRequest();
        return TeaModel.build(map, self);
    }

    public SetSgCircuitbreakerrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetSgCircuitbreakerrulesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetSgCircuitbreakerrulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public SetSgCircuitbreakerrulesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SetSgCircuitbreakerrulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetSgCircuitbreakerrulesRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
