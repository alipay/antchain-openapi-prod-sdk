// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSofamqConfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // property
    @NameInMap("property")
    @Validation(required = true)
    public String property;

    // target_name
    @NameInMap("target_name")
    @Validation(required = true)
    public String targetName;

    // target_type
    @NameInMap("target_type")
    @Validation(required = true)
    public Long targetType;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 生效范围，三板斧使用
    @NameInMap("scope")
    public String scope;

    public static CreateSofamqConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSofamqConfigRequest self = new CreateSofamqConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateSofamqConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSofamqConfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSofamqConfigRequest setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

    public CreateSofamqConfigRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public CreateSofamqConfigRequest setTargetType(Long targetType) {
        this.targetType = targetType;
        return this;
    }
    public Long getTargetType() {
        return this.targetType;
    }

    public CreateSofamqConfigRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public CreateSofamqConfigRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
