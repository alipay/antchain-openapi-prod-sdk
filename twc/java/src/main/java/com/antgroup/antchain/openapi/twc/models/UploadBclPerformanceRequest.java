// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UploadBclPerformanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单编号ID,长度不超过32位
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 32)
    public String orderId;

    // 租期编号，如：1表示第一期
    @NameInMap("period")
    @Validation(required = true, minimum = 1)
    public Long period;

    // 租金归还金额，单位精确到分。如：56309表示563.09元
    @NameInMap("amount")
    @Validation(required = true, minimum = 1)
    public Long amount;

    // 租金归还时间(格式为"2019-07-31 12:00:00")
    @NameInMap("time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String time;

    // 归还方式，取值范围如下：
    // ACTIVE_REPAYMENT：主动还款，
    // MY_BANK_PROXY_WITHHOLDING：网商委托代扣
    @NameInMap("way")
    @Validation(required = true, maxLength = 32)
    public String way;

    // 还款凭证类型，取值范围如下：
    // PLATFORM_COLLECTION：平台代收（客户主动还款），
    // MY_BANK：网商银行
    @NameInMap("voucher_type")
    @Validation(required = true, maxLength = 32)
    public String voucherType;

    // 还款凭证编号,
    // 如支付宝还款时，为支付宝流水编号
    @NameInMap("voucher_serial")
    @Validation(required = true, maxLength = 64)
    public String voucherSerial;

    // 手续费，单位分。如：128则表示手续费为12.8元；
    // 说明：如通过预授权、代扣的方式归还，该值必填
    @NameInMap("premium")
    public Long premium;

    public static UploadBclPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadBclPerformanceRequest self = new UploadBclPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public UploadBclPerformanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadBclPerformanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadBclPerformanceRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UploadBclPerformanceRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public UploadBclPerformanceRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public UploadBclPerformanceRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public UploadBclPerformanceRequest setWay(String way) {
        this.way = way;
        return this;
    }
    public String getWay() {
        return this.way;
    }

    public UploadBclPerformanceRequest setVoucherType(String voucherType) {
        this.voucherType = voucherType;
        return this;
    }
    public String getVoucherType() {
        return this.voucherType;
    }

    public UploadBclPerformanceRequest setVoucherSerial(String voucherSerial) {
        this.voucherSerial = voucherSerial;
        return this;
    }
    public String getVoucherSerial() {
        return this.voucherSerial;
    }

    public UploadBclPerformanceRequest setPremium(Long premium) {
        this.premium = premium;
        return this;
    }
    public Long getPremium() {
        return this.premium;
    }

}
