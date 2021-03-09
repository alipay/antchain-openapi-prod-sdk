// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListResourceDiskResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // disk infos
    @NameInMap("data")
    public java.util.List<Disk> data;

    public static ListResourceDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceDiskResponse self = new ListResourceDiskResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceDiskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListResourceDiskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListResourceDiskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListResourceDiskResponse setData(java.util.List<Disk> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Disk> getData() {
        return this.data;
    }

}
