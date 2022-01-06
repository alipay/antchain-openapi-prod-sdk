// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryDrmDrmresourcetplsResponse extends TeaModel {
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

    // Tpl类型drm资源列表
    @NameInMap("drm_resource_tpls")
    public java.util.List<DrmResourceTpl> drmResourceTpls;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 起始索引
    @NameInMap("start_index")
    public Long startIndex;

    // 总条数
    @NameInMap("total_size")
    public Long totalSize;

    public static QueryDrmDrmresourcetplsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDrmDrmresourcetplsResponse self = new QueryDrmDrmresourcetplsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDrmDrmresourcetplsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDrmDrmresourcetplsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDrmDrmresourcetplsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDrmDrmresourcetplsResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryDrmDrmresourcetplsResponse setDrmResourceTpls(java.util.List<DrmResourceTpl> drmResourceTpls) {
        this.drmResourceTpls = drmResourceTpls;
        return this;
    }
    public java.util.List<DrmResourceTpl> getDrmResourceTpls() {
        return this.drmResourceTpls;
    }

    public QueryDrmDrmresourcetplsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDrmDrmresourcetplsResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryDrmDrmresourcetplsResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
