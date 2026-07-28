// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mscene.models;

import com.aliyun.tea.*;

public class QueryOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求是否成功
    @NameInMap("success")
    public Boolean success;

    // 查询订单响应参数
    @NameInMap("mpaas_user_query_status_response")
    public MpaasUserGamecenterPaymentQuerystatusResponse mpaasUserQueryStatusResponse;

    public static QueryOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderResponse self = new QueryOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOrderResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryOrderResponse setMpaasUserQueryStatusResponse(MpaasUserGamecenterPaymentQuerystatusResponse mpaasUserQueryStatusResponse) {
        this.mpaasUserQueryStatusResponse = mpaasUserQueryStatusResponse;
        return this;
    }
    public MpaasUserGamecenterPaymentQuerystatusResponse getMpaasUserQueryStatusResponse() {
        return this.mpaasUserQueryStatusResponse;
    }

}
