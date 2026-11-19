// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryTrustiotSkugrantwhitelistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 实际返回页码
    @NameInMap("page_index")
    public Long pageIndex;

    // 本页页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 结果总数
    @NameInMap("total_size")
    public Long totalSize;

    // 总页数，向上取整
    @NameInMap("total_pages")
    public Long totalPages;

    // 当前页名单。零结果时返回空数组 []
    @NameInMap("sn_list")
    public java.util.List<SnWhiteListItem> snList;

    public static QueryTrustiotSkugrantwhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTrustiotSkugrantwhitelistResponse self = new QueryTrustiotSkugrantwhitelistResponse();
        return TeaModel.build(map, self);
    }

    public QueryTrustiotSkugrantwhitelistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTrustiotSkugrantwhitelistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTrustiotSkugrantwhitelistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTrustiotSkugrantwhitelistResponse setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryTrustiotSkugrantwhitelistResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTrustiotSkugrantwhitelistResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryTrustiotSkugrantwhitelistResponse setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public QueryTrustiotSkugrantwhitelistResponse setSnList(java.util.List<SnWhiteListItem> snList) {
        this.snList = snList;
        return this;
    }
    public java.util.List<SnWhiteListItem> getSnList() {
        return this.snList;
    }

}
