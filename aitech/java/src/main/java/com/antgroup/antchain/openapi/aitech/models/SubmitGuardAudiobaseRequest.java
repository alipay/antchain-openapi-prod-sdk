// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class SubmitGuardAudiobaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符 说明 ： 1. URL地址中不能包含中文，且一次请求请确保仅传入1条URL 2. 支持音频文件格式：MP3、WAV、AAC、WMA、OGG、M4A、AMR
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 审核场景类型 目前支持 BASE_AUDIO_SEC：音视频媒体通用检测
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 标识上游应用来源，字符串长度不能超过 128
    @NameInMap("app_code")
    public String appCode;

    // 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
    @NameInMap("business_id")
    public String businessId;

    // 结果通知地址，不指定时需要调用方主动查询结果
    @NameInMap("callback")
    public String callback;

    // 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
    @NameInMap("seed")
    public String seed;

    public static SubmitGuardAudiobaseRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitGuardAudiobaseRequest self = new SubmitGuardAudiobaseRequest();
        return TeaModel.build(map, self);
    }

    public SubmitGuardAudiobaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitGuardAudiobaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitGuardAudiobaseRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SubmitGuardAudiobaseRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public SubmitGuardAudiobaseRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public SubmitGuardAudiobaseRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public SubmitGuardAudiobaseRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public SubmitGuardAudiobaseRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public SubmitGuardAudiobaseRequest setSeed(String seed) {
        this.seed = seed;
        return this;
    }
    public String getSeed() {
        return this.seed;
    }

}
