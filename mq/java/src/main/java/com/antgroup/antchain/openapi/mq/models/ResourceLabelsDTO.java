// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ResourceLabelsDTO extends TeaModel {
    // 实例 ID（命名空间）
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 资源类型：TOPIC、GROUP
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // 资源名字
    @NameInMap("resource_name")
    @Validation(required = true)
    public String resourceName;

    // 标签
    @NameInMap("labels")
    @Validation(required = true)
    public java.util.List<String> labels;

    public static ResourceLabelsDTO build(java.util.Map<String, ?> map) throws Exception {
        ResourceLabelsDTO self = new ResourceLabelsDTO();
        return TeaModel.build(map, self);
    }

    public ResourceLabelsDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResourceLabelsDTO setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ResourceLabelsDTO setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ResourceLabelsDTO setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

}
