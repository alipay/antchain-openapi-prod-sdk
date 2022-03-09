// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class NotifyInsuranceReportresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 案件同步唯一码，调用方生成的唯一编码； 格式为 yyyyMMdd_身份标识_其他编码，yyyyMMdd请传递当前时间。 系统会根据该流水号做防重、幂等判断逻辑。	
    // 
    @NameInMap("trade_no")
    @Validation(required = true, maxLength = 50)
    public String tradeNo;

    // 渠道简称code
    @NameInMap("channel_simple_code")
    @Validation(required = true, maxLength = 16)
    public String channelSimpleCode;

    // 报案号，关联的报案案件号	
    // 
    @NameInMap("report_no")
    @Validation(required = true, maxLength = 100)
    public String reportNo;

    // 订单号	
    // 
    @NameInMap("rela_order_no")
    @Validation(required = true, maxLength = 100)
    public String relaOrderNo;

    // 理赔金额(元)，实际的理赔金额，最多支持2位小数，超2位小数拒绝请求	
    // 
    @NameInMap("claim_amount")
    @Validation(required = true)
    public String claimAmount;

    // 支付时间，实际的保司打款时间，格式：yyyy-MM-dd HH:mm:ss	
    // 
    @NameInMap("payment_time")
    @Validation(required = true)
    public String paymentTime;

    // 银行流水，打款的银行流水号	
    // 
    @NameInMap("bank_serial_num")
    @Validation(required = true, maxLength = 200)
    public String bankSerialNum;

    public static NotifyInsuranceReportresultRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyInsuranceReportresultRequest self = new NotifyInsuranceReportresultRequest();
        return TeaModel.build(map, self);
    }

    public NotifyInsuranceReportresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyInsuranceReportresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyInsuranceReportresultRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public NotifyInsuranceReportresultRequest setChannelSimpleCode(String channelSimpleCode) {
        this.channelSimpleCode = channelSimpleCode;
        return this;
    }
    public String getChannelSimpleCode() {
        return this.channelSimpleCode;
    }

    public NotifyInsuranceReportresultRequest setReportNo(String reportNo) {
        this.reportNo = reportNo;
        return this;
    }
    public String getReportNo() {
        return this.reportNo;
    }

    public NotifyInsuranceReportresultRequest setRelaOrderNo(String relaOrderNo) {
        this.relaOrderNo = relaOrderNo;
        return this;
    }
    public String getRelaOrderNo() {
        return this.relaOrderNo;
    }

    public NotifyInsuranceReportresultRequest setClaimAmount(String claimAmount) {
        this.claimAmount = claimAmount;
        return this;
    }
    public String getClaimAmount() {
        return this.claimAmount;
    }

    public NotifyInsuranceReportresultRequest setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
        return this;
    }
    public String getPaymentTime() {
        return this.paymentTime;
    }

    public NotifyInsuranceReportresultRequest setBankSerialNum(String bankSerialNum) {
        this.bankSerialNum = bankSerialNum;
        return this;
    }
    public String getBankSerialNum() {
        return this.bankSerialNum;
    }

}
