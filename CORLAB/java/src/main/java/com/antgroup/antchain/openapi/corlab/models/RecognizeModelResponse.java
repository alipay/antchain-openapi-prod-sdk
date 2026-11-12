// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.corlab.models;

import com.aliyun.tea.*;

public class RecognizeModelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 操作成功结果
    @NameInMap("success")
    public Boolean success;

    // 业务码
    @NameInMap("response_code")
    public String responseCode;

    // 数据对象结构体字符串
    @NameInMap("data")
    public String data;

    public static RecognizeModelResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeModelResponse self = new RecognizeModelResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeModelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RecognizeModelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RecognizeModelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RecognizeModelResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RecognizeModelResponse setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public RecognizeModelResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
