// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListZoneResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // zone list
    @NameInMap("data")
    public java.util.List<Zone> data;

    public static ListZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        ListZoneResponse self = new ListZoneResponse();
        return TeaModel.build(map, self);
    }

    public ListZoneResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListZoneResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListZoneResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListZoneResponse setData(java.util.List<Zone> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Zone> getData() {
        return this.data;
    }

}
