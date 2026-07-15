// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class InsuranceCancelRecordInfo extends TeaModel {
    // 保单单号
    /**
     * <strong>example:</strong>
     * <p>123123123123213</p>
     */
    @NameInMap("bcl_insurance_record_id")
    @Validation(required = true)
    public String bclInsuranceRecordId;

    // 退保id
    /**
     * <strong>example:</strong>
     * <p>12312312312123</p>
     */
    @NameInMap("cancel_insurance_id")
    @Validation(required = true)
    public String cancelInsuranceId;

    // 退还保费 单位分, 退保成功时返回
    /**
     * <strong>example:</strong>
     * <p>12312</p>
     */
    @NameInMap("cancel_amount")
    public Long cancelAmount;

    // 申请退保时间
    // 格式: yyyy-MM-dd HH:mm:ss
    /**
     * <strong>example:</strong>
     * <p>2023-04-05 12:12:23</p>
     */
    @NameInMap("cancel_apply_time")
    @Validation(required = true)
    public String cancelApplyTime;

    // 退保状态
    // RECORD_CANCEL_INIT: 退保初始
    // RECORD_CANCEL_SUCC: 退保成功
    // RECORD_CANCEL_FAIL: 退保失败
    /**
     * <strong>example:</strong>
     * <p>RECORD_CANCEL_SUCC</p>
     */
    @NameInMap("cancel_status")
    @Validation(required = true)
    public String cancelStatus;

    // 退保失败原, 退保失败时返回
    /**
     * <strong>example:</strong>
     * <p>退保失败, 保单已失效</p>
     */
    @NameInMap("remark")
    public String remark;

    public static InsuranceCancelRecordInfo build(java.util.Map<String, ?> map) throws Exception {
        InsuranceCancelRecordInfo self = new InsuranceCancelRecordInfo();
        return TeaModel.build(map, self);
    }

    public InsuranceCancelRecordInfo setBclInsuranceRecordId(String bclInsuranceRecordId) {
        this.bclInsuranceRecordId = bclInsuranceRecordId;
        return this;
    }
    public String getBclInsuranceRecordId() {
        return this.bclInsuranceRecordId;
    }

    public InsuranceCancelRecordInfo setCancelInsuranceId(String cancelInsuranceId) {
        this.cancelInsuranceId = cancelInsuranceId;
        return this;
    }
    public String getCancelInsuranceId() {
        return this.cancelInsuranceId;
    }

    public InsuranceCancelRecordInfo setCancelAmount(Long cancelAmount) {
        this.cancelAmount = cancelAmount;
        return this;
    }
    public Long getCancelAmount() {
        return this.cancelAmount;
    }

    public InsuranceCancelRecordInfo setCancelApplyTime(String cancelApplyTime) {
        this.cancelApplyTime = cancelApplyTime;
        return this;
    }
    public String getCancelApplyTime() {
        return this.cancelApplyTime;
    }

    public InsuranceCancelRecordInfo setCancelStatus(String cancelStatus) {
        this.cancelStatus = cancelStatus;
        return this;
    }
    public String getCancelStatus() {
        return this.cancelStatus;
    }

    public InsuranceCancelRecordInfo setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
