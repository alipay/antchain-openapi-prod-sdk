// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class DeleteCodeRelationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务类型
    @NameInMap("biz_type")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String bizType;

    // 溯源码，代表该账户的唯一资源标识
    @NameInMap("code")
    @Validation(maxLength = 160, minLength = 1)
    public String code;

    // 关联信息记录唯一标识
    // 
    @NameInMap("unique_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String uniqueId;

    public static DeleteCodeRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCodeRelationRequest self = new DeleteCodeRelationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCodeRelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteCodeRelationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteCodeRelationRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DeleteCodeRelationRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteCodeRelationRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
