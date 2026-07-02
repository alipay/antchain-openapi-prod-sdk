// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateAiidentificationQrcodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户身份标识
    @NameInMap("app_key")
    @Validation(required = true)
    public String appKey;

    // 二维码生成请求的请求数据
    @NameInMap("data")
    @Validation(required = true)
    public BaiQrcodeGenerateReqData data;

    public static CreateAiidentificationQrcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAiidentificationQrcodeRequest self = new CreateAiidentificationQrcodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateAiidentificationQrcodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAiidentificationQrcodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAiidentificationQrcodeRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreateAiidentificationQrcodeRequest setData(BaiQrcodeGenerateReqData data) {
        this.data = data;
        return this;
    }
    public BaiQrcodeGenerateReqData getData() {
        return this.data;
    }

}
