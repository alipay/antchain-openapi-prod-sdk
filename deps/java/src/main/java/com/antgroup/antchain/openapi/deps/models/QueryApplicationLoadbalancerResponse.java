// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryApplicationLoadbalancerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 负载均衡资源列表
    @NameInMap("loadbalancers")
    @Validation(required = true)
    public java.util.List<DepsLoadBalancer> loadbalancers;

    // 当前页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Integer pageNum;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Integer pageSize;

    // 应用总数
    @NameInMap("total_count")
    @Validation(required = true)
    public Integer totalCount;

    public static QueryApplicationLoadbalancerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationLoadbalancerResponse self = new QueryApplicationLoadbalancerResponse();
        return TeaModel.build(map, self);
    }

    public QueryApplicationLoadbalancerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApplicationLoadbalancerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApplicationLoadbalancerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApplicationLoadbalancerResponse setLoadbalancers(java.util.List<DepsLoadBalancer> loadbalancers) {
        this.loadbalancers = loadbalancers;
        return this;
    }
    public java.util.List<DepsLoadBalancer> getLoadbalancers() {
        return this.loadbalancers;
    }

    public QueryApplicationLoadbalancerResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryApplicationLoadbalancerResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryApplicationLoadbalancerResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
