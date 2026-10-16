// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryCdsqTireinsuranceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果码
    @NameInMap("response_code")
    public String responseCode;

    // 错误信息
    @NameInMap("response_msg")
    public String responseMsg;

    // 保单状态
    // 1：投保
    // 2：退保
    @NameInMap("status")
    public String status;

    public static QueryCdsqTireinsuranceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCdsqTireinsuranceResponse self = new QueryCdsqTireinsuranceResponse();
        return TeaModel.build(map, self);
    }

    public QueryCdsqTireinsuranceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCdsqTireinsuranceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCdsqTireinsuranceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCdsqTireinsuranceResponse setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public QueryCdsqTireinsuranceResponse setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
        return this;
    }
    public String getResponseMsg() {
        return this.responseMsg;
    }

    public QueryCdsqTireinsuranceResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
