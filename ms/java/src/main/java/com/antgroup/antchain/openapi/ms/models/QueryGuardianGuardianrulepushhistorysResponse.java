// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryGuardianGuardianrulepushhistorysResponse extends TeaModel {
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

    // 推送历史列表
    @NameInMap("push_histories")
    public java.util.List<PushHistory> pushHistories;

    // 起始索引
    @NameInMap("start_index")
    public Long startIndex;

    // 总页数
    @NameInMap("total_size")
    public Long totalSize;

    public static QueryGuardianGuardianrulepushhistorysResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGuardianGuardianrulepushhistorysResponse self = new QueryGuardianGuardianrulepushhistorysResponse();
        return TeaModel.build(map, self);
    }

    public QueryGuardianGuardianrulepushhistorysResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryGuardianGuardianrulepushhistorysResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryGuardianGuardianrulepushhistorysResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryGuardianGuardianrulepushhistorysResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryGuardianGuardianrulepushhistorysResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryGuardianGuardianrulepushhistorysResponse setPushHistories(java.util.List<PushHistory> pushHistories) {
        this.pushHistories = pushHistories;
        return this;
    }
    public java.util.List<PushHistory> getPushHistories() {
        return this.pushHistories;
    }

    public QueryGuardianGuardianrulepushhistorysResponse setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryGuardianGuardianrulepushhistorysResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

}
