// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSofamqLabelsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实例 ID（命名空间）
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 资源类型：TOPIC、GROUP
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // 资源名
    @NameInMap("resource_name")
    @Validation(required = true)
    public String resourceName;

    // 标签
    @NameInMap("labels")
    @Validation(required = true)
    public java.util.List<String> labels;

    public static CreateSofamqLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSofamqLabelsRequest self = new CreateSofamqLabelsRequest();
        return TeaModel.build(map, self);
    }

    public CreateSofamqLabelsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSofamqLabelsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSofamqLabelsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSofamqLabelsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateSofamqLabelsRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public CreateSofamqLabelsRequest setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

}
