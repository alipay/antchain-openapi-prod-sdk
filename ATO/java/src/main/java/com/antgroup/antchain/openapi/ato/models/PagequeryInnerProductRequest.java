// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商品名称
    @NameInMap("product_name")
    public String productName;

    // 商品id
    @NameInMap("product_id")
    public String productId;

    // 一级类目
    @NameInMap("main_class")
    public String mainClass;

    // 二级类目
    @NameInMap("sub_class")
    public String subClass;

    // 品牌
    @NameInMap("product_brand")
    public String productBrand;

    // 分页
    @NameInMap("page_info")
    @Validation(required = true)
    public PageQuery pageInfo;

    public static PagequeryInnerProductRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerProductRequest self = new PagequeryInnerProductRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryInnerProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryInnerProductRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PagequeryInnerProductRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public PagequeryInnerProductRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public PagequeryInnerProductRequest setMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }
    public String getMainClass() {
        return this.mainClass;
    }

    public PagequeryInnerProductRequest setSubClass(String subClass) {
        this.subClass = subClass;
        return this;
    }
    public String getSubClass() {
        return this.subClass;
    }

    public PagequeryInnerProductRequest setProductBrand(String productBrand) {
        this.productBrand = productBrand;
        return this;
    }
    public String getProductBrand() {
        return this.productBrand;
    }

    public PagequeryInnerProductRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

}
