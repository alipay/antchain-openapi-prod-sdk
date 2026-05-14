// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoTradeSettletocardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 任务id
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static QueryAntchainAtoTradeSettletocardRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoTradeSettletocardRequest self = new QueryAntchainAtoTradeSettletocardRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoTradeSettletocardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoTradeSettletocardRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoTradeSettletocardRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryAntchainAtoTradeSettletocardRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
