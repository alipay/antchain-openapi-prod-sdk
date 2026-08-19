// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiosproduct.models;

import com.aliyun.tea.*;

public class QueryGwchildinsuranceProfilelatestResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 接口返回数据对象
    @NameInMap("data")
    public String data;

    // 消息
    @NameInMap("message")
    public String message;

    // 接口整体执行情况
    @NameInMap("success")
    public Boolean success;

    public static QueryGwchildinsuranceProfilelatestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGwchildinsuranceProfilelatestResponse self = new QueryGwchildinsuranceProfilelatestResponse();
        return TeaModel.build(map, self);
    }

    public QueryGwchildinsuranceProfilelatestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryGwchildinsuranceProfilelatestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryGwchildinsuranceProfilelatestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryGwchildinsuranceProfilelatestResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryGwchildinsuranceProfilelatestResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryGwchildinsuranceProfilelatestResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
