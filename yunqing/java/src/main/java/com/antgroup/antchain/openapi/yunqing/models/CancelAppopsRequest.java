// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class CancelAppopsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 运维单id。
    @NameInMap("ops_plan_id")
    @Validation(required = true)
    public String opsPlanId;

    // 操作人id
    @NameInMap("submitter_id")
    public String submitterId;

    // 	
    // 操作人名称（花名或者真名）
    @NameInMap("submitter_name")
    public String submitterName;

    public static CancelAppopsRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAppopsRequest self = new CancelAppopsRequest();
        return TeaModel.build(map, self);
    }

    public CancelAppopsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelAppopsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelAppopsRequest setOpsPlanId(String opsPlanId) {
        this.opsPlanId = opsPlanId;
        return this;
    }
    public String getOpsPlanId() {
        return this.opsPlanId;
    }

    public CancelAppopsRequest setSubmitterId(String submitterId) {
        this.submitterId = submitterId;
        return this;
    }
    public String getSubmitterId() {
        return this.submitterId;
    }

    public CancelAppopsRequest setSubmitterName(String submitterName) {
        this.submitterName = submitterName;
        return this;
    }
    public String getSubmitterName() {
        return this.submitterName;
    }

}
