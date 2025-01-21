// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateEvidenceVodRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 取证用户id
    @NameInMap("evidence_user_id")
    @Validation(required = true)
    public String evidenceUserId;

    // 公证处code
    @NameInMap("notary_office")
    @Validation(required = true)
    public String notaryOffice;

    // 取证类型（通用点播取证：DEFAULT，快手点播取证：KUAISHOU）
    @NameInMap("type")
    public String type;

    // 待取证点播网站网址
    @NameInMap("web_url")
    @Validation(required = true)
    public EvidenceWebUrlInfo webUrl;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 取证平台
    @NameInMap("obtain_platform")
    @Validation(required = true)
    public Long obtainPlatform;

    public static CreateEvidenceVodRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEvidenceVodRequest self = new CreateEvidenceVodRequest();
        return TeaModel.build(map, self);
    }

    public CreateEvidenceVodRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateEvidenceVodRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateEvidenceVodRequest setEvidenceUserId(String evidenceUserId) {
        this.evidenceUserId = evidenceUserId;
        return this;
    }
    public String getEvidenceUserId() {
        return this.evidenceUserId;
    }

    public CreateEvidenceVodRequest setNotaryOffice(String notaryOffice) {
        this.notaryOffice = notaryOffice;
        return this;
    }
    public String getNotaryOffice() {
        return this.notaryOffice;
    }

    public CreateEvidenceVodRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateEvidenceVodRequest setWebUrl(EvidenceWebUrlInfo webUrl) {
        this.webUrl = webUrl;
        return this;
    }
    public EvidenceWebUrlInfo getWebUrl() {
        return this.webUrl;
    }

    public CreateEvidenceVodRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEvidenceVodRequest setObtainPlatform(Long obtainPlatform) {
        this.obtainPlatform = obtainPlatform;
        return this;
    }
    public Long getObtainPlatform() {
        return this.obtainPlatform;
    }

}
