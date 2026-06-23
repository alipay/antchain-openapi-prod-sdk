// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ResourcePackageInstanceVO extends TeaModel {
    // 流水号
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public String id;

    // 租户id
    /**
     * <strong>example:</strong>
     * <p>2088101118131245</p>
     */
    @NameInMap("tenant_id")
    public String tenantId;

    // 实例名称
    /**
     * <strong>example:</strong>
     * <p>实例</p>
     */
    @NameInMap("instance_name")
    public String instanceName;

    // 资源包前端展现名称
    /**
     * <strong>example:</strong>
     * <p>名称</p>
     */
    @NameInMap("resource_package_display_name")
    public String resourcePackageDisplayName;

    // 资源包商品名
    /**
     * <strong>example:</strong>
     * <p>资源包商品名</p>
     */
    @NameInMap("resource_package_product_name")
    public String resourcePackageProductName;

    // 资源包可抵扣资源名称
    /**
     * <strong>example:</strong>
     * <p>资源包可抵扣资源名称</p>
     */
    @NameInMap("applicable_product_name")
    public String applicableProductName;

    // 当前状态-VALID、CLOSED、INVALID
    /**
     * <strong>example:</strong>
     * <p>INVALID</p>
     */
    @NameInMap("status")
    public String status;

    // 是否可续费
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("renewable")
    public Boolean renewable;

    // 是否可升级
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("upgradable")
    public Boolean upgradable;

    // 初始容量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("initial_capacity")
    public String initialCapacity;

    // 当前容量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current_capacity")
    public String currentCapacity;

    // 初始容量单位
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("init_capacity_view_unit")
    public String initCapacityViewUnit;

    // 当前容量单位
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current_capacity_view_unit")
    public String currentCapacityViewUnit;

    // 有效期开始时间
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 有效期结束时间
    @NameInMap("end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 总资金
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total_fund")
    public String totalFund;

    // 剩余资金
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("remain_fund")
    public String remainFund;

    // 子包信息
    @NameInMap("sub_resource_package_vos")
    public java.util.List<ResourcePackageLogVO> subResourcePackageVos;

    public static ResourcePackageInstanceVO build(java.util.Map<String, ?> map) throws Exception {
        ResourcePackageInstanceVO self = new ResourcePackageInstanceVO();
        return TeaModel.build(map, self);
    }

    public ResourcePackageInstanceVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ResourcePackageInstanceVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ResourcePackageInstanceVO setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ResourcePackageInstanceVO setResourcePackageDisplayName(String resourcePackageDisplayName) {
        this.resourcePackageDisplayName = resourcePackageDisplayName;
        return this;
    }
    public String getResourcePackageDisplayName() {
        return this.resourcePackageDisplayName;
    }

    public ResourcePackageInstanceVO setResourcePackageProductName(String resourcePackageProductName) {
        this.resourcePackageProductName = resourcePackageProductName;
        return this;
    }
    public String getResourcePackageProductName() {
        return this.resourcePackageProductName;
    }

    public ResourcePackageInstanceVO setApplicableProductName(String applicableProductName) {
        this.applicableProductName = applicableProductName;
        return this;
    }
    public String getApplicableProductName() {
        return this.applicableProductName;
    }

    public ResourcePackageInstanceVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ResourcePackageInstanceVO setRenewable(Boolean renewable) {
        this.renewable = renewable;
        return this;
    }
    public Boolean getRenewable() {
        return this.renewable;
    }

    public ResourcePackageInstanceVO setUpgradable(Boolean upgradable) {
        this.upgradable = upgradable;
        return this;
    }
    public Boolean getUpgradable() {
        return this.upgradable;
    }

    public ResourcePackageInstanceVO setInitialCapacity(String initialCapacity) {
        this.initialCapacity = initialCapacity;
        return this;
    }
    public String getInitialCapacity() {
        return this.initialCapacity;
    }

    public ResourcePackageInstanceVO setCurrentCapacity(String currentCapacity) {
        this.currentCapacity = currentCapacity;
        return this;
    }
    public String getCurrentCapacity() {
        return this.currentCapacity;
    }

    public ResourcePackageInstanceVO setInitCapacityViewUnit(String initCapacityViewUnit) {
        this.initCapacityViewUnit = initCapacityViewUnit;
        return this;
    }
    public String getInitCapacityViewUnit() {
        return this.initCapacityViewUnit;
    }

    public ResourcePackageInstanceVO setCurrentCapacityViewUnit(String currentCapacityViewUnit) {
        this.currentCapacityViewUnit = currentCapacityViewUnit;
        return this;
    }
    public String getCurrentCapacityViewUnit() {
        return this.currentCapacityViewUnit;
    }

    public ResourcePackageInstanceVO setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ResourcePackageInstanceVO setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ResourcePackageInstanceVO setTotalFund(String totalFund) {
        this.totalFund = totalFund;
        return this;
    }
    public String getTotalFund() {
        return this.totalFund;
    }

    public ResourcePackageInstanceVO setRemainFund(String remainFund) {
        this.remainFund = remainFund;
        return this;
    }
    public String getRemainFund() {
        return this.remainFund;
    }

    public ResourcePackageInstanceVO setSubResourcePackageVos(java.util.List<ResourcePackageLogVO> subResourcePackageVos) {
        this.subResourcePackageVos = subResourcePackageVos;
        return this;
    }
    public java.util.List<ResourcePackageLogVO> getSubResourcePackageVos() {
        return this.subResourcePackageVos;
    }

}
