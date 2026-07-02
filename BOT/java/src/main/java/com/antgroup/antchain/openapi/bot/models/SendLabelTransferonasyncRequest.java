// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SendLabelTransferonasyncRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    // 
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 收集的标签流转数据
    @NameInMap("collect_label_content_list")
    @Validation(required = true)
    public java.util.List<CollectLabelContent> collectLabelContentList;

    // 业务号，防重放
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // 1 业务端查询结果的最晚时间
    // 2 单位：天，最大值为30 天
    // 3 在responsePeriod 天之后，调用异步接口结果查询 将 无法获取异步接口的执行结果
    @NameInMap("response_period")
    @Validation(required = true)
    public Long responsePeriod;

    public static SendLabelTransferonasyncRequest build(java.util.Map<String, ?> map) throws Exception {
        SendLabelTransferonasyncRequest self = new SendLabelTransferonasyncRequest();
        return TeaModel.build(map, self);
    }

    public SendLabelTransferonasyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendLabelTransferonasyncRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendLabelTransferonasyncRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SendLabelTransferonasyncRequest setCollectLabelContentList(java.util.List<CollectLabelContent> collectLabelContentList) {
        this.collectLabelContentList = collectLabelContentList;
        return this;
    }
    public java.util.List<CollectLabelContent> getCollectLabelContentList() {
        return this.collectLabelContentList;
    }

    public SendLabelTransferonasyncRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public SendLabelTransferonasyncRequest setResponsePeriod(Long responsePeriod) {
        this.responsePeriod = responsePeriod;
        return this;
    }
    public Long getResponsePeriod() {
        return this.responsePeriod;
    }

}
