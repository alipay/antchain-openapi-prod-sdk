// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDistributionFundPromoterflowRequest extends TeaModel {
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

    // 商户id
    @NameInMap("shop_id")
    @Validation(required = true)
    public String shopId;

    public static QueryDistributionFundPromoterflowRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionFundPromoterflowRequest self = new QueryDistributionFundPromoterflowRequest();
        return TeaModel.build(map, self);
    }

    public QueryDistributionFundPromoterflowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDistributionFundPromoterflowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDistributionFundPromoterflowRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryDistributionFundPromoterflowRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDistributionFundPromoterflowRequest setPromoterId(String promoterId) {
        this.promoterId = promoterId;
        return this;
    }
    public String getPromoterId() {
        return this.promoterId;
    }

    public QueryDistributionFundPromoterflowRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

}
