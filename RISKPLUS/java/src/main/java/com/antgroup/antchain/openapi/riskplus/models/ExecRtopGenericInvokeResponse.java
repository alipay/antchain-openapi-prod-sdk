// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ExecRtopGenericInvokeResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 接口数据
    @NameInMap("data")
    public String data;

    // response_code
    @NameInMap("response_code")
    public String responseCode;

    // 是否请求成功
    @NameInMap("success")
    public Boolean success;

    public static ExecRtopGenericInvokeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecRtopGenericInvokeResponse self = new ExecRtopGenericInvokeResponse();
        return TeaModel.build(map, self);
    }

    public ExecRtopGenericInvokeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecRtopGenericInvokeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecRtopGenericInvokeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecRtopGenericInvokeResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ExecRtopGenericInvokeResponse setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public ExecRtopGenericInvokeResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
