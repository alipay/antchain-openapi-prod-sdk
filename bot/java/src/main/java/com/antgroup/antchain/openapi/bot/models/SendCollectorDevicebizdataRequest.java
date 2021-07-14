// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SendCollectorDevicebizdataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据模型Id
    // 
    // 
    @NameInMap("data_model_id")
    @Validation(required = true)
    public String dataModelId;

    // 业务号，防重放
    // 
    // 
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // 上传数据
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<BizContentGroup> content;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    public static SendCollectorDevicebizdataRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCollectorDevicebizdataRequest self = new SendCollectorDevicebizdataRequest();
        return TeaModel.build(map, self);
    }

    public SendCollectorDevicebizdataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendCollectorDevicebizdataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendCollectorDevicebizdataRequest setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

    public SendCollectorDevicebizdataRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public SendCollectorDevicebizdataRequest setContent(java.util.List<BizContentGroup> content) {
        this.content = content;
        return this;
    }
    public java.util.List<BizContentGroup> getContent() {
        return this.content;
    }

    public SendCollectorDevicebizdataRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
