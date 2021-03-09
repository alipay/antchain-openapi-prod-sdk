// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListRouteEntryResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 路由条目信息
    @NameInMap("data")
    public java.util.List<VRouteEntry> data;

    public static ListRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRouteEntryResponse self = new ListRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public ListRouteEntryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListRouteEntryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListRouteEntryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListRouteEntryResponse setData(java.util.List<VRouteEntry> data) {
        this.data = data;
        return this;
    }
    public java.util.List<VRouteEntry> getData() {
        return this.data;
    }

}
