// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddMsDssTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("cron")
    @Validation(required = true)
    public String cron;

    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("name")
    @Validation(required = true)
    public String name;

    @NameInMap("system")
    @Validation(required = true)
    public String system;

    public static AddMsDssTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMsDssTaskRequest self = new AddMsDssTaskRequest();
        return TeaModel.build(map, self);
    }

    public AddMsDssTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddMsDssTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddMsDssTaskRequest setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public AddMsDssTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddMsDssTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddMsDssTaskRequest setSystem(String system) {
        this.system = system;
        return this;
    }
    public String getSystem() {
        return this.system;
    }

}
