// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class SubmitAuditAudioRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
    // 说明 ：
    // URL地址中不能包含中文，且一次请求请确保仅传入1条URL
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 审核场景码，该接口固定输入BASE_AUDIO_AUDIT，其他值无效
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 客户业务ID。
    // 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
    @NameInMap("business_id")
    @Validation(required = true)
    public String businessId;

    // 检测对象对应的数据ID。
    // 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 结果通知地址，不指定时需要调用方主动查询结果
    @NameInMap("callback")
    public String callback;

    // 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
    @NameInMap("seed")
    public String seed;

    public static SubmitAuditAudioRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAuditAudioRequest self = new SubmitAuditAudioRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAuditAudioRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAuditAudioRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAuditAudioRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SubmitAuditAudioRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SubmitAuditAudioRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public SubmitAuditAudioRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public SubmitAuditAudioRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public SubmitAuditAudioRequest setSeed(String seed) {
        this.seed = seed;
        return this;
    }
    public String getSeed() {
        return this.seed;
    }

}
