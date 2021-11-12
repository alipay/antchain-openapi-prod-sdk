// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QuerySolutioninstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 解决方案
    @NameInMap("solution_instances")
    public java.util.List<SolutionInstance> solutionInstances;

    // 当前页码。
    // 
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小。
    // 
    @NameInMap("page_size")
    public Long pageSize;

    // 服务实例总数。
    // 
    @NameInMap("total_count")
    public Long totalCount;

    public static QuerySolutioninstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySolutioninstanceResponse self = new QuerySolutioninstanceResponse();
        return TeaModel.build(map, self);
    }

    public QuerySolutioninstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySolutioninstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySolutioninstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySolutioninstanceResponse setSolutionInstances(java.util.List<SolutionInstance> solutionInstances) {
        this.solutionInstances = solutionInstances;
        return this;
    }
    public java.util.List<SolutionInstance> getSolutionInstances() {
        return this.solutionInstances;
    }

    public QuerySolutioninstanceResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QuerySolutioninstanceResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QuerySolutioninstanceResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
