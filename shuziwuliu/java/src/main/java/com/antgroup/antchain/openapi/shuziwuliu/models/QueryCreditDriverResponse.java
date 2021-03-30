// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditDriverResponse extends TeaModel {
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

    public static QueryCreditDriverResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditDriverResponse self = new QueryCreditDriverResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreditDriverResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreditDriverResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreditDriverResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreditDriverResponse setQueryMsg(String queryMsg) {
        this.queryMsg = queryMsg;
        return this;
    }
    public String getQueryMsg() {
        return this.queryMsg;
    }

    public QueryCreditDriverResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
