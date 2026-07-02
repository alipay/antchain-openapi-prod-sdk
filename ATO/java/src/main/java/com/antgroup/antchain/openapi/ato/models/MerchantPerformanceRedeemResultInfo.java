// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class MerchantPerformanceRedeemResultInfo extends TeaModel {
    // 回购支付方式	
    // ONLINE-线上
    // OFFLINE-线下
    /**
     * <strong>example:</strong>
     * <p>OFFLINE</p>
     */
    @NameInMap("redeem_way")
    public String redeemWay;

    // 回购时间
    /**
     * <strong>example:</strong>
     * <p>2024-10-17 18:41:59</p>
     */
    @NameInMap("redeem_time")
    public String redeemTime;

    // 回购原因
    // ACTIVE_REDEEM("ACTIVE_REDEEM", "自主赎回"),
    // RENTING_OUT_REDEEM("RENTING_OUT_REDEEM",
    //                                                                           "退租赎回"),
    // RENTING_AND_RESALE_REDEEM("RENTING_AND_RESALE_REDEEM",
    //                                                                                  "租转售赎回");
    /**
     * <strong>example:</strong>
     * <p>ACTIVE_REDEEM</p>
     */
    @NameInMap("redeem_reason")
    public String redeemReason;

    // 回购类型
    // TRANSFER，转账代偿
    // WITHHOLD，代扣代偿
    /**
     * <strong>example:</strong>
     * <p>TRANSFER</p>
     */
    @NameInMap("redeem_type")
    public String redeemType;

    // 回购金额（分）
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("redeem_amount")
    public Long redeemAmount;

    // 回购状态
    // PAYING 回购中
    // SUCCESS 成功
    // FAILED 失败
    /**
     * <strong>example:</strong>
     * <p>PAYING</p>
     */
    @NameInMap("redeem_status")
    public String redeemStatus;

    public static MerchantPerformanceRedeemResultInfo build(java.util.Map<String, ?> map) throws Exception {
        MerchantPerformanceRedeemResultInfo self = new MerchantPerformanceRedeemResultInfo();
        return TeaModel.build(map, self);
    }

    public MerchantPerformanceRedeemResultInfo setRedeemWay(String redeemWay) {
        this.redeemWay = redeemWay;
        return this;
    }
    public String getRedeemWay() {
        return this.redeemWay;
    }

    public MerchantPerformanceRedeemResultInfo setRedeemTime(String redeemTime) {
        this.redeemTime = redeemTime;
        return this;
    }
    public String getRedeemTime() {
        return this.redeemTime;
    }

    public MerchantPerformanceRedeemResultInfo setRedeemReason(String redeemReason) {
        this.redeemReason = redeemReason;
        return this;
    }
    public String getRedeemReason() {
        return this.redeemReason;
    }

    public MerchantPerformanceRedeemResultInfo setRedeemType(String redeemType) {
        this.redeemType = redeemType;
        return this;
    }
    public String getRedeemType() {
        return this.redeemType;
    }

    public MerchantPerformanceRedeemResultInfo setRedeemAmount(Long redeemAmount) {
        this.redeemAmount = redeemAmount;
        return this;
    }
    public Long getRedeemAmount() {
        return this.redeemAmount;
    }

    public MerchantPerformanceRedeemResultInfo setRedeemStatus(String redeemStatus) {
        this.redeemStatus = redeemStatus;
        return this;
    }
    public String getRedeemStatus() {
        return this.redeemStatus;
    }

}
