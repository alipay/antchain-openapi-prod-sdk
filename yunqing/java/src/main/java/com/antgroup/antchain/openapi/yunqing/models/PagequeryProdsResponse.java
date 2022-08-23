// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class PagequeryProdsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 产品基线元信息
    @NameInMap("prod_meta_infos")
    public java.util.List<ProdMetaInfo> prodMetaInfos;

    // 1
    @NameInMap("current_page")
    public Long currentPage;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总页数 
    @NameInMap("total_pages")
    public Long totalPages;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    public static PagequeryProdsResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryProdsResponse self = new PagequeryProdsResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryProdsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryProdsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryProdsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryProdsResponse setProdMetaInfos(java.util.List<ProdMetaInfo> prodMetaInfos) {
        this.prodMetaInfos = prodMetaInfos;
        return this;
    }
    public java.util.List<ProdMetaInfo> getProdMetaInfos() {
        return this.prodMetaInfos;
    }

    public PagequeryProdsResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryProdsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryProdsResponse setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public PagequeryProdsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
