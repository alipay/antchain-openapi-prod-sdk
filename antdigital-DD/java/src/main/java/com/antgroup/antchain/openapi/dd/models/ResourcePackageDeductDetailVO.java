// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ResourcePackageDeductDetailVO extends TeaModel {
    // 资源包抵扣日志id
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("resource_package_log_id")
    public String resourcePackageLogId;

    // 资源包抵扣量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deducted_amount")
    public String deductedAmount;

    // 资源包id
    /**
     * <strong>example:</strong>
     * <p>aaa</p>
     */
    @NameInMap("resource_package_id")
    public String resourcePackageId;

    // 资源包实例id
    /**
     * <strong>example:</strong>
     * <p>aaa</p>
     */
    @NameInMap("resource_package_instance_id")
    public String resourcePackageInstanceId;

    public static ResourcePackageDeductDetailVO build(java.util.Map<String, ?> map) throws Exception {
        ResourcePackageDeductDetailVO self = new ResourcePackageDeductDetailVO();
        return TeaModel.build(map, self);
    }

    public ResourcePackageDeductDetailVO setResourcePackageLogId(String resourcePackageLogId) {
        this.resourcePackageLogId = resourcePackageLogId;
        return this;
    }
    public String getResourcePackageLogId() {
        return this.resourcePackageLogId;
    }

    public ResourcePackageDeductDetailVO setDeductedAmount(String deductedAmount) {
        this.deductedAmount = deductedAmount;
        return this;
    }
    public String getDeductedAmount() {
        return this.deductedAmount;
    }

    public ResourcePackageDeductDetailVO setResourcePackageId(String resourcePackageId) {
        this.resourcePackageId = resourcePackageId;
        return this;
    }
    public String getResourcePackageId() {
        return this.resourcePackageId;
    }

    public ResourcePackageDeductDetailVO setResourcePackageInstanceId(String resourcePackageInstanceId) {
        this.resourcePackageInstanceId = resourcePackageInstanceId;
        return this;
    }
    public String getResourcePackageInstanceId() {
        return this.resourcePackageInstanceId;
    }

}
