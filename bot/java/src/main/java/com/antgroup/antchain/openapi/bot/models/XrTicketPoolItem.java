// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class XrTicketPoolItem extends TeaModel {
    // 业务类型
    /**
     * <strong>example:</strong>
     * <p>XR_LEASE</p>
     */
    @NameInMap("biz_scene")
    public String bizScene;

    // 通行证名称
    /**
     * <strong>example:</strong>
     * <p>通行证名称</p>
     */
    @NameInMap("xr_ticket_pool_name")
    public String xrTicketPoolName;

    // 资源id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("resource_id")
    public String resourceId;

    // 有效期
    /**
     * <strong>example:</strong>
     * <p>2022-10-02</p>
     */
    @NameInMap("valid_time")
    public String validTime;

    // 体验时长
    /**
     * <strong>example:</strong>
     * <p>15(单位分钟)</p>
     */
    @NameInMap("test_time")
    public Long testTime;

    // 通行证状态：EXPIRED：已过期  VALID：有效  SALED：已出售
    /**
     * <strong>example:</strong>
     * <p>通行证状态</p>
     */
    @NameInMap("status")
    public String status;

    // 判断已发放数量>0(USED：已使用)  判断已发放数量=0(NOT_USED：未使用)
    /**
     * <strong>example:</strong>
     * <p>USED</p>
     */
    @NameInMap("use_status")
    public String useStatus;

    // 资源名称
    /**
     * <strong>example:</strong>
     * <p>资源名称</p>
     */
    @NameInMap("resource_name")
    public String resourceName;

    // 设备集合
    /**
     * <strong>example:</strong>
     * <p>json 或数组</p>
     */
    @NameInMap("xr_apps")
    public String xrApps;

    // 券池最大票数
    /**
     * <strong>example:</strong>
     * <p>133</p>
     */
    @NameInMap("max_pool_count")
    public Long maxPoolCount;

    // 租户id
    /**
     * <strong>example:</strong>
     * <p>ADSAERDS</p>
     */
    @NameInMap("tenant_id")
    public String tenantId;

    // 核销类型
    /**
     * <strong>example:</strong>
     * <p>XR_DEVICE</p>
     */
    @NameInMap("xr_verification_type")
    public String xrVerificationType;

    // 剩余可用券数量
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("surplus_count")
    public Long surplusCount;

    // 已发放数量 （总数-剩余数量）
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("issued_count")
    public Long issuedCount;

    public static XrTicketPoolItem build(java.util.Map<String, ?> map) throws Exception {
        XrTicketPoolItem self = new XrTicketPoolItem();
        return TeaModel.build(map, self);
    }

    public XrTicketPoolItem setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public XrTicketPoolItem setXrTicketPoolName(String xrTicketPoolName) {
        this.xrTicketPoolName = xrTicketPoolName;
        return this;
    }
    public String getXrTicketPoolName() {
        return this.xrTicketPoolName;
    }

    public XrTicketPoolItem setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public XrTicketPoolItem setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

    public XrTicketPoolItem setTestTime(Long testTime) {
        this.testTime = testTime;
        return this;
    }
    public Long getTestTime() {
        return this.testTime;
    }

    public XrTicketPoolItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public XrTicketPoolItem setUseStatus(String useStatus) {
        this.useStatus = useStatus;
        return this;
    }
    public String getUseStatus() {
        return this.useStatus;
    }

    public XrTicketPoolItem setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public XrTicketPoolItem setXrApps(String xrApps) {
        this.xrApps = xrApps;
        return this;
    }
    public String getXrApps() {
        return this.xrApps;
    }

    public XrTicketPoolItem setMaxPoolCount(Long maxPoolCount) {
        this.maxPoolCount = maxPoolCount;
        return this;
    }
    public Long getMaxPoolCount() {
        return this.maxPoolCount;
    }

    public XrTicketPoolItem setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public XrTicketPoolItem setXrVerificationType(String xrVerificationType) {
        this.xrVerificationType = xrVerificationType;
        return this;
    }
    public String getXrVerificationType() {
        return this.xrVerificationType;
    }

    public XrTicketPoolItem setSurplusCount(Long surplusCount) {
        this.surplusCount = surplusCount;
        return this;
    }
    public Long getSurplusCount() {
        return this.surplusCount;
    }

    public XrTicketPoolItem setIssuedCount(Long issuedCount) {
        this.issuedCount = issuedCount;
        return this;
    }
    public Long getIssuedCount() {
        return this.issuedCount;
    }

}
