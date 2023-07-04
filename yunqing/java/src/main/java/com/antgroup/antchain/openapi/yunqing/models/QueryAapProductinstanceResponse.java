// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QueryAapProductinstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // namespace
    @NameInMap("namespace")
    public String namespace;

    // prod code
    @NameInMap("prod_code")
    public String prodCode;

    // 产品实例名称
    @NameInMap("name")
    public String name;

    // 产品版本
    @NameInMap("prod_version")
    public String prodVersion;

    // 拓扑code
    @NameInMap("topology_code")
    public String topologyCode;

    // 拓扑名称
    @NameInMap("topology_name")
    public String topologyName;

    // 产品实例状态
    @NameInMap("status")
    public String status;

    // 应用实例列表
    @NameInMap("app_instances")
    public java.util.List<ApplicationMeta> appInstances;

    public static QueryAapProductinstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAapProductinstanceResponse self = new QueryAapProductinstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryAapProductinstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAapProductinstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAapProductinstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAapProductinstanceResponse setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryAapProductinstanceResponse setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryAapProductinstanceResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryAapProductinstanceResponse setProdVersion(String prodVersion) {
        this.prodVersion = prodVersion;
        return this;
    }
    public String getProdVersion() {
        return this.prodVersion;
    }

    public QueryAapProductinstanceResponse setTopologyCode(String topologyCode) {
        this.topologyCode = topologyCode;
        return this;
    }
    public String getTopologyCode() {
        return this.topologyCode;
    }

    public QueryAapProductinstanceResponse setTopologyName(String topologyName) {
        this.topologyName = topologyName;
        return this;
    }
    public String getTopologyName() {
        return this.topologyName;
    }

    public QueryAapProductinstanceResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAapProductinstanceResponse setAppInstances(java.util.List<ApplicationMeta> appInstances) {
        this.appInstances = appInstances;
        return this;
    }
    public java.util.List<ApplicationMeta> getAppInstances() {
        return this.appInstances;
    }

}
