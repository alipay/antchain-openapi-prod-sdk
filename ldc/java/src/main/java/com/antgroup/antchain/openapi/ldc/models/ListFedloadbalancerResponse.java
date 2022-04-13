// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListFedloadbalancerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 联邦负载均衡实例列表
    @NameInMap("fed_loadbalancer_list")
    public java.util.List<FedLoadBalancer> fedLoadbalancerList;

    // 查询到的联邦负载均衡实例总数
    @NameInMap("total_count")
    public Long totalCount;

    public static ListFedloadbalancerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFedloadbalancerResponse self = new ListFedloadbalancerResponse();
        return TeaModel.build(map, self);
    }

    public ListFedloadbalancerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListFedloadbalancerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListFedloadbalancerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListFedloadbalancerResponse setFedLoadbalancerList(java.util.List<FedLoadBalancer> fedLoadbalancerList) {
        this.fedLoadbalancerList = fedLoadbalancerList;
        return this;
    }
    public java.util.List<FedLoadBalancer> getFedLoadbalancerList() {
        return this.fedLoadbalancerList;
    }

    public ListFedloadbalancerResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
