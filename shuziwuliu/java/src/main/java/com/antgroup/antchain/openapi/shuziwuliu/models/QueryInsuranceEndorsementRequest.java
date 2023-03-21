// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryInsuranceEndorsementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批单申请号
    @NameInMap("endorsement_apply_no")
    @Validation(required = true)
    public String endorsementApplyNo;

    // 批单申请编码
    @NameInMap("endorsement_apply_code")
    public String endorsementApplyCode;

    public static QueryInsuranceEndorsementRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInsuranceEndorsementRequest self = new QueryInsuranceEndorsementRequest();
        return TeaModel.build(map, self);
    }

    public QueryInsuranceEndorsementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInsuranceEndorsementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInsuranceEndorsementRequest setEndorsementApplyNo(String endorsementApplyNo) {
        this.endorsementApplyNo = endorsementApplyNo;
        return this;
    }
    public String getEndorsementApplyNo() {
        return this.endorsementApplyNo;
    }

    public QueryInsuranceEndorsementRequest setEndorsementApplyCode(String endorsementApplyCode) {
        this.endorsementApplyCode = endorsementApplyCode;
        return this;
    }
    public String getEndorsementApplyCode() {
        return this.endorsementApplyCode;
    }

}
