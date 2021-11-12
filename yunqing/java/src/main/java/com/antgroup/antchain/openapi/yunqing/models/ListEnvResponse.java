// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ListEnvResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 环境列表。
    @NameInMap("envs")
    public java.util.List<Env> envs;

    public static ListEnvResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvResponse self = new ListEnvResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListEnvResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListEnvResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListEnvResponse setEnvs(java.util.List<Env> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.List<Env> getEnvs() {
        return this.envs;
    }

}
