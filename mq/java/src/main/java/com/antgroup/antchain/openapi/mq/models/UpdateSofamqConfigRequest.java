// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateSofamqConfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 目标名
    @NameInMap("target_name")
    @Validation(required = true)
    public String targetName;

    // 目标类型
    @NameInMap("target_type")
    @Validation(required = true)
    public Long targetType;

    // 配置名
    @NameInMap("property")
    @Validation(required = true)
    public String property;

    // 配置值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static UpdateSofamqConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSofamqConfigRequest self = new UpdateSofamqConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSofamqConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSofamqConfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSofamqConfigRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public UpdateSofamqConfigRequest setTargetType(Long targetType) {
        this.targetType = targetType;
        return this;
    }
    public Long getTargetType() {
        return this.targetType;
    }

    public UpdateSofamqConfigRequest setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

    public UpdateSofamqConfigRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
