// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryTradeSaleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询文本
    @NameInMap("query_text")
    @Validation(required = true, maxLength = 2048)
    public String queryText;

    // 查询场景
    @NameInMap("query_scene")
    @Validation(required = true)
    public String queryScene;

    // 扩展信息，JSON格式
    @NameInMap("ext_info")
    public String extInfo;

    public static QueryTradeSaleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeSaleRequest self = new QueryTradeSaleRequest();
        return TeaModel.build(map, self);
    }

    public QueryTradeSaleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTradeSaleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTradeSaleRequest setQueryText(String queryText) {
        this.queryText = queryText;
        return this;
    }
    public String getQueryText() {
        return this.queryText;
    }

    public QueryTradeSaleRequest setQueryScene(String queryScene) {
        this.queryScene = queryScene;
        return this;
    }
    public String getQueryScene() {
        return this.queryScene;
    }

    public QueryTradeSaleRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
