// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDistributionUserTeamRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商品唯一标识
    @NameInMap("item_id")
    public String itemId;

    // 分页查询当前页号，默认值1
    @NameInMap("page_num")
    public Long pageNum;

    // 分页查询当前页大小，默认值20
    @NameInMap("page_size")
    public Long pageSize;

    // 商户唯一标识
    @NameInMap("shop_id")
    @Validation(required = true)
    public String shopId;

    // 用户唯一标识
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static QueryDistributionUserTeamRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDistributionUserTeamRequest self = new QueryDistributionUserTeamRequest();
        return TeaModel.build(map, self);
    }

    public QueryDistributionUserTeamRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDistributionUserTeamRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDistributionUserTeamRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public QueryDistributionUserTeamRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryDistributionUserTeamRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDistributionUserTeamRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public QueryDistributionUserTeamRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
