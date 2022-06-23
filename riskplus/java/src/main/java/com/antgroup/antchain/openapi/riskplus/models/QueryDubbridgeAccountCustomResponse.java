// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeAccountCustomResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否进行过授信申请
    @NameInMap("reg_flag")
    public Boolean regFlag;

    public static QueryDubbridgeAccountCustomResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeAccountCustomResponse self = new QueryDubbridgeAccountCustomResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeAccountCustomResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeAccountCustomResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeAccountCustomResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeAccountCustomResponse setRegFlag(Boolean regFlag) {
        this.regFlag = regFlag;
        return this;
    }
    public Boolean getRegFlag() {
        return this.regFlag;
    }

}
