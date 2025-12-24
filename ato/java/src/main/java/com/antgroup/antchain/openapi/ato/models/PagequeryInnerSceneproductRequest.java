// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerSceneproductRequest extends TeaModel {
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

    // 场景Code
    @NameInMap("scene_code")
    public String sceneCode;

    // 商品名称
    @NameInMap("product_name")
    public String productName;

    // 一级分类
    @NameInMap("primary_category")
    public String primaryCategory;

    // 二级分类
    @NameInMap("secondary_category")
    public String secondaryCategory;

    // 是否添加至场景中
    @NameInMap("added_flag")
    public Boolean addedFlag;

    // 场景商品上架状态
    @NameInMap("display_status")
    public String displayStatus;

    // 业务Code
    @NameInMap("business_code")
    public String businessCode;

    public static PagequeryInnerSceneproductRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerSceneproductRequest self = new PagequeryInnerSceneproductRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerSceneproductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryInnerSceneproductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryInnerSceneproductRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

    public PagequeryInnerSceneproductRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PagequeryInnerSceneproductRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public PagequeryInnerSceneproductRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public PagequeryInnerSceneproductRequest setPrimaryCategory(String primaryCategory) {
        this.primaryCategory = primaryCategory;
        return this;
    }
    public String getPrimaryCategory() {
        return this.primaryCategory;
    }

    public PagequeryInnerSceneproductRequest setSecondaryCategory(String secondaryCategory) {
        this.secondaryCategory = secondaryCategory;
        return this;
    }
    public String getSecondaryCategory() {
        return this.secondaryCategory;
    }

    public PagequeryInnerSceneproductRequest setAddedFlag(Boolean addedFlag) {
        this.addedFlag = addedFlag;
        return this;
    }
    public Boolean getAddedFlag() {
        return this.addedFlag;
    }

    public PagequeryInnerSceneproductRequest setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
        return this;
    }
    public String getDisplayStatus() {
        return this.displayStatus;
    }

    public PagequeryInnerSceneproductRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

}
