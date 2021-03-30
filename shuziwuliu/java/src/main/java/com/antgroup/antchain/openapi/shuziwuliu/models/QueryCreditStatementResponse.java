// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditStatementResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 页数 从1开始
    @NameInMap("page_num")
    public Long pageNum;

    // 每页显示数量
    @NameInMap("page_size")
    public Long pageSize;

    // 流水列表
    @NameInMap("statement_infos")
    public java.util.List<StatementInfo> statementInfos;

    // 数据总量
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryCreditStatementResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditStatementResponse self = new QueryCreditStatementResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreditStatementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreditStatementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreditStatementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreditStatementResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryCreditStatementResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCreditStatementResponse setStatementInfos(java.util.List<StatementInfo> statementInfos) {
        this.statementInfos = statementInfos;
        return this;
    }
    public java.util.List<StatementInfo> getStatementInfos() {
        return this.statementInfos;
    }

    public QueryCreditStatementResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
