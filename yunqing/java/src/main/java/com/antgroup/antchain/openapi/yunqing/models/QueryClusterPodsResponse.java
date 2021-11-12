// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QueryClusterPodsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 集群内部详情
    @NameInMap("cluster_info")
    public ClusterInfo clusterInfo;

    public static QueryClusterPodsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterPodsResponse self = new QueryClusterPodsResponse();
        return TeaModel.build(map, self);
    }

    public QueryClusterPodsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryClusterPodsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryClusterPodsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryClusterPodsResponse setClusterInfo(ClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
        return this;
    }
    public ClusterInfo getClusterInfo() {
        return this.clusterInfo;
    }

}
