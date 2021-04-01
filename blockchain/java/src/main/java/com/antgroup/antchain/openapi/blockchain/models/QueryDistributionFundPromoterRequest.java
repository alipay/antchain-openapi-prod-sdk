// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDistributionFundPromoterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 分页号
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 分页显示条数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 推广人id
    @NameInMap("promoter_id")
    @Validation(required = true)
    public String promoterId;

    public static QueryDistributionFundPromoterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionFundPromoterRequest self = new QueryDistributionFundPromoterRequest();
        return TeaModel.build(map, self);
    }

    public QueryDistributionFundPromoterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDistributionFundPromoterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDistributionFundPromoterRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryDistributionFundPromoterRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDistributionFundPromoterRequest setPromoterId(String promoterId) {
        this.promoterId = promoterId;
        return this;
    }
    public String getPromoterId() {
        return this.promoterId;
    }

}
