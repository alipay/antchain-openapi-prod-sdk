// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListUnifiedresourceVswitchResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 交换机的详细信息
    @NameInMap("data")
    public java.util.List<VSwitch> data;

    public static ListUnifiedresourceVswitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUnifiedresourceVswitchResponse self = new ListUnifiedresourceVswitchResponse();
        return TeaModel.build(map, self);
    }

    public ListUnifiedresourceVswitchResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListUnifiedresourceVswitchResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListUnifiedresourceVswitchResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListUnifiedresourceVswitchResponse setData(java.util.List<VSwitch> data) {
        this.data = data;
        return this;
    }
    public java.util.List<VSwitch> getData() {
        return this.data;
    }

}
