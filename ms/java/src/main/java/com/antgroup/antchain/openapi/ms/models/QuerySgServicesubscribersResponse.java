// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QuerySgServicesubscribersResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 开始索引
    @NameInMap("start_index")
    public Long startIndex;

    // 消费者分页列表
    @NameInMap("subscribers")
    public java.util.List<Subscriber> subscribers;

    // 总条数
    @NameInMap("total_size")
    public Long totalSize;

    public static QuerySgServicesubscribersResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySgServicesubscribersResponse self = new QuerySgServicesubscribersResponse();
        return TeaModel.build(map, self);
    }

    public QuerySgServicesubscribersResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySgServicesubscribersResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySgServicesubscribersResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySgServicesubscribersResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QuerySgServicesubscribersResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QuerySgServicesubscribersResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QuerySgServicesubscribersResponse setSubscribers(java.util.List<Subscriber> subscribers) {
        this.subscribers = subscribers;
        return this;
    }
    public java.util.List<Subscriber> getSubscribers() {
        return this.subscribers;
    }

    public QuerySgServicesubscribersResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
