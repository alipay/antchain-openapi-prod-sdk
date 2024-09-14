// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateEvidenceLiveRequest extends TeaModel {
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

    // 取证类型（通用直播取证：DEFAULT）
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 取证网址信息
    @NameInMap("web_url")
    @Validation(required = true)
    public EvidenceWebUrlInfo webUrl;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 主播 ID
    @NameInMap("profile_id")
    public String profileId;

    // 预定时间：分钟，建议传值范围5-20分钟
    @NameInMap("expected_duration")
    @Validation(required = true)
    public Long expectedDuration;

    public static CreateEvidenceLiveRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEvidenceLiveRequest self = new CreateEvidenceLiveRequest();
        return TeaModel.build(map, self);
    }

    public CreateEvidenceLiveRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateEvidenceLiveRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateEvidenceLiveRequest setEvidenceUserId(String evidenceUserId) {
        this.evidenceUserId = evidenceUserId;
        return this;
    }
    public String getEvidenceUserId() {
        return this.evidenceUserId;
    }

    public CreateEvidenceLiveRequest setNotaryOffice(String notaryOffice) {
        this.notaryOffice = notaryOffice;
        return this;
    }
    public String getNotaryOffice() {
        return this.notaryOffice;
    }

    public CreateEvidenceLiveRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateEvidenceLiveRequest setWebUrl(EvidenceWebUrlInfo webUrl) {
        this.webUrl = webUrl;
        return this;
    }
    public EvidenceWebUrlInfo getWebUrl() {
        return this.webUrl;
    }

    public CreateEvidenceLiveRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEvidenceLiveRequest setProfileId(String profileId) {
        this.profileId = profileId;
        return this;
    }
    public String getProfileId() {
        return this.profileId;
    }

    public CreateEvidenceLiveRequest setExpectedDuration(Long expectedDuration) {
        this.expectedDuration = expectedDuration;
        return this;
    }
    public Long getExpectedDuration() {
        return this.expectedDuration;
    }

}
