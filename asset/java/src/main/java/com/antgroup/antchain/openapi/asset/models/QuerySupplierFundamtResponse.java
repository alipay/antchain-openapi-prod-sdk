// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class QuerySupplierFundamtResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 出资账户
    @NameInMap("fund_account")
    public String fundAccount;

    // 核销金额
    @NameInMap("write_off_amount")
    public Long writeOffAmount;

    // 供应商被占用总金额，单位分
    @NameInMap("total_amount")
    public Long totalAmount;

    public static QuerySupplierFundamtResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySupplierFundamtResponse self = new QuerySupplierFundamtResponse();
        return TeaModel.build(map, self);
    }

    public QuerySupplierFundamtResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySupplierFundamtResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySupplierFundamtResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySupplierFundamtResponse setFundAccount(String fundAccount) {
        this.fundAccount = fundAccount;
        return this;
    }
    public String getFundAccount() {
        return this.fundAccount;
    }

    public QuerySupplierFundamtResponse setWriteOffAmount(Long writeOffAmount) {
        this.writeOffAmount = writeOffAmount;
        return this;
    }
    public Long getWriteOffAmount() {
        return this.writeOffAmount;
    }

    public QuerySupplierFundamtResponse setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

}
