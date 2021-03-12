// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryCreditTransferApplyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 查询结果信息，失败时为失败原因信息
    @NameInMap("query_msg")
    public String queryMsg;

    // 查询结果状态   
    // -1:注册失败， 0:注册中， 1:注册完成
    @NameInMap("status")
    public Long status;

    public static QueryCreditTransferApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditTransferApplyResponse self = new QueryCreditTransferApplyResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreditTransferApplyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreditTransferApplyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreditTransferApplyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreditTransferApplyResponse setQueryMsg(String queryMsg) {
        this.queryMsg = queryMsg;
        return this;
    }
    public String getQueryMsg() {
        return this.queryMsg;
    }

    public QueryCreditTransferApplyResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
