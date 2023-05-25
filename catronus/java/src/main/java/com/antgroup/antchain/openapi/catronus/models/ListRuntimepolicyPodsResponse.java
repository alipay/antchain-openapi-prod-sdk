// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class ListRuntimepolicyPodsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // pod列表
    @NameInMap("pods")
    public java.util.List<String> pods;

    public static ListRuntimepolicyPodsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRuntimepolicyPodsResponse self = new ListRuntimepolicyPodsResponse();
        return TeaModel.build(map, self);
    }

    public ListRuntimepolicyPodsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListRuntimepolicyPodsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListRuntimepolicyPodsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListRuntimepolicyPodsResponse setPods(java.util.List<String> pods) {
        this.pods = pods;
        return this;
    }
    public java.util.List<String> getPods() {
        return this.pods;
    }

}
