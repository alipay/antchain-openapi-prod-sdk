// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class UpdateRecoveryParticipatorsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // actions
    @NameInMap("actions")
    @Validation(required = true)
    public java.util.List<Participator> actions;

    // biz_type
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 默认1：TCC
    @NameInMap("action_mode")
    @Validation(required = true)
    public Long actionMode;

    public static UpdateRecoveryParticipatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecoveryParticipatorsRequest self = new UpdateRecoveryParticipatorsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecoveryParticipatorsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateRecoveryParticipatorsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateRecoveryParticipatorsRequest setActions(java.util.List<Participator> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<Participator> getActions() {
        return this.actions;
    }

    public UpdateRecoveryParticipatorsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public UpdateRecoveryParticipatorsRequest setActionMode(Long actionMode) {
        this.actionMode = actionMode;
        return this;
    }
    public Long getActionMode() {
        return this.actionMode;
    }

}
