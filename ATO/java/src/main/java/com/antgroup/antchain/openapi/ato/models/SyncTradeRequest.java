// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncTradeRequest extends TeaModel {
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

    public static SyncTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncTradeRequest self = new SyncTradeRequest();
        return TeaModel.build(map, self);
    }

    public SyncTradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncTradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncTradeRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public SyncTradeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
