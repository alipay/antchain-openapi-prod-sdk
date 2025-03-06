// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class BindCarrierRepairmobileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 小号（实际拨打返回的虚拟小号）
    @NameInMap("mobile_x")
    public String mobileX;

    public static BindCarrierRepairmobileResponse build(java.util.Map<String, ?> map) throws Exception {
        BindCarrierRepairmobileResponse self = new BindCarrierRepairmobileResponse();
        return TeaModel.build(map, self);
    }

    public BindCarrierRepairmobileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BindCarrierRepairmobileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BindCarrierRepairmobileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BindCarrierRepairmobileResponse setMobileX(String mobileX) {
        this.mobileX = mobileX;
        return this;
    }
    public String getMobileX() {
        return this.mobileX;
    }

}
