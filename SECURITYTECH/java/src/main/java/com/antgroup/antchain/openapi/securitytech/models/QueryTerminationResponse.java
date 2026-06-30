// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryTerminationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 账户信息列表
    @NameInMap("account_info_list")
    public java.util.List<AccountInfo> accountInfoList;

    public static QueryTerminationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTerminationResponse self = new QueryTerminationResponse();
        return TeaModel.build(map, self);
    }

    public QueryTerminationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTerminationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTerminationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTerminationResponse setAccountInfoList(java.util.List<AccountInfo> accountInfoList) {
        this.accountInfoList = accountInfoList;
        return this;
    }
    public java.util.List<AccountInfo> getAccountInfoList() {
        return this.accountInfoList;
    }

}
