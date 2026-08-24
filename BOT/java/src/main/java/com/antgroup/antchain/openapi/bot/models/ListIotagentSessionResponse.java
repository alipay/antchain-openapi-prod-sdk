// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ListIotagentSessionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // session 信息
    @NameInMap("session_list")
    public java.util.List<SessionInfo> sessionList;

    // 总数
    @NameInMap("total")
    public Long total;

    // 总页数
    @NameInMap("pages")
    public Long pages;

    // 当前页面
    @NameInMap("page_index")
    public Long pageIndex;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    public static ListIotagentSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIotagentSessionResponse self = new ListIotagentSessionResponse();
        return TeaModel.build(map, self);
    }

    public ListIotagentSessionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListIotagentSessionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListIotagentSessionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListIotagentSessionResponse setSessionList(java.util.List<SessionInfo> sessionList) {
        this.sessionList = sessionList;
        return this;
    }
    public java.util.List<SessionInfo> getSessionList() {
        return this.sessionList;
    }

    public ListIotagentSessionResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListIotagentSessionResponse setPages(Long pages) {
        this.pages = pages;
        return this;
    }
    public Long getPages() {
        return this.pages;
    }

    public ListIotagentSessionResponse setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListIotagentSessionResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
