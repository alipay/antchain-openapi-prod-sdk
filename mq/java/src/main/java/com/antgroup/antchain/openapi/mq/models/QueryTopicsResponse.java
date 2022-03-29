// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryTopicsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // page num
    @NameInMap("page_num")
    public Integer pageNum;

    // page size
    @NameInMap("page_size")
    public Integer pageSize;

    // list
    @NameInMap("topics")
    @Validation(required = true)
    public java.util.List<Topic> topics;

    // total count
    @NameInMap("total_count")
    public Integer totalCount;

    public static QueryTopicsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTopicsResponse self = new QueryTopicsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTopicsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTopicsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTopicsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTopicsResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryTopicsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTopicsResponse setTopics(java.util.List<Topic> topics) {
        this.topics = topics;
        return this;
    }
    public java.util.List<Topic> getTopics() {
        return this.topics;
    }

    public QueryTopicsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
