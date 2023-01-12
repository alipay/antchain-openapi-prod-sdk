// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryAppGroupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询到的应用列表，包含每个应用的分组信息
    @NameInMap("data")
    public java.util.List<AppGroup> data;

    // 当前页
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 记录总数
    @NameInMap("total")
    public Long total;

    public static QueryAppGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppGroupResponse self = new QueryAppGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppGroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppGroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppGroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppGroupResponse setData(java.util.List<AppGroup> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AppGroup> getData() {
        return this.data;
    }

    public QueryAppGroupResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryAppGroupResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAppGroupResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
