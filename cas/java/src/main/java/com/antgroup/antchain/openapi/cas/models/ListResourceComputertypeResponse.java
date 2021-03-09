// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListResourceComputertypeResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 可用computer type列表
    @NameInMap("data")
    public java.util.List<ComputerType> data;

    public static ListResourceComputertypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceComputertypeResponse self = new ListResourceComputertypeResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceComputertypeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListResourceComputertypeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListResourceComputertypeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListResourceComputertypeResponse setData(java.util.List<ComputerType> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ComputerType> getData() {
        return this.data;
    }

}
