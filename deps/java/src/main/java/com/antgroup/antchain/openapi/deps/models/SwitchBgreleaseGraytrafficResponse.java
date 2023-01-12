// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SwitchBgreleaseGraytrafficResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 灰度引流进程ID
    @NameInMap("process_id")
    public String processId;

    public static SwitchBgreleaseGraytrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchBgreleaseGraytrafficResponse self = new SwitchBgreleaseGraytrafficResponse();
        return TeaModel.build(map, self);
    }

    public SwitchBgreleaseGraytrafficResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SwitchBgreleaseGraytrafficResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SwitchBgreleaseGraytrafficResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SwitchBgreleaseGraytrafficResponse setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

}
