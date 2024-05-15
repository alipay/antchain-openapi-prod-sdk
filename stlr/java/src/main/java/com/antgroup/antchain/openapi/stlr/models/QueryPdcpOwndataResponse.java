// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryPdcpOwndataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总记录条数
    @NameInMap("total")
    public Long total;

    // 当前分页
    @NameInMap("page_number")
    public Long pageNumber;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 数据记录列表
    @NameInMap("data_list")
    public java.util.List<String> dataList;

    public static QueryPdcpOwndataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPdcpOwndataResponse self = new QueryPdcpOwndataResponse();
        return TeaModel.build(map, self);
    }

    public QueryPdcpOwndataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPdcpOwndataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPdcpOwndataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPdcpOwndataResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryPdcpOwndataResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryPdcpOwndataResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryPdcpOwndataResponse setDataList(java.util.List<String> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<String> getDataList() {
        return this.dataList;
    }

}
