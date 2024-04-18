// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateEvidenceScreenshotRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 取证用户id
    @NameInMap("evidence_user_id")
    @Validation(required = true)
    public String evidenceUserId;

    // 取证公证处
    @NameInMap("notary_office")
    @Validation(required = true)
    public String notaryOffice;

    // 取证网址信息
    @NameInMap("web_url")
    @Validation(required = true)
    public EvidenceWebUrlInfo webUrl;

    // 取证三方账号信息
    @NameInMap("third_party_info")
    @Validation(required = true)
    public EvidenceThirdPartyInfo thirdPartyInfo;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    public static CreateEvidenceScreenshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEvidenceScreenshotRequest self = new CreateEvidenceScreenshotRequest();
        return TeaModel.build(map, self);
    }

    public CreateEvidenceScreenshotRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateEvidenceScreenshotRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateEvidenceScreenshotRequest setEvidenceUserId(String evidenceUserId) {
        this.evidenceUserId = evidenceUserId;
        return this;
    }
    public String getEvidenceUserId() {
        return this.evidenceUserId;
    }

    public CreateEvidenceScreenshotRequest setNotaryOffice(String notaryOffice) {
        this.notaryOffice = notaryOffice;
        return this;
    }
    public String getNotaryOffice() {
        return this.notaryOffice;
    }

    public CreateEvidenceScreenshotRequest setWebUrl(EvidenceWebUrlInfo webUrl) {
        this.webUrl = webUrl;
        return this;
    }
    public EvidenceWebUrlInfo getWebUrl() {
        return this.webUrl;
    }

    public CreateEvidenceScreenshotRequest setThirdPartyInfo(EvidenceThirdPartyInfo thirdPartyInfo) {
        this.thirdPartyInfo = thirdPartyInfo;
        return this;
    }
    public EvidenceThirdPartyInfo getThirdPartyInfo() {
        return this.thirdPartyInfo;
    }

    public CreateEvidenceScreenshotRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
