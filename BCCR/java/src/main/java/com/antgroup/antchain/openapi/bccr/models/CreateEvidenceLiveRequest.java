// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateEvidenceLiveRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 取证用户id
    @NameInMap("evidence_user_id")
    @Validation(required = true)
    public String evidenceUserId;

    // 取证公证处
    @NameInMap("notary_office")
    @Validation(required = true)
    public String notaryOffice;

    // 取证平台：2：陌陌4：比心，5：小红书，6：lespark
    @NameInMap("obtain_platform")
    public Long obtainPlatform;

    // 1：PC、2：移动设备
    @NameInMap("obtain_device_type")
    public String obtainDeviceType;

    // 直播取证标题（自定义）
    @NameInMap("title")
    public String title;

    // 预定时间：分钟，建议传值范围5-20分钟
    @NameInMap("expected_duration")
    public Long expectedDuration;

    // json字符串，取证平台动态参数，其参数取决于type，具体参数见
    // 附录
    @NameInMap("platform_dynamic_params")
    public String platformDynamicParams;

    // 取证类型（通用直播取证：DEFAULT）（过期，后续版本逐步删除）
    @NameInMap("type")
    public String type;

    // 取证网址信息（过期，后续版本逐步删除）
    @NameInMap("web_url")
    public EvidenceWebUrlInfo webUrl;

    // 主播 ID（过期，后续版本逐步删除）
    @NameInMap("profile_id")
    public String profileId;

    // 1：视频点播，2：视频直播，3：背景音乐（过期，后续版本逐步删除）
    @NameInMap("obtain_type")
    public String obtainType;

    // 主播名称（过期，后续版本逐步删除）
    @NameInMap("anchor_name")
    public String anchorName;

    // 直播取证预计开始时间
    @NameInMap("expected_start_time")
    public Long expectedStartTime;

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

    public CreateEvidenceLiveRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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

    public CreateEvidenceLiveRequest setObtainPlatform(Long obtainPlatform) {
        this.obtainPlatform = obtainPlatform;
        return this;
    }
    public Long getObtainPlatform() {
        return this.obtainPlatform;
    }

    public CreateEvidenceLiveRequest setObtainDeviceType(String obtainDeviceType) {
        this.obtainDeviceType = obtainDeviceType;
        return this;
    }
    public String getObtainDeviceType() {
        return this.obtainDeviceType;
    }

    public CreateEvidenceLiveRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateEvidenceLiveRequest setExpectedDuration(Long expectedDuration) {
        this.expectedDuration = expectedDuration;
        return this;
    }
    public Long getExpectedDuration() {
        return this.expectedDuration;
    }

    public CreateEvidenceLiveRequest setPlatformDynamicParams(String platformDynamicParams) {
        this.platformDynamicParams = platformDynamicParams;
        return this;
    }
    public String getPlatformDynamicParams() {
        return this.platformDynamicParams;
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

    public CreateEvidenceLiveRequest setProfileId(String profileId) {
        this.profileId = profileId;
        return this;
    }
    public String getProfileId() {
        return this.profileId;
    }

    public CreateEvidenceLiveRequest setObtainType(String obtainType) {
        this.obtainType = obtainType;
        return this;
    }
    public String getObtainType() {
        return this.obtainType;
    }

    public CreateEvidenceLiveRequest setAnchorName(String anchorName) {
        this.anchorName = anchorName;
        return this;
    }
    public String getAnchorName() {
        return this.anchorName;
    }

    public CreateEvidenceLiveRequest setExpectedStartTime(Long expectedStartTime) {
        this.expectedStartTime = expectedStartTime;
        return this;
    }
    public Long getExpectedStartTime() {
        return this.expectedStartTime;
    }

}
