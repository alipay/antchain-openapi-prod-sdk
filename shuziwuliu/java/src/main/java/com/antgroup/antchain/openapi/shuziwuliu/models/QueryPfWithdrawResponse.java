// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryPfWithdrawResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 银行端客户号
    // 
    @NameInMap("customer_no")
    public String customerNo;

    // 证件类型;050 统一社会信用证代码
    // 
    @NameInMap("cert_type")
    public String certType;

    // 证件号码
    @NameInMap("cert_no")
    public String certNo;

    // 客户完成账单融资申请放款至账户中待提款的金额，保留两位小数（单位：元）
    @NameInMap("withdrawal_amount")
    public String withdrawalAmount;

    // 数据更新时间
    @NameInMap("update_time")
    public String updateTime;

    public static QueryPfWithdrawResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPfWithdrawResponse self = new QueryPfWithdrawResponse();
        return TeaModel.build(map, self);
    }

    public QueryPfWithdrawResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPfWithdrawResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPfWithdrawResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPfWithdrawResponse setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
    }

    public QueryPfWithdrawResponse setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public QueryPfWithdrawResponse setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryPfWithdrawResponse setWithdrawalAmount(String withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
        return this;
    }
    public String getWithdrawalAmount() {
        return this.withdrawalAmount;
    }

    public QueryPfWithdrawResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
