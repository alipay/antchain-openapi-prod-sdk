// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class NotifyInsuranceOspireportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 案件同步唯一码
    @NameInMap("trade_no")
    @Validation(required = true, maxLength = 50)
    public String tradeNo;

    // 保司编码，PAIC---平安
    @NameInMap("external_channel_code")
    @Validation(required = true, maxLength = 10)
    public String externalChannelCode;

    // 报案号，关联的报案案件号
    @NameInMap("report_no")
    @Validation(required = true, maxLength = 100)
    public String reportNo;

    // 订单号
    @NameInMap("rela_order_no")
    @Validation(required = true, maxLength = 100)
    public String relaOrderNo;

    // 理赔金额(元)，实际的理赔金额，最多支持2位小数，超2位小数拒绝请求
    @NameInMap("claim_amount")
    @Validation(required = true)
    public String claimAmount;

    // 支付时间，实际的保司打款时间
    @NameInMap("payment_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String paymentTime;

    // 银行流水，打款的银行流水号
    @NameInMap("bank_serial_num")
    @Validation(required = true, maxLength = 200)
    public String bankSerialNum;

    public static NotifyInsuranceOspireportRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyInsuranceOspireportRequest self = new NotifyInsuranceOspireportRequest();
        return TeaModel.build(map, self);
    }

    public NotifyInsuranceOspireportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyInsuranceOspireportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyInsuranceOspireportRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public NotifyInsuranceOspireportRequest setExternalChannelCode(String externalChannelCode) {
        this.externalChannelCode = externalChannelCode;
        return this;
    }
    public String getExternalChannelCode() {
        return this.externalChannelCode;
    }

    public NotifyInsuranceOspireportRequest setReportNo(String reportNo) {
        this.reportNo = reportNo;
        return this;
    }
    public String getReportNo() {
        return this.reportNo;
    }

    public NotifyInsuranceOspireportRequest setRelaOrderNo(String relaOrderNo) {
        this.relaOrderNo = relaOrderNo;
        return this;
    }
    public String getRelaOrderNo() {
        return this.relaOrderNo;
    }

    public NotifyInsuranceOspireportRequest setClaimAmount(String claimAmount) {
        this.claimAmount = claimAmount;
        return this;
    }
    public String getClaimAmount() {
        return this.claimAmount;
    }

    public NotifyInsuranceOspireportRequest setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
        return this;
    }
    public String getPaymentTime() {
        return this.paymentTime;
    }

    public NotifyInsuranceOspireportRequest setBankSerialNum(String bankSerialNum) {
        this.bankSerialNum = bankSerialNum;
        return this;
    }
    public String getBankSerialNum() {
        return this.bankSerialNum;
    }

}
