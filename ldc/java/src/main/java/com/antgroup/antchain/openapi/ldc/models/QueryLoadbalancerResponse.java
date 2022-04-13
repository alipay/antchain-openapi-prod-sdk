// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryLoadbalancerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 负载均衡实例列表。
    @NameInMap("load_balancers")
    public java.util.List<LoadBalancerInstance> loadBalancers;

    public static QueryLoadbalancerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLoadbalancerResponse self = new QueryLoadbalancerResponse();
        return TeaModel.build(map, self);
    }

    public QueryLoadbalancerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLoadbalancerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLoadbalancerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLoadbalancerResponse setLoadBalancers(java.util.List<LoadBalancerInstance> loadBalancers) {
        this.loadBalancers = loadBalancers;
        return this;
    }
    public java.util.List<LoadBalancerInstance> getLoadBalancers() {
        return this.loadBalancers;
    }

}
