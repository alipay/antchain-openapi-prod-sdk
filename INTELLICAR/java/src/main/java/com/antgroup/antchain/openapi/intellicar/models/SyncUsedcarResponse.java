// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class SyncUsedcarResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 响应值
    @NameInMap("code")
    public String code;

    // 响应信息
    @NameInMap("msg")
    public String msg;

    // 线索状态信息列表
    @NameInMap("data")
    public java.util.List<LeadInfo> data;

    public static SyncUsedcarResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncUsedcarResponse self = new SyncUsedcarResponse();
        return TeaModel.build(map, self);
    }

    public SyncUsedcarResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SyncUsedcarResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SyncUsedcarResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SyncUsedcarResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SyncUsedcarResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SyncUsedcarResponse setData(java.util.List<LeadInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<LeadInfo> getData() {
        return this.data;
    }

}
