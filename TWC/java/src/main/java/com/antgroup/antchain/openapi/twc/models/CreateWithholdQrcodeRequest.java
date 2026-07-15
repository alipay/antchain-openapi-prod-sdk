// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateWithholdQrcodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 第三方的用户id
    @NameInMap("third_party_id")
    @Validation(required = true)
    public String thirdPartyId;

    // 请求签约的协议号
    @NameInMap("external_agreement_no")
    @Validation(required = true)
    public String externalAgreementNo;

    public static CreateWithholdQrcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWithholdQrcodeRequest self = new CreateWithholdQrcodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateWithholdQrcodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateWithholdQrcodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateWithholdQrcodeRequest setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
        return this;
    }
    public String getThirdPartyId() {
        return this.thirdPartyId;
    }

    public CreateWithholdQrcodeRequest setExternalAgreementNo(String externalAgreementNo) {
        this.externalAgreementNo = externalAgreementNo;
        return this;
    }
    public String getExternalAgreementNo() {
        return this.externalAgreementNo;
    }

}
