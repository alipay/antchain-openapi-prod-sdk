// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class SyncAntchainAtoTradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务字段，具体传入信息需参考文档
    // 传入格式需为json字符串
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    // 接口执行类型
    // 
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static SyncAntchainAtoTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAntchainAtoTradeRequest self = new SyncAntchainAtoTradeRequest();
        return TeaModel.build(map, self);
    }

    public SyncAntchainAtoTradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAntchainAtoTradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAntchainAtoTradeRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public SyncAntchainAtoTradeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
