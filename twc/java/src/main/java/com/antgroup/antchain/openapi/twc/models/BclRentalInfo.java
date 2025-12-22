// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclRentalInfo extends TeaModel {
    // 期数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("period")
    @Validation(required = true)
    public Long period;

    // 金额 单位分
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 租金归还时间
    /**
     * <strong>example:</strong>
     * <p>2023-04-05 12:12:23</p>
     */
    @NameInMap("time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String time;

    // 归还方式
    // 1.租赁代扣: PROXY_WITHHOLDING
    // 2.主动还款：ACTIVE_REPAYMENT  
    // 3.网商委托代扣：MY_BANK_DIRECT_PAYMENT
    // 4.预授权代扣：PRE_AUTHORIZATION_WITHHOLDING
    /**
     * <strong>example:</strong>
     * <p>ALIPAY_WITHHOLDING</p>
     */
    @NameInMap("way")
    @Validation(required = true)
    public String way;

    // 还款渠道
    // 1.支付宝：ALIPAY
    // 2.平台代收（客户主动还款）：PLATFORM_COLLECTION 
    // 3.网商银行：MY_BANK
    // 4.其他：OTHER 
    /**
     * <strong>example:</strong>
     * <p>ALIPAY</p>
     */
    @NameInMap("voucher_type")
    @Validation(required = true)
    public String voucherType;

    // 还款凭证编号
    /**
     * <strong>example:</strong>
     * <p>asdqw23e123sd</p>
     */
    @NameInMap("voucher_serial")
    @Validation(required = true)
    public String voucherSerial;

    // 手续费 如通过预授权、代扣的方式规划，必填
    /**
     * <strong>example:</strong>
     * <p>12321</p>
     */
    @NameInMap("premium")
    @Validation(required = true)
    public Long premium;

    public static BclRentalInfo build(java.util.Map<String, ?> map) throws Exception {
        BclRentalInfo self = new BclRentalInfo();
        return TeaModel.build(map, self);
    }

    public BclRentalInfo setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public BclRentalInfo setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public BclRentalInfo setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public BclRentalInfo setWay(String way) {
        this.way = way;
        return this;
    }
    public String getWay() {
        return this.way;
    }

    public BclRentalInfo setVoucherType(String voucherType) {
        this.voucherType = voucherType;
        return this;
    }
    public String getVoucherType() {
        return this.voucherType;
    }

    public BclRentalInfo setVoucherSerial(String voucherSerial) {
        this.voucherSerial = voucherSerial;
        return this;
    }
    public String getVoucherSerial() {
        return this.voucherSerial;
    }

    public BclRentalInfo setPremium(Long premium) {
        this.premium = premium;
        return this;
    }
    public Long getPremium() {
        return this.premium;
    }

}
