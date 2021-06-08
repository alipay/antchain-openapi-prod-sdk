// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SyncLabelTransferRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 收集标签数据
    @NameInMap("collect_label_content_list")
    @Validation(required = true)
    public java.util.List<CollectLabelContent> collectLabelContentList;

    // 业务号
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    public static SyncLabelTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncLabelTransferRequest self = new SyncLabelTransferRequest();
        return TeaModel.build(map, self);
    }

    public SyncLabelTransferRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncLabelTransferRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncLabelTransferRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SyncLabelTransferRequest setCollectLabelContentList(java.util.List<CollectLabelContent> collectLabelContentList) {
        this.collectLabelContentList = collectLabelContentList;
        return this;
    }
    public java.util.List<CollectLabelContent> getCollectLabelContentList() {
        return this.collectLabelContentList;
    }

    public SyncLabelTransferRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

}
