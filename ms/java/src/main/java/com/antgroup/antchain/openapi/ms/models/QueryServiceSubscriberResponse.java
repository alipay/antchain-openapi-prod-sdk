// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryServiceSubscriberResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // Result of service subcribers.
    @NameInMap("subscribers")
    public java.util.List<ServiceSubscriber> subscribers;

    // Page number
    @NameInMap("page_num")
    public Integer pageNum;

    // Page size
    @NameInMap("page_size")
    public Integer pageSize;

    // Total item number
    @NameInMap("total_count")
    public Integer totalCount;

    public static QueryServiceSubscriberResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryServiceSubscriberResponse self = new QueryServiceSubscriberResponse();
        return TeaModel.build(map, self);
    }

    public QueryServiceSubscriberResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryServiceSubscriberResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryServiceSubscriberResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryServiceSubscriberResponse setSubscribers(java.util.List<ServiceSubscriber> subscribers) {
        this.subscribers = subscribers;
        return this;
    }
    public java.util.List<ServiceSubscriber> getSubscribers() {
        return this.subscribers;
    }

    public QueryServiceSubscriberResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryServiceSubscriberResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryServiceSubscriberResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
