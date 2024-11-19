// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class BatchqueryInnerMarketingscoreRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 营销分查询对象
    @NameInMap("marketing_score_query_infos")
    @Validation(required = true)
    public java.util.List<MarketingScoreQueryInfo> marketingScoreQueryInfos;

    public static BatchqueryInnerMarketingscoreRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryInnerMarketingscoreRequest self = new BatchqueryInnerMarketingscoreRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryInnerMarketingscoreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryInnerMarketingscoreRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryInnerMarketingscoreRequest setMarketingScoreQueryInfos(java.util.List<MarketingScoreQueryInfo> marketingScoreQueryInfos) {
        this.marketingScoreQueryInfos = marketingScoreQueryInfos;
        return this;
    }
    public java.util.List<MarketingScoreQueryInfo> getMarketingScoreQueryInfos() {
        return this.marketingScoreQueryInfos;
    }

}
