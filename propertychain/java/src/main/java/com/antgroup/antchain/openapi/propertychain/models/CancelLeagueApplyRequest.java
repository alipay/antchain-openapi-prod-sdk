// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CancelLeagueApplyRequest extends TeaModel {
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

    public static CancelLeagueApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelLeagueApplyRequest self = new CancelLeagueApplyRequest();
        return TeaModel.build(map, self);
    }

    public CancelLeagueApplyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelLeagueApplyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelLeagueApplyRequest setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public CancelLeagueApplyRequest setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public CancelLeagueApplyRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

}
