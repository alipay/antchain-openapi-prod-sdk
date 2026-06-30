// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeCreditPermitResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // Y：准入
    // N：未准入
    @NameInMap("enable_apply")
    public String enableApply;

    public static QueryDubbridgeCreditPermitResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeCreditPermitResponse self = new QueryDubbridgeCreditPermitResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeCreditPermitResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeCreditPermitResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeCreditPermitResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeCreditPermitResponse setEnableApply(String enableApply) {
        this.enableApply = enableApply;
        return this;
    }
    public String getEnableApply() {
        return this.enableApply;
    }

}
