// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class PagequeryBaselineAppcontainersResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分页查询中的总数目
    @NameInMap("total_count")
    public Long totalCount;

    // 每页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页码
    @NameInMap("current_page")
    public Long currentPage;

    // 基线应用容器列表
    @NameInMap("containers")
    public java.util.List<Container> containers;

    public static PagequeryBaselineAppcontainersResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryBaselineAppcontainersResponse self = new PagequeryBaselineAppcontainersResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryBaselineAppcontainersResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryBaselineAppcontainersResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryBaselineAppcontainersResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryBaselineAppcontainersResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public PagequeryBaselineAppcontainersResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryBaselineAppcontainersResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryBaselineAppcontainersResponse setContainers(java.util.List<Container> containers) {
        this.containers = containers;
        return this;
    }
    public java.util.List<Container> getContainers() {
        return this.containers;
    }

}
