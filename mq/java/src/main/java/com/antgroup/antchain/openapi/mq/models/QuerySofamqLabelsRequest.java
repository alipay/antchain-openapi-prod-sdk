// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqLabelsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实例 ID（命名空间）
    @NameInMap("instance_id")
    public String instanceId;

    // 资源类型：TOPIC、GROUP
    @NameInMap("resource_type")
    public String resourceType;

    // 资源名，like _resource_name_ 匹配
    @NameInMap("resource_name")
    public String resourceName;

    // 标签 KEY
    @NameInMap("label_key")
    public String labelKey;

    // 标签值，like _label_value_ 匹配
    @NameInMap("label_value")
    @Validation(required = true)
    public String labelValue;

    public static QuerySofamqLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqLabelsRequest self = new QuerySofamqLabelsRequest();
        return TeaModel.build(map, self);
    }

    public QuerySofamqLabelsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySofamqLabelsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySofamqLabelsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySofamqLabelsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public QuerySofamqLabelsRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public QuerySofamqLabelsRequest setLabelKey(String labelKey) {
        this.labelKey = labelKey;
        return this;
    }
    public String getLabelKey() {
        return this.labelKey;
    }

    public QuerySofamqLabelsRequest setLabelValue(String labelValue) {
        this.labelValue = labelValue;
        return this;
    }
    public String getLabelValue() {
        return this.labelValue;
    }

}
