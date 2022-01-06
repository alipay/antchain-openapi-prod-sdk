// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateDdsJobStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // middleware instance id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // job id
    @NameInMap("id")
    @Validation(required = true)
    public Integer id;

    // 任务状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static UpdateDdsJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDdsJobStatusRequest self = new UpdateDdsJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDdsJobStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDdsJobStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDdsJobStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDdsJobStatusRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public UpdateDdsJobStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
