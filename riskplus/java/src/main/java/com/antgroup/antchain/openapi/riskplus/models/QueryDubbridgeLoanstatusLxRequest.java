// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeLoanstatusLxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用信审批申请编号
    @NameInMap("apply_id")
    @Validation(required = true)
    public String applyId;

    // 合作方代码
    @NameInMap("partner_code")
    public String partnerCode;

    public static QueryDubbridgeLoanstatusLxRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeLoanstatusLxRequest self = new QueryDubbridgeLoanstatusLxRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeLoanstatusLxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeLoanstatusLxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeLoanstatusLxRequest setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public QueryDubbridgeLoanstatusLxRequest setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

}
