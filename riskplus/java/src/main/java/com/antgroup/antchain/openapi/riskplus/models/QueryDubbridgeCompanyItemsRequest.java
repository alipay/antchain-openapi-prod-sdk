// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeCompanyItemsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询字段（公司名、产品名、平台名等不能为空）
    @NameInMap("keyword")
    @Validation(required = true)
    public String keyword;

    public static QueryDubbridgeCompanyItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeCompanyItemsRequest self = new QueryDubbridgeCompanyItemsRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeCompanyItemsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeCompanyItemsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeCompanyItemsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}
