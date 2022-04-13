// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QuerySidecaropsReleaseinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 所查询版本的实际sidecarConfig信息
    @NameInMap("sidecar_config")
    public SidecarConfig sidecarConfig;

    // 应用服务名
    @NameInMap("container_service_name")
    public String containerServiceName;

    // sidecar模板的版本号，与应用无关
    @NameInMap("sidecar_version")
    public String sidecarVersion;

    // 发布相关的应用参数，如feature等
    @NameInMap("param")
    public String param;

    // 发布所处状态
    @NameInMap("status")
    public String status;

    // 以时间戳生成的发布版本号
    @NameInMap("release_version")
    public String releaseVersion;

    // 上一个版本号
    @NameInMap("last_release_version")
    public String lastReleaseVersion;

    // 执行单号，调用方唯一确定一次发布的单号；
    @NameInMap("order_num")
    public String orderNum;

    public static QuerySidecaropsReleaseinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySidecaropsReleaseinfoResponse self = new QuerySidecaropsReleaseinfoResponse();
        return TeaModel.build(map, self);
    }

    public QuerySidecaropsReleaseinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySidecaropsReleaseinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySidecaropsReleaseinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySidecaropsReleaseinfoResponse setSidecarConfig(SidecarConfig sidecarConfig) {
        this.sidecarConfig = sidecarConfig;
        return this;
    }
    public SidecarConfig getSidecarConfig() {
        return this.sidecarConfig;
    }

    public QuerySidecaropsReleaseinfoResponse setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public QuerySidecaropsReleaseinfoResponse setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public QuerySidecaropsReleaseinfoResponse setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public QuerySidecaropsReleaseinfoResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QuerySidecaropsReleaseinfoResponse setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    public QuerySidecaropsReleaseinfoResponse setLastReleaseVersion(String lastReleaseVersion) {
        this.lastReleaseVersion = lastReleaseVersion;
        return this;
    }
    public String getLastReleaseVersion() {
        return this.lastReleaseVersion;
    }

    public QuerySidecaropsReleaseinfoResponse setOrderNum(String orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public String getOrderNum() {
        return this.orderNum;
    }

}
