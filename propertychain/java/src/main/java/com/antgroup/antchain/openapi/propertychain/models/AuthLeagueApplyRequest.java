// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class AuthLeagueApplyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 申请Id
    @NameInMap("apply_id")
    @Validation(required = true)
    public String applyId;

    // 申请类型【NONE,JOIN,CREATE,ALL】
    @NameInMap("apply_type")
    @Validation(required = true)
    public String applyType;

    // 备注
    @NameInMap("comment")
    public String comment;

    // 审核结果
    @NameInMap("pass")
    @Validation(required = true)
    public Boolean pass;

    public static AuthLeagueApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthLeagueApplyRequest self = new AuthLeagueApplyRequest();
        return TeaModel.build(map, self);
    }

    public AuthLeagueApplyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthLeagueApplyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthLeagueApplyRequest setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public AuthLeagueApplyRequest setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public AuthLeagueApplyRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public AuthLeagueApplyRequest setPass(Boolean pass) {
        this.pass = pass;
        return this;
    }
    public Boolean getPass() {
        return this.pass;
    }

}
