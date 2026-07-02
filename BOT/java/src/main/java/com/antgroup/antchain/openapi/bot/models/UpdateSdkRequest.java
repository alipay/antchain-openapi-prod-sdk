// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateSdkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 主键id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 设备SDK公钥
    @NameInMap("verify_key")
    public String verifyKey;

    // SDK版本号
    @NameInMap("sdk_version_str")
    public String sdkVersionStr;

    // sdk模型，格式为json
    @NameInMap("meta_model")
    public String metaModel;

    // 平台
    @NameInMap("platform")
    public String platform;

    // 公司名称
    // 
    @NameInMap("corp_name")
    public String corpName;

    public static UpdateSdkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSdkRequest self = new UpdateSdkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSdkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSdkRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSdkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSdkRequest setVerifyKey(String verifyKey) {
        this.verifyKey = verifyKey;
        return this;
    }
    public String getVerifyKey() {
        return this.verifyKey;
    }

    public UpdateSdkRequest setSdkVersionStr(String sdkVersionStr) {
        this.sdkVersionStr = sdkVersionStr;
        return this;
    }
    public String getSdkVersionStr() {
        return this.sdkVersionStr;
    }

    public UpdateSdkRequest setMetaModel(String metaModel) {
        this.metaModel = metaModel;
        return this;
    }
    public String getMetaModel() {
        return this.metaModel;
    }

    public UpdateSdkRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public UpdateSdkRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

}
