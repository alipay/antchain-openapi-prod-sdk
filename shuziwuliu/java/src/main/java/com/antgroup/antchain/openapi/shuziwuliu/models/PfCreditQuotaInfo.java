// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class PfCreditQuotaInfo extends TeaModel {
    // 证件号
    /**
     * <strong>example:</strong>
     * <p>6323232</p>
     */
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 证件类型
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 授信到期日期
    /**
     * <strong>example:</strong>
     * <p>2020-09-19</p>
     */
    @NameInMap("credit_end")
    @Validation(required = true)
    public String creditEnd;

    // 授信起始日期
    /**
     * <strong>example:</strong>
     * <p>2020-09-11</p>
     */
    @NameInMap("credit_start")
    @Validation(required = true)
    public String creditStart;

    // 额度编号
    /**
     * <strong>example:</strong>
     * <p>923323</p>
     */
    @NameInMap("quota_no")
    @Validation(required = true)
    public String quotaNo;

    // 剩余额度
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("remaining_quota")
    @Validation(required = true)
    public String remainingQuota;

    // SON:放款账号loanAccNo
    // 还款账号repayAcctNo
    /**
     * <strong>example:</strong>
     * <p>loanAccNo</p>
     */
    @NameInMap("remark")
    @Validation(required = true)
    public String remark;

    // 额度状态：
    // 0、停用 / 1、启用  /  2、冻结
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 授信额度
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("total_quota")
    @Validation(required = true)
    public String totalQuota;

    // 数据更新时间
    /**
     * <strong>example:</strong>
     * <p>2020-09-10</p>
     */
    @NameInMap("update_time")
    @Validation(required = true)
    public String updateTime;

    // 总质押额度
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total_pledge_quota")
    @Validation(required = true)
    public String totalPledgeQuota;

    // 剩余质押额度
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("remain_pledge_quota")
    @Validation(required = true)
    public String remainPledgeQuota;

    public static PfCreditQuotaInfo build(java.util.Map<String, ?> map) throws Exception {
        PfCreditQuotaInfo self = new PfCreditQuotaInfo();
        return TeaModel.build(map, self);
    }

    public PfCreditQuotaInfo setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public PfCreditQuotaInfo setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public PfCreditQuotaInfo setCreditEnd(String creditEnd) {
        this.creditEnd = creditEnd;
        return this;
    }
    public String getCreditEnd() {
        return this.creditEnd;
    }

    public PfCreditQuotaInfo setCreditStart(String creditStart) {
        this.creditStart = creditStart;
        return this;
    }
    public String getCreditStart() {
        return this.creditStart;
    }

    public PfCreditQuotaInfo setQuotaNo(String quotaNo) {
        this.quotaNo = quotaNo;
        return this;
    }
    public String getQuotaNo() {
        return this.quotaNo;
    }

    public PfCreditQuotaInfo setRemainingQuota(String remainingQuota) {
        this.remainingQuota = remainingQuota;
        return this;
    }
    public String getRemainingQuota() {
        return this.remainingQuota;
    }

    public PfCreditQuotaInfo setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public PfCreditQuotaInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PfCreditQuotaInfo setTotalQuota(String totalQuota) {
        this.totalQuota = totalQuota;
        return this;
    }
    public String getTotalQuota() {
        return this.totalQuota;
    }

    public PfCreditQuotaInfo setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public PfCreditQuotaInfo setTotalPledgeQuota(String totalPledgeQuota) {
        this.totalPledgeQuota = totalPledgeQuota;
        return this;
    }
    public String getTotalPledgeQuota() {
        return this.totalPledgeQuota;
    }

    public PfCreditQuotaInfo setRemainPledgeQuota(String remainPledgeQuota) {
        this.remainPledgeQuota = remainPledgeQuota;
        return this;
    }
    public String getRemainPledgeQuota() {
        return this.remainPledgeQuota;
    }

}
