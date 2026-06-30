// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubheCustomerAgreementsignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 客户编号
    @NameInMap("custom_no")
    public String customNo;

    // 流水号(代扣协议中标示用户的唯一签约号)
    @NameInMap("trans_serials")
    public String transSerials;

    // 协议签约状态(0-成功1-失败2-处理中)
    @NameInMap("status")
    public String status;

    // 协议签约时间(支付宝代扣协议的实际签约时间，格式为yyyy-MM-dd HH:mm:ss)
    @NameInMap("sign_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String signTime;

    // 协议生效时间(用户代扣协议的实际生效时间，格式为yyyy-MM-dd HH:mm:ss)
    @NameInMap("valid_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String validTime;

    // 协议失效时间(用户代扣协议的失效时间，格式为yyyy-MM-dd HH:mm:ss)
    @NameInMap("invalid_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String invalidTime;

    public static QueryDubheCustomerAgreementsignResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubheCustomerAgreementsignResponse self = new QueryDubheCustomerAgreementsignResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubheCustomerAgreementsignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubheCustomerAgreementsignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubheCustomerAgreementsignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubheCustomerAgreementsignResponse setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public QueryDubheCustomerAgreementsignResponse setTransSerials(String transSerials) {
        this.transSerials = transSerials;
        return this;
    }
    public String getTransSerials() {
        return this.transSerials;
    }

    public QueryDubheCustomerAgreementsignResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryDubheCustomerAgreementsignResponse setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

    public QueryDubheCustomerAgreementsignResponse setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

    public QueryDubheCustomerAgreementsignResponse setInvalidTime(String invalidTime) {
        this.invalidTime = invalidTime;
        return this;
    }
    public String getInvalidTime() {
        return this.invalidTime;
    }

}
