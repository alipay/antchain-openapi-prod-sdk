// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListSidecarResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // sidecars
    @NameInMap("sidecars")
    public java.util.List<SideCar> sidecars;

    public static ListSidecarResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSidecarResponse self = new ListSidecarResponse();
        return TeaModel.build(map, self);
    }

    public ListSidecarResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSidecarResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSidecarResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSidecarResponse setSidecars(java.util.List<SideCar> sidecars) {
        this.sidecars = sidecars;
        return this;
    }
    public java.util.List<SideCar> getSidecars() {
        return this.sidecars;
    }

}
