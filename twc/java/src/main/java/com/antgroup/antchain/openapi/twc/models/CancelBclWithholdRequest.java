// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CancelBclWithholdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 解约申请单号
    @NameInMap("cancel_apply_no")
    @Validation(required = true)
    public String cancelApplyNo;

    // 是否允许解除代扣
    @NameInMap("allow_cancel_withhold")
    @Validation(required = true)
    public Boolean allowCancelWithhold;

    public static CancelBclWithholdRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelBclWithholdRequest self = new CancelBclWithholdRequest();
        return TeaModel.build(map, self);
    }

    public CancelBclWithholdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelBclWithholdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelBclWithholdRequest setCancelApplyNo(String cancelApplyNo) {
        this.cancelApplyNo = cancelApplyNo;
        return this;
    }
    public String getCancelApplyNo() {
        return this.cancelApplyNo;
    }

    public CancelBclWithholdRequest setAllowCancelWithhold(Boolean allowCancelWithhold) {
        this.allowCancelWithhold = allowCancelWithhold;
        return this;
    }
    public Boolean getAllowCancelWithhold() {
        return this.allowCancelWithhold;
    }

}
