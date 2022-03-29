// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSofamqInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实例名称，长度为 3-64，取值可为中英文
    @NameInMap("instance_name")
    @Validation(required = true)
    public String instanceName;

    // 备注信息
    @NameInMap("remark")
    public String remark;

    public static CreateSofamqInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSofamqInstanceRequest self = new CreateSofamqInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSofamqInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSofamqInstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSofamqInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateSofamqInstanceRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
