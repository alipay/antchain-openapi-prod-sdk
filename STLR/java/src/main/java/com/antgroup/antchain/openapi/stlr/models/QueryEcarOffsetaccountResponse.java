// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryEcarOffsetaccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 碳普惠项目编码
    @NameInMap("project_no")
    public String projectNo;

    // 账户DID
    @NameInMap("account_did")
    public String accountDid;

    // 账户减碳量余额
    @NameInMap("offset_balance")
    public String offsetBalance;

    public static QueryEcarOffsetaccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEcarOffsetaccountResponse self = new QueryEcarOffsetaccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryEcarOffsetaccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEcarOffsetaccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEcarOffsetaccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEcarOffsetaccountResponse setProjectNo(String projectNo) {
        this.projectNo = projectNo;
        return this;
    }
    public String getProjectNo() {
        return this.projectNo;
    }

    public QueryEcarOffsetaccountResponse setAccountDid(String accountDid) {
        this.accountDid = accountDid;
        return this;
    }
    public String getAccountDid() {
        return this.accountDid;
    }

    public QueryEcarOffsetaccountResponse setOffsetBalance(String offsetBalance) {
        this.offsetBalance = offsetBalance;
        return this;
    }
    public String getOffsetBalance() {
        return this.offsetBalance;
    }

}
