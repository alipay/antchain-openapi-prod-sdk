// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class PagequeryProdsResourcesResponse extends TeaModel {
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

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    // 总页数
    @NameInMap("total_page")
    public Long totalPage;

    // 资源基线实例信息列表
    @NameInMap("data")
    public java.util.List<ResourceInstance> data;

    public static PagequeryProdsResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryProdsResourcesResponse self = new PagequeryProdsResourcesResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryProdsResourcesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryProdsResourcesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryProdsResourcesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryProdsResourcesResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryProdsResourcesResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryProdsResourcesResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public PagequeryProdsResourcesResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public PagequeryProdsResourcesResponse setData(java.util.List<ResourceInstance> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ResourceInstance> getData() {
        return this.data;
    }

}
