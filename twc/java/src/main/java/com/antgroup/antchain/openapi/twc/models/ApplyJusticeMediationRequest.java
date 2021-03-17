// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ApplyJusticeMediationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 机构码 由蚂蚁分配
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 法院代码 由蚂蚁提供
    @NameInMap("court_code")
    @Validation(required = true)
    public String courtCode;

    // 案件内容 JsonString 格式{"agencyRelations":[],"agents":[],"caseInfo":{},"litigants":{}} 
    @NameInMap("case_body")
    @Validation(required = true)
    public String caseBody;

    public static ApplyJusticeMediationRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyJusticeMediationRequest self = new ApplyJusticeMediationRequest();
        return TeaModel.build(map, self);
    }

    public ApplyJusticeMediationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyJusticeMediationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyJusticeMediationRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ApplyJusticeMediationRequest setCourtCode(String courtCode) {
        this.courtCode = courtCode;
        return this;
    }
    public String getCourtCode() {
        return this.courtCode;
    }

    public ApplyJusticeMediationRequest setCaseBody(String caseBody) {
        this.caseBody = caseBody;
        return this;
    }
    public String getCaseBody() {
        return this.caseBody;
    }

}
