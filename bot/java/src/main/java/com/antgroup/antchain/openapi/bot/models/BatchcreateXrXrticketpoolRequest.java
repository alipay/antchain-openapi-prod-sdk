// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BatchcreateXrXrticketpoolRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // xr通行证批量创建请求列表
    @NameInMap("xr_ticket_pool_reqs")
    @Validation(required = true)
    public java.util.List<XrTicketPoolBatchReq> xrTicketPoolReqs;

    // 业务类型
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    public static BatchcreateXrXrticketpoolRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateXrXrticketpoolRequest self = new BatchcreateXrXrticketpoolRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateXrXrticketpoolRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateXrXrticketpoolRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateXrXrticketpoolRequest setXrTicketPoolReqs(java.util.List<XrTicketPoolBatchReq> xrTicketPoolReqs) {
        this.xrTicketPoolReqs = xrTicketPoolReqs;
        return this;
    }
    public java.util.List<XrTicketPoolBatchReq> getXrTicketPoolReqs() {
        return this.xrTicketPoolReqs;
    }

    public BatchcreateXrXrticketpoolRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

}
