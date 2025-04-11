// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryIndexresearchBrandindexRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 品牌码
    @NameInMap("brand_code")
    public String brandCode;

    // 店铺标签
    @NameInMap("shop_tag")
    public String shopTag;

    // 月份
    @NameInMap("month")
    public java.util.List<String> month;

    // 字段排序方式
    @NameInMap("sort")
    public java.util.List<String> sort;

    // page_info
    @NameInMap("page_info")
    @Validation(required = true)
    public PageInfo pageInfo;

    public static QueryIndexresearchBrandindexRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIndexresearchBrandindexRequest self = new QueryIndexresearchBrandindexRequest();
        return TeaModel.build(map, self);
    }

    public QueryIndexresearchBrandindexRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIndexresearchBrandindexRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIndexresearchBrandindexRequest setBrandCode(String brandCode) {
        this.brandCode = brandCode;
        return this;
    }
    public String getBrandCode() {
        return this.brandCode;
    }

    public QueryIndexresearchBrandindexRequest setShopTag(String shopTag) {
        this.shopTag = shopTag;
        return this;
    }
    public String getShopTag() {
        return this.shopTag;
    }

    public QueryIndexresearchBrandindexRequest setMonth(java.util.List<String> month) {
        this.month = month;
        return this;
    }
    public java.util.List<String> getMonth() {
        return this.month;
    }

    public QueryIndexresearchBrandindexRequest setSort(java.util.List<String> sort) {
        this.sort = sort;
        return this;
    }
    public java.util.List<String> getSort() {
        return this.sort;
    }

    public QueryIndexresearchBrandindexRequest setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

}
