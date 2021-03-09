// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryDiskspecResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // disk spec infos
    @NameInMap("data")
    public java.util.List<DiskSpec> data;

    public static QueryDiskspecResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDiskspecResponse self = new QueryDiskspecResponse();
        return TeaModel.build(map, self);
    }

    public QueryDiskspecResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDiskspecResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDiskspecResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDiskspecResponse setData(java.util.List<DiskSpec> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DiskSpec> getData() {
        return this.data;
    }

}
