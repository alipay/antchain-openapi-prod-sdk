// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class PagequeryProdsAppsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页面id
    @NameInMap("current_page")
    public Long currentPage;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 应用基线总数
    @NameInMap("total_count")
    public Long totalCount;

    // 总页数
    @NameInMap("total_page")
    public Long totalPage;

    // 应用基线
    @NameInMap("data")
    public java.util.List<AppInstance> data;

    public static PagequeryProdsAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryProdsAppsResponse self = new PagequeryProdsAppsResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryProdsAppsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryProdsAppsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryProdsAppsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryProdsAppsResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryProdsAppsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryProdsAppsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public PagequeryProdsAppsResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public PagequeryProdsAppsResponse setData(java.util.List<AppInstance> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AppInstance> getData() {
        return this.data;
    }

}
