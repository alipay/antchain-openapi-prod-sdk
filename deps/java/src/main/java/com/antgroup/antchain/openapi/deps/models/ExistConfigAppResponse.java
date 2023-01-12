// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ExistConfigAppResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用参数是否已存在的数组，和入参顺序一一对应
    @NameInMap("data")
    public java.util.List<Boolean> data;

    public static ExistConfigAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ExistConfigAppResponse self = new ExistConfigAppResponse();
        return TeaModel.build(map, self);
    }

    public ExistConfigAppResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExistConfigAppResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExistConfigAppResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExistConfigAppResponse setData(java.util.List<Boolean> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Boolean> getData() {
        return this.data;
    }

}
