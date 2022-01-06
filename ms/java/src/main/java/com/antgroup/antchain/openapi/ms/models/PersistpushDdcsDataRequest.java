// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class PersistpushDdcsDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名称，长度50以内
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 属性名称，长度50以内
    @NameInMap("attribute_name")
    @Validation(required = true)
    public String attributeName;

    // 实例标识，通常在中间件门户首页获取，长度50以内
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 操作人，可以定义为系统或者实际操作人，用于推送源追溯，长度50以内
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 机构名称，长度20以内
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 配置类名称，长度150以内
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // 推送值，长度10240以内
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static PersistpushDdcsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PersistpushDdcsDataRequest self = new PersistpushDdcsDataRequest();
        return TeaModel.build(map, self);
    }

    public PersistpushDdcsDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PersistpushDdcsDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PersistpushDdcsDataRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public PersistpushDdcsDataRequest setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public PersistpushDdcsDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PersistpushDdcsDataRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public PersistpushDdcsDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public PersistpushDdcsDataRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public PersistpushDdcsDataRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
