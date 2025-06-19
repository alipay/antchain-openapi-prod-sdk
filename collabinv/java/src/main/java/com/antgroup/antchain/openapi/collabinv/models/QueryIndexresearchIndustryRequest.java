// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryIndexresearchIndustryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 行业
    @NameInMap("industry")
    public String industry;

    public static QueryIndexresearchIndustryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIndexresearchIndustryRequest self = new QueryIndexresearchIndustryRequest();
        return TeaModel.build(map, self);
    }

    public QueryIndexresearchIndustryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIndexresearchIndustryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIndexresearchIndustryRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

}
