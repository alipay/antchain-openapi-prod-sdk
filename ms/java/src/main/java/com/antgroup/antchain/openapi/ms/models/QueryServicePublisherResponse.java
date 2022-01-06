// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryServicePublisherResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // Result of service publishers.
    @NameInMap("publishers")
    public java.util.List<ServicePublisher> publishers;

    // Page number
    @NameInMap("page_num")
    public Integer pageNum;

    // Page size
    @NameInMap("page_size")
    public Integer pageSize;

    // Total item number
    @NameInMap("total_count")
    public Integer totalCount;

    public static QueryServicePublisherResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryServicePublisherResponse self = new QueryServicePublisherResponse();
        return TeaModel.build(map, self);
    }

    public QueryServicePublisherResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryServicePublisherResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryServicePublisherResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryServicePublisherResponse setPublishers(java.util.List<ServicePublisher> publishers) {
        this.publishers = publishers;
        return this;
    }
    public java.util.List<ServicePublisher> getPublishers() {
        return this.publishers;
    }

    public QueryServicePublisherResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryServicePublisherResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryServicePublisherResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
