// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tritestdemo.models;

import com.aliyun.tea.*;

public class BenchCreateTestForResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // OK
    @NameInMap("stastus")
    public String stastus;

    // SUCCESS le
    @NameInMap("msg")
    public String msg;

    public static BenchCreateTestForResponse build(java.util.Map<String, ?> map) throws Exception {
        BenchCreateTestForResponse self = new BenchCreateTestForResponse();
        return TeaModel.build(map, self);
    }

    public BenchCreateTestForResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BenchCreateTestForResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BenchCreateTestForResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BenchCreateTestForResponse setStastus(String stastus) {
        this.stastus = stastus;
        return this;
    }
    public String getStastus() {
        return this.stastus;
    }

    public BenchCreateTestForResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
