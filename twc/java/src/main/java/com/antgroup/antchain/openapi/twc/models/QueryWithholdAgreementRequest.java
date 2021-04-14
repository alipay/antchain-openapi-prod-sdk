// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryWithholdAgreementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
    @NameInMap("external_agreement_no")
    @Validation(required = true)
    public String externalAgreementNo;

    // 第三方用户id
    @NameInMap("third_party_id")
    @Validation(required = true)
    public String thirdPartyId;

    public static QueryWithholdAgreementRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWithholdAgreementRequest self = new QueryWithholdAgreementRequest();
        return TeaModel.build(map, self);
    }

    public QueryWithholdAgreementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWithholdAgreementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryWithholdAgreementRequest setExternalAgreementNo(String externalAgreementNo) {
        this.externalAgreementNo = externalAgreementNo;
        return this;
    }
    public String getExternalAgreementNo() {
        return this.externalAgreementNo;
    }

    public QueryWithholdAgreementRequest setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
        return this;
    }
    public String getThirdPartyId() {
        return this.thirdPartyId;
    }

}
