// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryOperationlogResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总数。
    @NameInMap("total_count")
    public Long totalCount;

    // 页码
    @NameInMap("page_no")
    public Long pageNo;

    // 每页行数
    @NameInMap("page_size")
    public Long pageSize;

    // operationlog列表
    @NameInMap("list")
    public java.util.List<OperationLog> list;

    public static QueryOperationlogResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOperationlogResponse self = new QueryOperationlogResponse();
        return TeaModel.build(map, self);
    }

    public QueryOperationlogResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOperationlogResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOperationlogResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOperationlogResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryOperationlogResponse setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryOperationlogResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryOperationlogResponse setList(java.util.List<OperationLog> list) {
        this.list = list;
        return this;
    }
    public java.util.List<OperationLog> getList() {
        return this.list;
    }

}
