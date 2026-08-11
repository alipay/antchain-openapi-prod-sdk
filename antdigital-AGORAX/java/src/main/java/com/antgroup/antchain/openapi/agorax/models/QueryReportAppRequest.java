// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class QueryReportAppRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 报表类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 查询条件 JSON 序列化字符串，JSON 格式由type决定
    @NameInMap("query_json")
    @Validation(required = true)
    public String queryJson;

    public static QueryReportAppRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryReportAppRequest self = new QueryReportAppRequest();
        return TeaModel.build(map, self);
    }

    public QueryReportAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryReportAppRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryReportAppRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryReportAppRequest setQueryJson(String queryJson) {
        this.queryJson = queryJson;
        return this;
    }
    public String getQueryJson() {
        return this.queryJson;
    }

}
