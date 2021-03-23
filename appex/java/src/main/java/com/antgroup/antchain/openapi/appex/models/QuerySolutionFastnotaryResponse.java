// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class QuerySolutionFastnotaryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 存证记录
    @NameInMap("notary_record")
    public NotaryRecord notaryRecord;

    public static QuerySolutionFastnotaryResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySolutionFastnotaryResponse self = new QuerySolutionFastnotaryResponse();
        return TeaModel.build(map, self);
    }

    public QuerySolutionFastnotaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySolutionFastnotaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySolutionFastnotaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySolutionFastnotaryResponse setNotaryRecord(NotaryRecord notaryRecord) {
        this.notaryRecord = notaryRecord;
        return this;
    }
    public NotaryRecord getNotaryRecord() {
        return this.notaryRecord;
    }

}
