// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryOpsappsvcResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用服务的运维历史
    @NameInMap("opsappsvcs")
    @Validation(required = true)
    public java.util.List<OpsApplication> opsappsvcs;

    // 当前页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Integer pageNum;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Integer pageSize;

    // 总数
    @NameInMap("total_count")
    @Validation(required = true)
    public Integer totalCount;

    public static QueryOpsappsvcResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOpsappsvcResponse self = new QueryOpsappsvcResponse();
        return TeaModel.build(map, self);
    }

    public QueryOpsappsvcResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOpsappsvcResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOpsappsvcResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOpsappsvcResponse setOpsappsvcs(java.util.List<OpsApplication> opsappsvcs) {
        this.opsappsvcs = opsappsvcs;
        return this;
    }
    public java.util.List<OpsApplication> getOpsappsvcs() {
        return this.opsappsvcs;
    }

    public QueryOpsappsvcResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryOpsappsvcResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryOpsappsvcResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
