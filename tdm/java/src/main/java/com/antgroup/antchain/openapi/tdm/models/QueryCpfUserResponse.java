// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class QueryCpfUserResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 个人账户信息
    @NameInMap("user_account_info")
    public java.util.List<CpfUserAccountInfo> userAccountInfo;

    // 贷款信息
    @NameInMap("user_loan_info")
    public java.util.List<CpfUserLoanInfo> userLoanInfo;

    public static QueryCpfUserResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCpfUserResponse self = new QueryCpfUserResponse();
        return TeaModel.build(map, self);
    }

    public QueryCpfUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCpfUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCpfUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCpfUserResponse setUserAccountInfo(java.util.List<CpfUserAccountInfo> userAccountInfo) {
        this.userAccountInfo = userAccountInfo;
        return this;
    }
    public java.util.List<CpfUserAccountInfo> getUserAccountInfo() {
        return this.userAccountInfo;
    }

    public QueryCpfUserResponse setUserLoanInfo(java.util.List<CpfUserLoanInfo> userLoanInfo) {
        this.userLoanInfo = userLoanInfo;
        return this;
    }
    public java.util.List<CpfUserLoanInfo> getUserLoanInfo() {
        return this.userLoanInfo;
    }

}
