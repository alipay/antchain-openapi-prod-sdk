// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryOperationlogTimelineResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // list
    @NameInMap("list")
    public java.util.List<String> list;

    // page_no
    @NameInMap("page_no")
    public Long pageNo;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryOperationlogTimelineResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOperationlogTimelineResponse self = new QueryOperationlogTimelineResponse();
        return TeaModel.build(map, self);
    }

    public QueryOperationlogTimelineResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOperationlogTimelineResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOperationlogTimelineResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOperationlogTimelineResponse setList(java.util.List<String> list) {
        this.list = list;
        return this;
    }
    public java.util.List<String> getList() {
        return this.list;
    }

    public QueryOperationlogTimelineResponse setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryOperationlogTimelineResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryOperationlogTimelineResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
