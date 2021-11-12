// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QueryClusterKubeconfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // kube_config
    @NameInMap("kube_config")
    public String kubeConfig;

    public static QueryClusterKubeconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterKubeconfigResponse self = new QueryClusterKubeconfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryClusterKubeconfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryClusterKubeconfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryClusterKubeconfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryClusterKubeconfigResponse setKubeConfig(String kubeConfig) {
        this.kubeConfig = kubeConfig;
        return this;
    }
    public String getKubeConfig() {
        return this.kubeConfig;
    }

}
