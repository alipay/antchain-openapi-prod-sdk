// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class DeleteCodeRegistrationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务类型，客户自定义标签，做code数据隔离使用
    @NameInMap("biz_type")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String bizType;

    // 溯源码，代表该账户的唯一资源标识
    @NameInMap("code")
    @Validation(maxLength = 160, minLength = 1)
    public String code;

    // 注册记录唯一标识
    @NameInMap("unique_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String uniqueId;

    public static DeleteCodeRegistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCodeRegistrationRequest self = new DeleteCodeRegistrationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCodeRegistrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteCodeRegistrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteCodeRegistrationRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DeleteCodeRegistrationRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteCodeRegistrationRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
