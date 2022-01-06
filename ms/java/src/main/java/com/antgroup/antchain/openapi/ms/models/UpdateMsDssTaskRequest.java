// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateMsDssTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("name")
    @Validation(required = true)
    public String name;

    @NameInMap("new_cron")
    public String newCron;

    @NameInMap("new_name")
    public String newName;

    @NameInMap("new_system")
    public String newSystem;

    public static UpdateMsDssTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsDssTaskRequest self = new UpdateMsDssTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMsDssTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMsDssTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateMsDssTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMsDssTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMsDssTaskRequest setNewCron(String newCron) {
        this.newCron = newCron;
        return this;
    }
    public String getNewCron() {
        return this.newCron;
    }

    public UpdateMsDssTaskRequest setNewName(String newName) {
        this.newName = newName;
        return this;
    }
    public String getNewName() {
        return this.newName;
    }

    public UpdateMsDssTaskRequest setNewSystem(String newSystem) {
        this.newSystem = newSystem;
        return this;
    }
    public String getNewSystem() {
        return this.newSystem;
    }

}
