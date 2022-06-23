// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeAccountStatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 0:通过；
    // 1:拒绝；
    // 2:处理中；
    // 
    @NameInMap("status")
    public String status;

    // 拒绝原因
    @NameInMap("msg")
    public String msg;

    // true：是
    // false：否
    @NameInMap("apply_flag")
    public Boolean applyFlag;

    public static QueryDubbridgeAccountStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeAccountStatusResponse self = new QueryDubbridgeAccountStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeAccountStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeAccountStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeAccountStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeAccountStatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryDubbridgeAccountStatusResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryDubbridgeAccountStatusResponse setApplyFlag(Boolean applyFlag) {
        this.applyFlag = applyFlag;
        return this;
    }
    public Boolean getApplyFlag() {
        return this.applyFlag;
    }

}
