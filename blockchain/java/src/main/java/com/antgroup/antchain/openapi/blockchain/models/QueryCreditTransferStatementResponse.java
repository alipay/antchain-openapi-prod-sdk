// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryCreditTransferStatementResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 需查询对象的分布式数字身份
    @NameInMap("did")
    public String did;

    // 页数 从1开始
    @NameInMap("page_num")
    public Long pageNum;

    // 每页显示数量
    @NameInMap("page_size")
    public Long pageSize;

    // 流水列表
    @NameInMap("statement_infos")
    public java.util.List<CreditTransferStatementInfo> statementInfos;

    // 数据总量
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryCreditTransferStatementResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditTransferStatementResponse self = new QueryCreditTransferStatementResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreditTransferStatementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreditTransferStatementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreditTransferStatementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreditTransferStatementResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryCreditTransferStatementResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryCreditTransferStatementResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCreditTransferStatementResponse setStatementInfos(java.util.List<CreditTransferStatementInfo> statementInfos) {
        this.statementInfos = statementInfos;
        return this;
    }
    public java.util.List<CreditTransferStatementInfo> getStatementInfos() {
        return this.statementInfos;
    }

    public QueryCreditTransferStatementResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
