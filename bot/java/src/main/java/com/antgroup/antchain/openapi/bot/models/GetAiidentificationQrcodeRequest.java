// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetAiidentificationQrcodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求id
    @NameInMap("request_id")
    public String requestId;

    // 二维码识别请求体
    @NameInMap("data")
    @Validation(required = true)
    public BaiQrcodeParseReqData data;

    public static GetAiidentificationQrcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiidentificationQrcodeRequest self = new GetAiidentificationQrcodeRequest();
        return TeaModel.build(map, self);
    }

    public GetAiidentificationQrcodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAiidentificationQrcodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetAiidentificationQrcodeRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAiidentificationQrcodeRequest setData(BaiQrcodeParseReqData data) {
        this.data = data;
        return this;
    }
    public BaiQrcodeParseReqData getData() {
        return this.data;
    }

}
