// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5511b931fbd04feba92b64ebc082aac0.models;

import com.aliyun.tea.*;

public class InitAntchainEkycVerificationWebsdkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 场景ID
    @NameInMap("scene_id")
    public String sceneId;

    // 预留扩展参数
    @NameInMap("extern_param")
    public String externParam;

    // 用户身份信息
    @NameInMap("identity_param")
    public String identityParam;

    // metainfo环境参数
    @NameInMap("metainfo")
    public String metainfo;

    public static InitAntchainEkycVerificationWebsdkRequest build(java.util.Map<String, ?> map) throws Exception {
        InitAntchainEkycVerificationWebsdkRequest self = new InitAntchainEkycVerificationWebsdkRequest();
        return TeaModel.build(map, self);
    }

    public InitAntchainEkycVerificationWebsdkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitAntchainEkycVerificationWebsdkRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitAntchainEkycVerificationWebsdkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public InitAntchainEkycVerificationWebsdkRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public InitAntchainEkycVerificationWebsdkRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public InitAntchainEkycVerificationWebsdkRequest setIdentityParam(String identityParam) {
        this.identityParam = identityParam;
        return this;
    }
    public String getIdentityParam() {
        return this.identityParam;
    }

    public InitAntchainEkycVerificationWebsdkRequest setMetainfo(String metainfo) {
        this.metainfo = metainfo;
        return this;
    }
    public String getMetainfo() {
        return this.metainfo;
    }

}
