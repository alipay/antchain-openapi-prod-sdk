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
    public Long expectedDuration;

    // 主播名称
    @NameInMap("anchor_name")
    public String anchorName;

    // 1：视频点播，2：视频直播，3：背景音乐
    @NameInMap("obtain_type")
    public String obtainType;

    // 1：PC、2：移动设备
    @NameInMap("obtain_device_type")
    public String obtainDeviceType;

    // 2：momo，4：比心，5：小红书
    @NameInMap("obtain_platform")
    public String obtainPlatform;

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

    public CreateEvidenceLiveRequest setAnchorName(String anchorName) {
        this.anchorName = anchorName;
        return this;
    }
    public String getAnchorName() {
        return this.anchorName;
    }

    public CreateEvidenceLiveRequest setObtainType(String obtainType) {
        this.obtainType = obtainType;
        return this;
    }
    public String getObtainType() {
        return this.obtainType;
    }

    public CreateEvidenceLiveRequest setObtainDeviceType(String obtainDeviceType) {
        this.obtainDeviceType = obtainDeviceType;
        return this;
    }
    public String getObtainDeviceType() {
        return this.obtainDeviceType;
    }

    public CreateEvidenceLiveRequest setObtainPlatform(String obtainPlatform) {
        this.obtainPlatform = obtainPlatform;
        return this;
    }
    public String getObtainPlatform() {
        return this.obtainPlatform;
    }

}
