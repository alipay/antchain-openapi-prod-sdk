// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryImageResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // image infos
    @NameInMap("data")
    public java.util.List<CommonImage> data;

    // total count
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryImageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryImageResponse self = new QueryImageResponse();
        return TeaModel.build(map, self);
    }

    public QueryImageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryImageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryImageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryImageResponse setData(java.util.List<CommonImage> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CommonImage> getData() {
        return this.data;
    }

    public QueryImageResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
