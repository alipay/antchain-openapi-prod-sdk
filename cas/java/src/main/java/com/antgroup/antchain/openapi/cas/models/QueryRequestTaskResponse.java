// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryRequestTaskResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public java.util.List<Task> data;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryRequestTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRequestTaskResponse self = new QueryRequestTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryRequestTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRequestTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRequestTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRequestTaskResponse setData(java.util.List<Task> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Task> getData() {
        return this.data;
    }

    public QueryRequestTaskResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
