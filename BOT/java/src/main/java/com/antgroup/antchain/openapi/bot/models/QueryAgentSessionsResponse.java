// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryAgentSessionsResponse extends TeaModel {
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

    // 会话集合
    @NameInMap("list")
    public java.util.List<AgentSessionVO> list;

    public static QueryAgentSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAgentSessionsResponse self = new QueryAgentSessionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAgentSessionsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAgentSessionsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAgentSessionsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAgentSessionsResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryAgentSessionsResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryAgentSessionsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAgentSessionsResponse setPages(Long pages) {
        this.pages = pages;
        return this;
    }
    public Long getPages() {
        return this.pages;
    }

    public QueryAgentSessionsResponse setList(java.util.List<AgentSessionVO> list) {
        this.list = list;
        return this;
    }
    public java.util.List<AgentSessionVO> getList() {
        return this.list;
    }

}
