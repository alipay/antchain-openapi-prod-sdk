// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class TransparentProxyAppVo extends TeaModel {
    // 透明劫持配置
    @NameInMap("app_config")
    public TransparentProxyAppConfig appConfig;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 应用 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 租户实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 节点数
    @NameInMap("node_num")
    @Validation(required = true)
    public Long nodeNum;

    // 打开透明劫持的节点数
    @NameInMap("open_num")
    @Validation(required = true)
    public Long openNum;

    // 运行透明劫持的节点数
    @NameInMap("run_num")
    @Validation(required = true)
    public Long runNum;

    // 应用支持的协议
    @NameInMap("support_protocols")
    public java.util.List<TransparentProxyProtocolVo> supportProtocols;

    public static TransparentProxyAppVo build(java.util.Map<String, ?> map) throws Exception {
        TransparentProxyAppVo self = new TransparentProxyAppVo();
        return TeaModel.build(map, self);
    }

    public TransparentProxyAppVo setAppConfig(TransparentProxyAppConfig appConfig) {
        this.appConfig = appConfig;
        return this;
    }
    public TransparentProxyAppConfig getAppConfig() {
        return this.appConfig;
    }

    public TransparentProxyAppVo setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public TransparentProxyAppVo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public TransparentProxyAppVo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TransparentProxyAppVo setNodeNum(Long nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }
    public Long getNodeNum() {
        return this.nodeNum;
    }

    public TransparentProxyAppVo setOpenNum(Long openNum) {
        this.openNum = openNum;
        return this;
    }
    public Long getOpenNum() {
        return this.openNum;
    }

    public TransparentProxyAppVo setRunNum(Long runNum) {
        this.runNum = runNum;
        return this;
    }
    public Long getRunNum() {
        return this.runNum;
    }

    public TransparentProxyAppVo setSupportProtocols(java.util.List<TransparentProxyProtocolVo> supportProtocols) {
        this.supportProtocols = supportProtocols;
        return this;
    }
    public java.util.List<TransparentProxyProtocolVo> getSupportProtocols() {
        return this.supportProtocols;
    }

}
