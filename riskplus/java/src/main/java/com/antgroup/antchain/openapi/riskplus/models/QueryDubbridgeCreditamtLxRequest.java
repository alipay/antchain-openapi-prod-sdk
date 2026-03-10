// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeCreditamtLxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授信申请编号
    @NameInMap("credit_apply_id")
    @Validation(required = true)
    public String creditApplyId;

    // 合作方代码
    @NameInMap("partner_code")
    public String partnerCode;

    public static QueryDubbridgeCreditamtLxRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeCreditamtLxRequest self = new QueryDubbridgeCreditamtLxRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeCreditamtLxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeCreditamtLxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeCreditamtLxRequest setCreditApplyId(String creditApplyId) {
        this.creditApplyId = creditApplyId;
        return this;
    }
    public String getCreditApplyId() {
        return this.creditApplyId;
    }

    public QueryDubbridgeCreditamtLxRequest setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

}
