// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AddSdkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备SDK公钥
    @NameInMap("verify_key")
    @Validation(required = true)
    public String verifyKey;

    // SDK版本号
    @NameInMap("sdk_version_str")
    @Validation(required = true)
    public String sdkVersionStr;

    // sdk模型，格式为json
    @NameInMap("meta_model")
    @Validation(required = true)
    public String metaModel;

    // 平台
    @NameInMap("platform")
    public String platform;

    // 公司名称
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    public static AddSdkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSdkRequest self = new AddSdkRequest();
        return TeaModel.build(map, self);
    }

    public AddSdkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddSdkRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddSdkRequest setVerifyKey(String verifyKey) {
        this.verifyKey = verifyKey;
        return this;
    }
    public String getVerifyKey() {
        return this.verifyKey;
    }

    public AddSdkRequest setSdkVersionStr(String sdkVersionStr) {
        this.sdkVersionStr = sdkVersionStr;
        return this;
    }
    public String getSdkVersionStr() {
        return this.sdkVersionStr;
    }

    public AddSdkRequest setMetaModel(String metaModel) {
        this.metaModel = metaModel;
        return this;
    }
    public String getMetaModel() {
        return this.metaModel;
    }

    public AddSdkRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public AddSdkRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

}
