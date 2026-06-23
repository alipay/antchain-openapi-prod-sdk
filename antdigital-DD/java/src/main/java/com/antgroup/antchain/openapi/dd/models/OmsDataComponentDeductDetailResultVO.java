// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class OmsDataComponentDeductDetailResultVO extends TeaModel {
    // 资源包抵扣日志id
    /**
     * <strong>example:</strong>
     * <p>1233</p>
     */
    @NameInMap("resource_package_log_id")
    @Validation(required = true)
    public String resourcePackageLogId;

    // 资源包抵扣量
    @NameInMap("deduct_amount")
    @Validation(required = true)
    public Long deductAmount;

    // 资源包抵扣价值
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("deducted_fund")
    @Validation(required = true)
    public String deductedFund;

    // 资源包抵扣时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("deducted_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String deductedTime;

    // 资源包id
    /**
     * <strong>example:</strong>
     * <p>A0SQBRFM01222133ORGJC1CN1ZXEMO6K8TL</p>
     */
    @NameInMap("resource_package_id")
    @Validation(required = true)
    public String resourcePackageId;

    // 资源包实例id
    /**
     * <strong>example:</strong>
     * <p>资源包实例id</p>
     */
    @NameInMap("resource_package_instance_id")
    @Validation(required = true)
    public String resourcePackageInstanceId;

    public static OmsDataComponentDeductDetailResultVO build(java.util.Map<String, ?> map) throws Exception {
        OmsDataComponentDeductDetailResultVO self = new OmsDataComponentDeductDetailResultVO();
        return TeaModel.build(map, self);
    }

    public OmsDataComponentDeductDetailResultVO setResourcePackageLogId(String resourcePackageLogId) {
        this.resourcePackageLogId = resourcePackageLogId;
        return this;
    }
    public String getResourcePackageLogId() {
        return this.resourcePackageLogId;
    }

    public OmsDataComponentDeductDetailResultVO setDeductAmount(Long deductAmount) {
        this.deductAmount = deductAmount;
        return this;
    }
    public Long getDeductAmount() {
        return this.deductAmount;
    }

    public OmsDataComponentDeductDetailResultVO setDeductedFund(String deductedFund) {
        this.deductedFund = deductedFund;
        return this;
    }
    public String getDeductedFund() {
        return this.deductedFund;
    }

    public OmsDataComponentDeductDetailResultVO setDeductedTime(String deductedTime) {
        this.deductedTime = deductedTime;
        return this;
    }
    public String getDeductedTime() {
        return this.deductedTime;
    }

    public OmsDataComponentDeductDetailResultVO setResourcePackageId(String resourcePackageId) {
        this.resourcePackageId = resourcePackageId;
        return this;
    }
    public String getResourcePackageId() {
        return this.resourcePackageId;
    }

    public OmsDataComponentDeductDetailResultVO setResourcePackageInstanceId(String resourcePackageInstanceId) {
        this.resourcePackageInstanceId = resourcePackageInstanceId;
        return this;
    }
    public String getResourcePackageInstanceId() {
        return this.resourcePackageInstanceId;
    }

}
