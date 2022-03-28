// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRiskinfoCommonRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询id
    @NameInMap("query_id")
    @Validation(required = true)
    public String queryId;

    // 查询id类型
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    // 用户id
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    public static QueryDubbridgeRiskinfoCommonRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeRiskinfoCommonRequest self = new QueryDubbridgeRiskinfoCommonRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeRiskinfoCommonRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeRiskinfoCommonRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeRiskinfoCommonRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public QueryDubbridgeRiskinfoCommonRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public QueryDubbridgeRiskinfoCommonRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

}
