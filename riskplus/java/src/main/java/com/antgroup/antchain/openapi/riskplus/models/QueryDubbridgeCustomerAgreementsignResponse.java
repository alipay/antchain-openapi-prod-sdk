// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeCustomerAgreementsignResponse extends TeaModel {
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

    // 客户名称
    @NameInMap("custom_name")
    public String customName;

    // 支付宝会员id
    @NameInMap("alipay_user_id")
    public String alipayUserId;

    // 用以唯一标识用户签约记录的编号
    @NameInMap("protocol_no")
    public String protocolNo;

    public static QueryDubbridgeCustomerAgreementsignResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeCustomerAgreementsignResponse self = new QueryDubbridgeCustomerAgreementsignResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeCustomerAgreementsignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeCustomerAgreementsignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeCustomerAgreementsignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeCustomerAgreementsignResponse setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public QueryDubbridgeCustomerAgreementsignResponse setTransSerials(String transSerials) {
        this.transSerials = transSerials;
        return this;
    }
    public String getTransSerials() {
        return this.transSerials;
    }

    public QueryDubbridgeCustomerAgreementsignResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryDubbridgeCustomerAgreementsignResponse setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

    public QueryDubbridgeCustomerAgreementsignResponse setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

    public QueryDubbridgeCustomerAgreementsignResponse setInvalidTime(String invalidTime) {
        this.invalidTime = invalidTime;
        return this;
    }
    public String getInvalidTime() {
        return this.invalidTime;
    }

    public QueryDubbridgeCustomerAgreementsignResponse setCustomName(String customName) {
        this.customName = customName;
        return this;
    }
    public String getCustomName() {
        return this.customName;
    }

    public QueryDubbridgeCustomerAgreementsignResponse setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public QueryDubbridgeCustomerAgreementsignResponse setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo;
        return this;
    }
    public String getProtocolNo() {
        return this.protocolNo;
    }

}
