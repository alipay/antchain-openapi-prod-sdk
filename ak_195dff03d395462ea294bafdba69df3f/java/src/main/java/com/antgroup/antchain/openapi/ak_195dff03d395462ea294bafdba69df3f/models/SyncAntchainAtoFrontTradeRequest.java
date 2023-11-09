// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class SyncAntchainAtoFrontTradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 类型
    // 1. orderFullInfo ， 订单所有信息同步
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // json.toString
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    public static SyncAntchainAtoFrontTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAntchainAtoFrontTradeRequest self = new SyncAntchainAtoFrontTradeRequest();
        return TeaModel.build(map, self);
    }

    public SyncAntchainAtoFrontTradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAntchainAtoFrontTradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAntchainAtoFrontTradeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SyncAntchainAtoFrontTradeRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
