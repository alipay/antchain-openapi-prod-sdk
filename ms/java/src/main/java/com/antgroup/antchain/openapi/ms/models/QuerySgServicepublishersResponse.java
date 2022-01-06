// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QuerySgServicepublishersResponse extends TeaModel {
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

    // 分页一页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 服务提供者信息集合
    @NameInMap("publishers")
    public java.util.List<Publisher> publishers;

    // start_index
    @NameInMap("start_index")
    public Long startIndex;

    // total_size
    @NameInMap("total_size")
    public Long totalSize;

    public static QuerySgServicepublishersResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySgServicepublishersResponse self = new QuerySgServicepublishersResponse();
        return TeaModel.build(map, self);
    }

    public QuerySgServicepublishersResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySgServicepublishersResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySgServicepublishersResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySgServicepublishersResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QuerySgServicepublishersResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QuerySgServicepublishersResponse setPublishers(java.util.List<Publisher> publishers) {
        this.publishers = publishers;
        return this;
    }
    public java.util.List<Publisher> getPublishers() {
        return this.publishers;
    }

    public QuerySgServicepublishersResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QuerySgServicepublishersResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
