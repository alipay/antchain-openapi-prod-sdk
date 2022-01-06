// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class DeleteSgCircuitbreakerrulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 服务id
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 熔断规则id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 租户id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static DeleteSgCircuitbreakerrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSgCircuitbreakerrulesRequest self = new DeleteSgCircuitbreakerrulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSgCircuitbreakerrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteSgCircuitbreakerrulesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteSgCircuitbreakerrulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public DeleteSgCircuitbreakerrulesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteSgCircuitbreakerrulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
