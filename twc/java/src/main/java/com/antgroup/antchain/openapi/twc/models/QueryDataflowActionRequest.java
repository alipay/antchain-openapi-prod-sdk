// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryDataflowActionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询类型：
    // 1. 合约部署：DEPLOY
    // 2. 授权：AUTH
    // 3. 撤销授权：CANCEL_AUTH
    // 4. 密钥上传：PUB_KEY_UPLOAD
    @NameInMap("query_type")
    @Validation(required = true)
    public String queryType;

    // 发起操作的请求回执
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static QueryDataflowActionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataflowActionRequest self = new QueryDataflowActionRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataflowActionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDataflowActionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDataflowActionRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public QueryDataflowActionRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
