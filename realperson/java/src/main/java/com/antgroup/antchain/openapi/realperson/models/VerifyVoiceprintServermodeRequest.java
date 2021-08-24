// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class VerifyVoiceprintServermodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 商户自定义的用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 音频文件，base64编码格式
    // 
    @NameInMap("audio_auth")
    public String audioAuth;

    // 音频文件OSS地址
    @NameInMap("audio_url")
    public String audioUrl;

    // 音频元数据
    @NameInMap("audio_meta")
    @Validation(required = true)
    public AudioMeta audioMeta;

    // 预留扩展参数
    @NameInMap("extern_param")
    public String externParam;

    public static VerifyVoiceprintServermodeRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyVoiceprintServermodeRequest self = new VerifyVoiceprintServermodeRequest();
        return TeaModel.build(map, self);
    }

    public VerifyVoiceprintServermodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyVoiceprintServermodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyVoiceprintServermodeRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public VerifyVoiceprintServermodeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public VerifyVoiceprintServermodeRequest setAudioAuth(String audioAuth) {
        this.audioAuth = audioAuth;
        return this;
    }
    public String getAudioAuth() {
        return this.audioAuth;
    }

    public VerifyVoiceprintServermodeRequest setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }
    public String getAudioUrl() {
        return this.audioUrl;
    }

    public VerifyVoiceprintServermodeRequest setAudioMeta(AudioMeta audioMeta) {
        this.audioMeta = audioMeta;
        return this;
    }
    public AudioMeta getAudioMeta() {
        return this.audioMeta;
    }

    public VerifyVoiceprintServermodeRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
