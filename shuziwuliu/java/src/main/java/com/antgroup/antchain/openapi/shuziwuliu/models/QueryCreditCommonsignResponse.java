// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditCommonsignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签约结果，-1:签约失败，0:未签约，1:已签约，2:签约中
    @NameInMap("status")
    public Long status;

    // 查询信息
    @NameInMap("query_msg")
    public String queryMsg;

    public static QueryCreditCommonsignResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditCommonsignResponse self = new QueryCreditCommonsignResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreditCommonsignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreditCommonsignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreditCommonsignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreditCommonsignResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryCreditCommonsignResponse setQueryMsg(String queryMsg) {
        this.queryMsg = queryMsg;
        return this;
    }
    public String getQueryMsg() {
        return this.queryMsg;
    }

}
