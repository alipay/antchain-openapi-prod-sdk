// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ApplyJusticeMediationRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

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

    // 案件内容 JsonString 格式
    // {"agencyRelations":[{"litigantId":"","agencyId":"","authority":""}],"agents":[{"seqNo":"","entityPosition":0,"name":"","cardType":"","cardNo":"","mobile":"","email":"","relationShip":"","curAddress":"","firmName":"","identityFiles":[{"gdFileId":"","fileName":"","type":""}]}],"caseInfo":{"caseNumber":"","mediateOrganizationCode":"","actionCode":"","productCode":"","mediateType":"","amount":0,"fact":"","accuserAppeal":"","caseDescription":"","mediationFiles":[{"gdFileId":"","fileName":"","type":""}]},"litigants":{"legalPersons":[{"seqNo":"","entityPosition":0,"role":"","companyName":"","cardType":"","cardNo":"","legalPresentName":"","legalPresentCardType":"","legalPresentCardNo":"","legalPresentJob":"","legalPresentJobOther":"","contactName":"","contactMobile":"","contactEmail":"","companyAddress":"","emailAddress":"","identityFiles":[{"gdFileId":"","fileName":"","type":""}]}],"normalPersons":[{"seqNo":"","entityPosition":0,"role":"","name":"","cardType":"","cardNo":"","nation":"","curAddress":"","emailAddress":"","mobile":"","email":"","identityFiles":[{"gdFileId":"","fileName":"","type":""}]}]}}
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
