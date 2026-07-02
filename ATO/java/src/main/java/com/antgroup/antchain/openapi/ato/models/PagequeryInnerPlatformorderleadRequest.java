// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerPlatformorderleadRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 服务商租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 场景名称
    @NameInMap("scene_name")
    public String sceneName;

    // 商品名称
    @NameInMap("product_title")
    public String productTitle;

    // 用户手机号
    @NameInMap("user_phone")
    public String userPhone;

    // 商家品牌名称
    @NameInMap("merchant_brand_name")
    public String merchantBrandName;

    // 订单提交开始时间
    @NameInMap("start_time")
    public String startTime;

    // 订单提交结束时间
    @NameInMap("end_time")
    public String endTime;

    // 审核状态
    @NameInMap("approval_status")
    public String approvalStatus;

    // 分页参数
    @NameInMap("page_info")
    public PageQuery pageInfo;

    public static PagequeryInnerPlatformorderleadRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerPlatformorderleadRequest self = new PagequeryInnerPlatformorderleadRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerPlatformorderleadRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryInnerPlatformorderleadRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryInnerPlatformorderleadRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PagequeryInnerPlatformorderleadRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public PagequeryInnerPlatformorderleadRequest setProductTitle(String productTitle) {
        this.productTitle = productTitle;
        return this;
    }
    public String getProductTitle() {
        return this.productTitle;
    }

    public PagequeryInnerPlatformorderleadRequest setUserPhone(String userPhone) {
        this.userPhone = userPhone;
        return this;
    }
    public String getUserPhone() {
        return this.userPhone;
    }

    public PagequeryInnerPlatformorderleadRequest setMerchantBrandName(String merchantBrandName) {
        this.merchantBrandName = merchantBrandName;
        return this;
    }
    public String getMerchantBrandName() {
        return this.merchantBrandName;
    }

    public PagequeryInnerPlatformorderleadRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public PagequeryInnerPlatformorderleadRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public PagequeryInnerPlatformorderleadRequest setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    public PagequeryInnerPlatformorderleadRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

}
