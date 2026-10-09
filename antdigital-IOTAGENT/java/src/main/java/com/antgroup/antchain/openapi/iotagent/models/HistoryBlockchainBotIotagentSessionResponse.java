// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class HistoryBlockchainBotIotagentSessionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 会话历史
    @NameInMap("session_list")
    public String sessionList;

    // 总条数
    @NameInMap("total")
    public Long total;

    // 总页数
    @NameInMap("pages")
    public Long pages;

    // 当前页
    @NameInMap("page_index")
    public Long pageIndex;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    public static HistoryBlockchainBotIotagentSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        HistoryBlockchainBotIotagentSessionResponse self = new HistoryBlockchainBotIotagentSessionResponse();
        return TeaModel.build(map, self);
    }

    public HistoryBlockchainBotIotagentSessionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public HistoryBlockchainBotIotagentSessionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public HistoryBlockchainBotIotagentSessionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public HistoryBlockchainBotIotagentSessionResponse setSessionList(String sessionList) {
        this.sessionList = sessionList;
        return this;
    }
    public String getSessionList() {
        return this.sessionList;
    }

    public HistoryBlockchainBotIotagentSessionResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public HistoryBlockchainBotIotagentSessionResponse setPages(Long pages) {
        this.pages = pages;
        return this;
    }
    public Long getPages() {
        return this.pages;
    }

    public HistoryBlockchainBotIotagentSessionResponse setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public HistoryBlockchainBotIotagentSessionResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
