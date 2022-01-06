// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ListDssIdcResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("idcs")
    @Validation(required = true)
    public java.util.List<Idc> idcs;

    public static ListDssIdcResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDssIdcResponse self = new ListDssIdcResponse();
        return TeaModel.build(map, self);
    }

    public ListDssIdcResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListDssIdcResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDssIdcResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListDssIdcResponse setIdcs(java.util.List<Idc> idcs) {
        this.idcs = idcs;
        return this;
    }
    public java.util.List<Idc> getIdcs() {
        return this.idcs;
    }

}
