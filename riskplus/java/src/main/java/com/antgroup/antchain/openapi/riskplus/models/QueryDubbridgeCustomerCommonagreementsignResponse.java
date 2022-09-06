// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeCustomerCommonagreementsignResponse extends TeaModel {
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

    // 客户名称
    @NameInMap("custom_name")
    public String customName;

    // 流水号
    @NameInMap("trans_serials")
    public String transSerials;

    // 签约状态
    @NameInMap("status")
    public String status;

    // 签约用户唯一标识
    @NameInMap("account_user_id")
    public String accountUserId;

    // 脱敏的签约账号
    @NameInMap("account_no")
    public String accountNo;

    // 协议号
    @NameInMap("protocol_no")
    public String protocolNo;

    // 协议签约时间
    @NameInMap("sign_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String signTime;

    // 协议生效时间
    @NameInMap("valid_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String validTime;

    // 协议失效时间
    @NameInMap("invalid_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String invalidTime;

    public static QueryDubbridgeCustomerCommonagreementsignResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeCustomerCommonagreementsignResponse self = new QueryDubbridgeCustomerCommonagreementsignResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeCustomerCommonagreementsignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeCustomerCommonagreementsignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeCustomerCommonagreementsignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeCustomerCommonagreementsignResponse setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public QueryDubbridgeCustomerCommonagreementsignResponse setCustomName(String customName) {
        this.customName = customName;
        return this;
    }
    public String getCustomName() {
        return this.customName;
    }

    public QueryDubbridgeCustomerCommonagreementsignResponse setTransSerials(String transSerials) {
        this.transSerials = transSerials;
        return this;
    }
    public String getTransSerials() {
        return this.transSerials;
    }

    public QueryDubbridgeCustomerCommonagreementsignResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryDubbridgeCustomerCommonagreementsignResponse setAccountUserId(String accountUserId) {
        this.accountUserId = accountUserId;
        return this;
    }
    public String getAccountUserId() {
        return this.accountUserId;
    }

    public QueryDubbridgeCustomerCommonagreementsignResponse setAccountNo(String accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public String getAccountNo() {
        return this.accountNo;
    }

    public QueryDubbridgeCustomerCommonagreementsignResponse setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo;
        return this;
    }
    public String getProtocolNo() {
        return this.protocolNo;
    }

    public QueryDubbridgeCustomerCommonagreementsignResponse setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

    public QueryDubbridgeCustomerCommonagreementsignResponse setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

    public QueryDubbridgeCustomerCommonagreementsignResponse setInvalidTime(String invalidTime) {
        this.invalidTime = invalidTime;
        return this;
    }
    public String getInvalidTime() {
        return this.invalidTime;
    }

}
