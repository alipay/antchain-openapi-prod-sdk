// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.goodschain.models;

import com.aliyun.tea.*;

public class QueryGoodsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商品id
    @NameInMap("goods_id")
    @Validation(required = true)
    public String goodsId;

    // 溯源信息枚举：ASSET_ONLY，只返回物权信息；LIST_ROAM_TRACE，转让溯源信息；LIST_TRACE，所有溯源信息；ASSET_ALL，返回以上所有信息（默认）
    @NameInMap("trace_type")
    public String traceType;

    // 当前页（默认为1）
    @NameInMap("current_page")
    public Long currentPage;

    // 页大小（默认为10）
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryGoodsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGoodsRequest self = new QueryGoodsRequest();
        return TeaModel.build(map, self);
    }

    public QueryGoodsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGoodsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGoodsRequest setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public QueryGoodsRequest setTraceType(String traceType) {
        this.traceType = traceType;
        return this;
    }
    public String getTraceType() {
        return this.traceType;
    }

    public QueryGoodsRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryGoodsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
