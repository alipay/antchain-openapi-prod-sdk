// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QuerySlsLogResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // GetLogs的响应body是一个数组，数组中每个元素是一条日志结果
    @NameInMap("data")
    public java.util.List<SLSLogItem> data;

    // 页数
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 结果总数
    @NameInMap("total")
    public Long total;

    public static QuerySlsLogResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySlsLogResponse self = new QuerySlsLogResponse();
        return TeaModel.build(map, self);
    }

    public QuerySlsLogResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySlsLogResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySlsLogResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySlsLogResponse setData(java.util.List<SLSLogItem> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SLSLogItem> getData() {
        return this.data;
    }

    public QuerySlsLogResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QuerySlsLogResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QuerySlsLogResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
