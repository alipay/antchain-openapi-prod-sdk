// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PlatformOrderLeadResultInfo extends TeaModel {
    // 场景名称
    /**
     * <strong>example:</strong>
     * <p>抖音1号直播间</p>
     */
    @NameInMap("scene_name")
    public String sceneName;

    // 平台订单号
    /**
     * <strong>example:</strong>
     * <p>1233123123</p>
     */
    @NameInMap("platform_order_id")
    public String platformOrderId;

    // 平台订单派发id
    /**
     * <strong>example:</strong>
     * <p>1761892719822_132</p>
     */
    @NameInMap("delivery_id")
    public String deliveryId;

    // 商品名称
    /**
     * <strong>example:</strong>
     * <p>苹果/Apple iPhone 17 Pro</p>
     */
    @NameInMap("product_title")
    public String productTitle;

    // 订单提交时间
    /**
     * <strong>example:</strong>
     * <p>2025-12-10 14:36:12</p>
     */
    @NameInMap("order_create_time")
    public String orderCreateTime;

    // 用户姓名（脱敏）
    /**
     * <strong>example:</strong>
     * <p>张**</p>
     */
    @NameInMap("user_name")
    public String userName;

    // 用户手机号（脱敏）
    /**
     * <strong>example:</strong>
     * <p>180****5678</p>
     */
    @NameInMap("user_phone")
    public String userPhone;

    // 商家品牌名称
    /**
     * <strong>example:</strong>
     * <p>爱租机</p>
     */
    @NameInMap("merchant_brand_name")
    public String merchantBrandName;

    // 商家品牌logoUrl
    /**
     * <strong>example:</strong>
     * <p><a href="http://logo.png">http://logo.png</a></p>
     */
    @NameInMap("merchant_brand_logo_url")
    public String merchantBrandLogoUrl;

    // 审核状态
    /**
     * <strong>example:</strong>
     * <p>WAIT_FEEDBACK：审核中 /ACCEPTED：审核通过 /REJECTED：已驳回 /CANCEL：已撤销/ SHIPPED：已发货/ PENDING_SHIPMENT：待发货</p>
     */
    @NameInMap("approval_status")
    public String approvalStatus;

    // 备注
    /**
     * <strong>example:</strong>
     * <p>用户电话打不通，已留言</p>
     */
    @NameInMap("remark")
    public String remark;

    public static PlatformOrderLeadResultInfo build(java.util.Map<String, ?> map) throws Exception {
        PlatformOrderLeadResultInfo self = new PlatformOrderLeadResultInfo();
        return TeaModel.build(map, self);
    }

    public PlatformOrderLeadResultInfo setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public PlatformOrderLeadResultInfo setPlatformOrderId(String platformOrderId) {
        this.platformOrderId = platformOrderId;
        return this;
    }
    public String getPlatformOrderId() {
        return this.platformOrderId;
    }

    public PlatformOrderLeadResultInfo setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }
    public String getDeliveryId() {
        return this.deliveryId;
    }

    public PlatformOrderLeadResultInfo setProductTitle(String productTitle) {
        this.productTitle = productTitle;
        return this;
    }
    public String getProductTitle() {
        return this.productTitle;
    }

    public PlatformOrderLeadResultInfo setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
        return this;
    }
    public String getOrderCreateTime() {
        return this.orderCreateTime;
    }

    public PlatformOrderLeadResultInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public PlatformOrderLeadResultInfo setUserPhone(String userPhone) {
        this.userPhone = userPhone;
        return this;
    }
    public String getUserPhone() {
        return this.userPhone;
    }

    public PlatformOrderLeadResultInfo setMerchantBrandName(String merchantBrandName) {
        this.merchantBrandName = merchantBrandName;
        return this;
    }
    public String getMerchantBrandName() {
        return this.merchantBrandName;
    }

    public PlatformOrderLeadResultInfo setMerchantBrandLogoUrl(String merchantBrandLogoUrl) {
        this.merchantBrandLogoUrl = merchantBrandLogoUrl;
        return this;
    }
    public String getMerchantBrandLogoUrl() {
        return this.merchantBrandLogoUrl;
    }

    public PlatformOrderLeadResultInfo setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    public PlatformOrderLeadResultInfo setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
