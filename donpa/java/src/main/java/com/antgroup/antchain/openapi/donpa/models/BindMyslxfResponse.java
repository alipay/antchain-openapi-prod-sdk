// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class BindMyslxfResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 绑定ID
    @NameInMap("bind_id")
    public String bindId;

    // 绑定过期时间
    @NameInMap("expire_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String expireTime;

    // 绑定的虚拟号码
    @NameInMap("virtual_number")
    public String virtualNumber;

    public static BindMyslxfResponse build(java.util.Map<String, ?> map) throws Exception {
        BindMyslxfResponse self = new BindMyslxfResponse();
        return TeaModel.build(map, self);
    }

    public BindMyslxfResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BindMyslxfResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BindMyslxfResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BindMyslxfResponse setBindId(String bindId) {
        this.bindId = bindId;
        return this;
    }
    public String getBindId() {
        return this.bindId;
    }

    public BindMyslxfResponse setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public BindMyslxfResponse setVirtualNumber(String virtualNumber) {
        this.virtualNumber = virtualNumber;
        return this;
    }
    public String getVirtualNumber() {
        return this.virtualNumber;
    }

}
