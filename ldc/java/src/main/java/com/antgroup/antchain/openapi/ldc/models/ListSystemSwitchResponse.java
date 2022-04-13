// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListSystemSwitchResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 开关集合jarrya son string
    @NameInMap("switches")
    public String switches;

    public static ListSystemSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSystemSwitchResponse self = new ListSystemSwitchResponse();
        return TeaModel.build(map, self);
    }

    public ListSystemSwitchResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSystemSwitchResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSystemSwitchResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSystemSwitchResponse setSwitches(String switches) {
        this.switches = switches;
        return this;
    }
    public String getSwitches() {
        return this.switches;
    }

}
