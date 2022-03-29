// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class DeleteSofamqConfigRequest extends TeaModel {
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

    // 属性名
    @NameInMap("property")
    @Validation(required = true)
    public String property;

    public static DeleteSofamqConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSofamqConfigRequest self = new DeleteSofamqConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSofamqConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteSofamqConfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteSofamqConfigRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public DeleteSofamqConfigRequest setTargetType(Long targetType) {
        this.targetType = targetType;
        return this;
    }
    public Long getTargetType() {
        return this.targetType;
    }

    public DeleteSofamqConfigRequest setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

}
