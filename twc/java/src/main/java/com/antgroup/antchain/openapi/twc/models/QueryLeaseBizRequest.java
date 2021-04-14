// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseBizRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租赁订单相关内容，以json形式发送
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    // 租赁订单所属阶段
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static QueryLeaseBizRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseBizRequest self = new QueryLeaseBizRequest();
        return TeaModel.build(map, self);
    }

    public QueryLeaseBizRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLeaseBizRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryLeaseBizRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public QueryLeaseBizRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
