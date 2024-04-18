// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CreateEvidenceRecordscreenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 取证名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 取证用户id
    @NameInMap("evidence_user_id")
    @Validation(required = true)
    public String evidenceUserId;

    // 取证公证处
    @NameInMap("notary_office")
    @Validation(required = true)
    public String notaryOffice;

    // 取证网址信息
    @NameInMap("web_urls")
    @Validation(required = true)
    public java.util.List<EvidenceWebUrlInfo> webUrls;

    // 取证三方账号信息
    @NameInMap("third_party_info")
    @Validation(required = true)
    public EvidenceThirdPartyInfo thirdPartyInfo;

    // 取证服务器地域
    @NameInMap("area")
    @Validation(required = true)
    public String area;

    // 最大录屏时间（单位：分钟）
    @NameInMap("max_time_in_min")
    @Validation(required = true)
    public Long maxTimeInMin;

    // 服务器进入ready状态，指定时间未开始进入abort状态的等待时间，单位为分钟，默认1min，waitInMin不能小于1，不能大于10min
    @NameInMap("wait_in_min")
    @Validation(required = true)
    public Long waitInMin;

    // 回调地址
    @NameInMap("callback_url")
    @Validation(required = true)
    public String callbackUrl;

    // 幂等字段
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    public static CreateEvidenceRecordscreenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEvidenceRecordscreenRequest self = new CreateEvidenceRecordscreenRequest();
        return TeaModel.build(map, self);
    }

    public CreateEvidenceRecordscreenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateEvidenceRecordscreenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateEvidenceRecordscreenRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEvidenceRecordscreenRequest setEvidenceUserId(String evidenceUserId) {
        this.evidenceUserId = evidenceUserId;
        return this;
    }
    public String getEvidenceUserId() {
        return this.evidenceUserId;
    }

    public CreateEvidenceRecordscreenRequest setNotaryOffice(String notaryOffice) {
        this.notaryOffice = notaryOffice;
        return this;
    }
    public String getNotaryOffice() {
        return this.notaryOffice;
    }

    public CreateEvidenceRecordscreenRequest setWebUrls(java.util.List<EvidenceWebUrlInfo> webUrls) {
        this.webUrls = webUrls;
        return this;
    }
    public java.util.List<EvidenceWebUrlInfo> getWebUrls() {
        return this.webUrls;
    }

    public CreateEvidenceRecordscreenRequest setThirdPartyInfo(EvidenceThirdPartyInfo thirdPartyInfo) {
        this.thirdPartyInfo = thirdPartyInfo;
        return this;
    }
    public EvidenceThirdPartyInfo getThirdPartyInfo() {
        return this.thirdPartyInfo;
    }

    public CreateEvidenceRecordscreenRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public CreateEvidenceRecordscreenRequest setMaxTimeInMin(Long maxTimeInMin) {
        this.maxTimeInMin = maxTimeInMin;
        return this;
    }
    public Long getMaxTimeInMin() {
        return this.maxTimeInMin;
    }

    public CreateEvidenceRecordscreenRequest setWaitInMin(Long waitInMin) {
        this.waitInMin = waitInMin;
        return this;
    }
    public Long getWaitInMin() {
        return this.waitInMin;
    }

    public CreateEvidenceRecordscreenRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CreateEvidenceRecordscreenRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
