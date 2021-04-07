// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListRouteEntryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
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
