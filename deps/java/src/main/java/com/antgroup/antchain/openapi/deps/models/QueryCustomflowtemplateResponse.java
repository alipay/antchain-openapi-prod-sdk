// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryCustomflowtemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数量
    @NameInMap("total_size")
    public Long totalSize;

    // 页吗
    @NameInMap("page_no")
    public Long pageNo;

    // 每页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 结果列表
    @NameInMap("list")
    public java.util.List<OpsCustomFlowTemplate> list;

    public static QueryCustomflowtemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomflowtemplateResponse self = new QueryCustomflowtemplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryCustomflowtemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCustomflowtemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCustomflowtemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCustomflowtemplateResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryCustomflowtemplateResponse setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryCustomflowtemplateResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCustomflowtemplateResponse setList(java.util.List<OpsCustomFlowTemplate> list) {
        this.list = list;
        return this;
    }
    public java.util.List<OpsCustomFlowTemplate> getList() {
        return this.list;
    }

}
