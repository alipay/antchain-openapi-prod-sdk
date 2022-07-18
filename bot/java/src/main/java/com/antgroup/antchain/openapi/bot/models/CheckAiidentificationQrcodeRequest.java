// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CheckAiidentificationQrcodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户标识
    @NameInMap("app_key")
    @Validation(required = true)
    public String appKey;

    // 请求data
    @NameInMap("data")
    @Validation(required = true)
    public BaiQrcodeComparisonReqData data;

    public static CheckAiidentificationQrcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAiidentificationQrcodeRequest self = new CheckAiidentificationQrcodeRequest();
        return TeaModel.build(map, self);
    }

    public CheckAiidentificationQrcodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckAiidentificationQrcodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckAiidentificationQrcodeRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CheckAiidentificationQrcodeRequest setData(BaiQrcodeComparisonReqData data) {
        this.data = data;
        return this;
    }
    public BaiQrcodeComparisonReqData getData() {
        return this.data;
    }

}
