// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class QueryItemRelationsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public java.util.List<Item> data;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryItemRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryItemRelationsResponse self = new QueryItemRelationsResponse();
        return TeaModel.build(map, self);
    }

    public QueryItemRelationsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryItemRelationsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryItemRelationsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryItemRelationsResponse setData(java.util.List<Item> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Item> getData() {
        return this.data;
    }

    public QueryItemRelationsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
