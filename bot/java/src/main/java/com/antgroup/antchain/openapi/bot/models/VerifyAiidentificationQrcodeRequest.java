// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class VerifyAiidentificationQrcodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户身份标识
    @NameInMap("app_key")
    @Validation(required = true)
    public String appKey;

    // 溯源防伪码质检请求数据
    @NameInMap("data")
    @Validation(required = true)
    public BaiQrcodeVerifyReqData data;

    public static VerifyAiidentificationQrcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAiidentificationQrcodeRequest self = new VerifyAiidentificationQrcodeRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAiidentificationQrcodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyAiidentificationQrcodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyAiidentificationQrcodeRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public VerifyAiidentificationQrcodeRequest setData(BaiQrcodeVerifyReqData data) {
        this.data = data;
        return this;
    }
    public BaiQrcodeVerifyReqData getData() {
        return this.data;
    }

}
