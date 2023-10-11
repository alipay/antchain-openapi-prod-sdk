// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class GetAntchainAtoTradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询信息，必须遵循json字符串格式
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    // 接口类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static GetAntchainAtoTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAntchainAtoTradeRequest self = new GetAntchainAtoTradeRequest();
        return TeaModel.build(map, self);
    }

    public GetAntchainAtoTradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAntchainAtoTradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetAntchainAtoTradeRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public GetAntchainAtoTradeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
