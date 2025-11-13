// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerPlatformproductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 分页参数
    @NameInMap("page_info")
    public PageQuery pageInfo;

    // 租户ID
    @NameInMap("tenant_id")
    public String tenantId;

    // 商品名称
    @NameInMap("product_name")
    public String productName;

    // 一级分类
    @NameInMap("primary_category")
    public String primaryCategory;

    // 二级分类
    @NameInMap("secondary_category")
    public String secondaryCategory;

    // 是否只展示已申请的通品
    @NameInMap("only_show_applied")
    public Boolean onlyShowApplied;

    public static PagequeryInnerPlatformproductRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerPlatformproductRequest self = new PagequeryInnerPlatformproductRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerPlatformproductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryInnerPlatformproductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryInnerPlatformproductRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

    public PagequeryInnerPlatformproductRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PagequeryInnerPlatformproductRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public PagequeryInnerPlatformproductRequest setPrimaryCategory(String primaryCategory) {
        this.primaryCategory = primaryCategory;
        return this;
    }
    public String getPrimaryCategory() {
        return this.primaryCategory;
    }

    public PagequeryInnerPlatformproductRequest setSecondaryCategory(String secondaryCategory) {
        this.secondaryCategory = secondaryCategory;
        return this;
    }
    public String getSecondaryCategory() {
        return this.secondaryCategory;
    }

    public PagequeryInnerPlatformproductRequest setOnlyShowApplied(Boolean onlyShowApplied) {
        this.onlyShowApplied = onlyShowApplied;
        return this;
    }
    public Boolean getOnlyShowApplied() {
        return this.onlyShowApplied;
    }

}
