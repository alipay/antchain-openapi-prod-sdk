// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_dc040d759c7a442f89b4b6590b1e39a0.models;

import com.aliyun.tea.*;

public class QueryAntsecuritytechGatewayEkytDriverResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 接口响应结果
    @NameInMap("success")
    public Boolean success;

    // 接口响应描述
    @NameInMap("message")
    public String message;

    // 接口响应数据
    @NameInMap("data")
    public RiskAssessData data;

    public static QueryAntsecuritytechGatewayEkytDriverResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntsecuritytechGatewayEkytDriverResponse self = new QueryAntsecuritytechGatewayEkytDriverResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntsecuritytechGatewayEkytDriverResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntsecuritytechGatewayEkytDriverResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntsecuritytechGatewayEkytDriverResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntsecuritytechGatewayEkytDriverResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAntsecuritytechGatewayEkytDriverResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAntsecuritytechGatewayEkytDriverResponse setData(RiskAssessData data) {
        this.data = data;
        return this;
    }
    public RiskAssessData getData() {
        return this.data;
    }

}
