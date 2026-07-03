// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotAgentchatHistoryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分页结果总数
    @NameInMap("total")
    public Long total;

    // 当前页码 （从第一页开始）
    @NameInMap("page_num")
    public Long pageNum;

    // 每页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总页数
    @NameInMap("pages")
    public Long pages;

    // 对话内容集合
    @NameInMap("list")
    public java.util.List<AiAgentChatHistoryBO> list;

    public static QueryBlockchainBotAgentchatHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotAgentchatHistoryResponse self = new QueryBlockchainBotAgentchatHistoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotAgentchatHistoryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockchainBotAgentchatHistoryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockchainBotAgentchatHistoryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockchainBotAgentchatHistoryResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryBlockchainBotAgentchatHistoryResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryBlockchainBotAgentchatHistoryResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryBlockchainBotAgentchatHistoryResponse setPages(Long pages) {
        this.pages = pages;
        return this;
    }
    public Long getPages() {
        return this.pages;
    }

    public QueryBlockchainBotAgentchatHistoryResponse setList(java.util.List<AiAgentChatHistoryBO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<AiAgentChatHistoryBO> getList() {
        return this.list;
    }

}
