// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryMetaNodeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 物理机信息
    @NameInMap("mtm_ncs")
    public java.util.List<MtmNc> mtmNcs;

    public static QueryMetaNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMetaNodeResponse self = new QueryMetaNodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryMetaNodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMetaNodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMetaNodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMetaNodeResponse setMtmNcs(java.util.List<MtmNc> mtmNcs) {
        this.mtmNcs = mtmNcs;
        return this;
    }
    public java.util.List<MtmNc> getMtmNcs() {
        return this.mtmNcs;
    }

}
