// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RentalSignSchemeCreateRequest extends TeaModel {
    // 押金方案，见 DepositTypeEnum；须与信用减免、预授权申请额归一结果一致
    /**
     * <strong>example:</strong>
     * <p>FREE_WITH_PREAUTH</p>
     */
    @NameInMap("deposit_type")
    public String depositType;

    // 预授权申请冻结额（分）。仅预授权=depositAmount；免押&预授权满足 0 < preauthAmount ≤ depositAmount；仅免押=0
    /**
     * <strong>example:</strong>
     * <p>20000</p>
     */
    @NameInMap("preauth_amount")
    public String preauthAmount;

    // 代扣协议额度（分），所有含信用减免的方案必须等于 creditReduceAmount；仅预授权=0
    /**
     * <strong>example:</strong>
     * <p>30000</p>
     */
    @NameInMap("withhold_quota")
    public Long withholdQuota;

    // 签约后允许的超期时长（分钟），必填，大于 0，最大 4320；签约完成时随订单域 signed 透传，用于订单侧计算关单时间
    /**
     * <strong>example:</strong>
     * <p>4320</p>
     */
    @NameInMap("signed_overdue_minutes")
    @Validation(required = true)
    public Long signedOverdueMinutes;

    // 信用减免金额（分）。仅免押=depositAmount，仅预授权=0，免押&预授权 ∈ (0, depositAmount)
    /**
     * <strong>example:</strong>
     * <p>20000</p>
     */
    @NameInMap("credit_reduce_amount")
    public Long creditReduceAmount;

    public static RentalSignSchemeCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        RentalSignSchemeCreateRequest self = new RentalSignSchemeCreateRequest();
        return TeaModel.build(map, self);
    }

    public RentalSignSchemeCreateRequest setDepositType(String depositType) {
        this.depositType = depositType;
        return this;
    }
    public String getDepositType() {
        return this.depositType;
    }

    public RentalSignSchemeCreateRequest setPreauthAmount(String preauthAmount) {
        this.preauthAmount = preauthAmount;
        return this;
    }
    public String getPreauthAmount() {
        return this.preauthAmount;
    }

    public RentalSignSchemeCreateRequest setWithholdQuota(Long withholdQuota) {
        this.withholdQuota = withholdQuota;
        return this;
    }
    public Long getWithholdQuota() {
        return this.withholdQuota;
    }

    public RentalSignSchemeCreateRequest setSignedOverdueMinutes(Long signedOverdueMinutes) {
        this.signedOverdueMinutes = signedOverdueMinutes;
        return this;
    }
    public Long getSignedOverdueMinutes() {
        return this.signedOverdueMinutes;
    }

    public RentalSignSchemeCreateRequest setCreditReduceAmount(Long creditReduceAmount) {
        this.creditReduceAmount = creditReduceAmount;
        return this;
    }
    public Long getCreditReduceAmount() {
        return this.creditReduceAmount;
    }

}
