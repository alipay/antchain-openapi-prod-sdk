// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditConsignorResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 开通失败信息
    @NameInMap("query_msg")
    public String queryMsg;

    // 开通状态
    // -1:失败状态， 0:未完成状态， 1:已完成状态
    @NameInMap("status")
    public Long status;

    public static QueryCreditConsignorResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditConsignorResponse self = new QueryCreditConsignorResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreditConsignorResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreditConsignorResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreditConsignorResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreditConsignorResponse setQueryMsg(String queryMsg) {
        this.queryMsg = queryMsg;
        return this;
    }
    public String getQueryMsg() {
        return this.queryMsg;
    }

    public QueryCreditConsignorResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
