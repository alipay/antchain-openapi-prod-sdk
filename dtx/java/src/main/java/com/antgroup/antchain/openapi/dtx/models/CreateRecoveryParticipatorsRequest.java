// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class CreateRecoveryParticipatorsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批量新增action
    @NameInMap("actions")
    @Validation(required = true)
    public java.util.List<Participator> actions;

    // biz_type
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 默认TCC
    @NameInMap("action_mode")
    @Validation(required = true)
    public Long actionMode;

    public static CreateRecoveryParticipatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecoveryParticipatorsRequest self = new CreateRecoveryParticipatorsRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecoveryParticipatorsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateRecoveryParticipatorsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateRecoveryParticipatorsRequest setActions(java.util.List<Participator> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<Participator> getActions() {
        return this.actions;
    }

    public CreateRecoveryParticipatorsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateRecoveryParticipatorsRequest setActionMode(Long actionMode) {
        this.actionMode = actionMode;
        return this;
    }
    public Long getActionMode() {
        return this.actionMode;
    }

}
