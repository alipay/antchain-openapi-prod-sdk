// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryCollectorJtfluxResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 1
    @NameInMap("page_index")
    public Long pageIndex;

    // 单页数量
    @NameInMap("page_size")
    public Long pageSize;

    // 总记录数
    @NameInMap("total_size")
    public Long totalSize;

    // 总页数
    @NameInMap("total_pages")
    public Long totalPages;

    // 部标数据列表
    @NameInMap("page_data")
    public java.util.List<JtData> pageData;

    // 聚合统计指标
    @NameInMap("extra_data")
    public JtExtraData extraData;

    public static QueryCollectorJtfluxResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCollectorJtfluxResponse self = new QueryCollectorJtfluxResponse();
        return TeaModel.build(map, self);
    }

    public QueryCollectorJtfluxResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCollectorJtfluxResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCollectorJtfluxResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCollectorJtfluxResponse setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryCollectorJtfluxResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCollectorJtfluxResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryCollectorJtfluxResponse setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public QueryCollectorJtfluxResponse setPageData(java.util.List<JtData> pageData) {
        this.pageData = pageData;
        return this;
    }
    public java.util.List<JtData> getPageData() {
        return this.pageData;
    }

    public QueryCollectorJtfluxResponse setExtraData(JtExtraData extraData) {
        this.extraData = extraData;
        return this;
    }
    public JtExtraData getExtraData() {
        return this.extraData;
    }

}
